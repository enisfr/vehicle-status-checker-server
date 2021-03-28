package com.enisfr.mbcarsimulator.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Response {

  private String message;
  private Object data;

}
