package com.enisfr.mbcarsimulator.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Location {

  private LocationUnit longitude;
  private LocationUnit latitude;
  private LocationUnit heading;
}
