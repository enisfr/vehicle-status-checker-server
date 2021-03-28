package com.enisfr.mbcarsimulator.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.http.MediaType;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Objects;

public class MercedesFeignClientInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("Authorization", getBearerTokenHeader());
        requestTemplate.header("Content-Type", MediaType.APPLICATION_JSON_VALUE);
    }

    public static String getBearerTokenHeader() {
        return ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest().getHeader("Authorization");
    }
}
