package com.enisfr.mbcarsimulator.model;

import lombok.Data;

@Data
public class OdometerUnit extends BaseUnit {

  private Integer value;
  private String unit;
}
