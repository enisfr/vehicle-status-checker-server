package com.enisfr.mbcarsimulator.model;

import lombok.Data;

@Data
public class Odometer {
  private OdometerUnit odometer;
  private OdometerUnit distancesincereset;
  private OdometerUnit distancesincestart;
}
