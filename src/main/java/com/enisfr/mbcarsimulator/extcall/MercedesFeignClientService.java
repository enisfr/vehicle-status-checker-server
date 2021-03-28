package com.enisfr.mbcarsimulator.extcall;

import com.enisfr.mbcarsimulator.model.BaseVehicle;
import com.enisfr.mbcarsimulator.model.Battery;
import com.enisfr.mbcarsimulator.model.Command;
import com.enisfr.mbcarsimulator.model.DoorStatus;
import com.enisfr.mbcarsimulator.model.Fuel;
import com.enisfr.mbcarsimulator.model.Location;
import com.enisfr.mbcarsimulator.model.Odometer;
import com.enisfr.mbcarsimulator.model.Status;
import com.enisfr.mbcarsimulator.model.TirePressure;
import com.enisfr.mbcarsimulator.model.Vehicle;
import java.util.List;

public interface MercedesFeignClientService {

  List<BaseVehicle> getAllVehicles();

  Vehicle getVehicle(String id);

  TirePressure getTiresStatus(String id);

  Location getVehicleLocation(String id);

  Odometer getVehicleOdometer(String id);

  Fuel getVehicleFuel(String id);

  Battery getVehicleBattery(String id);

  DoorStatus getVehicleDoorStatus(String id);

  Status changeVehicleDoorStatus(String id, Command command);

}
