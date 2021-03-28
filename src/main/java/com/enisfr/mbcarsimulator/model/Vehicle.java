package com.enisfr.mbcarsimulator.model;

import lombok.Data;

@Data
public class Vehicle extends BaseVehicle {

  private String salesdesignation;
  private String nickname;
  private String modelyear;
  private String colorname;
  private String fueltype;
  private String powerhp;
  private String powerkw;
  private String numberofdoors;
  private String numberofseats;
}
