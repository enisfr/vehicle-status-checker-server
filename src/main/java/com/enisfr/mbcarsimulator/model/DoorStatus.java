package com.enisfr.mbcarsimulator.model;

import lombok.Data;

@Data
public class DoorStatus {

  private DoorStatusUnit doorstatusfrontleft;
  private DoorStatusUnit doorlockstatusfrontleft;
  private DoorStatusUnit doorstatusfrontright;
  private DoorStatusUnit doorlockstatusfrontright;
  private DoorStatusUnit doorstatusrearright;
  private DoorStatusUnit doorlockstatusrearright;
  private DoorStatusUnit doorstatusrearleft;
  private DoorStatusUnit doorlockstatusrearleft;
  private DoorStatusUnit doorlockstatusdecklid;
  private DoorStatusUnit doorlockstatusgas;
  private DoorStatusUnit doorlockstatusvehicle;

}
