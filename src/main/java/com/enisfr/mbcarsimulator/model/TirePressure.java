package com.enisfr.mbcarsimulator.model;

import lombok.Data;

@Data
public class TirePressure {
  private TirePressureUnit tirepressurefrontleft;
  private TirePressureUnit tirepressurefrontright;
  private TirePressureUnit tirepressurerearright;
  private TirePressureUnit tirepressurerearleft;
}
