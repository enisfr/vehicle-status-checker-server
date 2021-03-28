package com.enisfr.mbcarsimulator.service;

import com.enisfr.mbcarsimulator.extcall.MercedesFeignClientService;
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
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService {

    private final MercedesFeignClientService mercedesFeignClientService;

    @Override
    public List<BaseVehicle> getAllVehicles() {
        return mercedesFeignClientService.getAllVehicles();
    }

    @Override
    public Vehicle getVehicle(String id) {
        return mercedesFeignClientService.getVehicle(id);
    }

  @Override
  public TirePressure getTiresStatus(String id) {
    return mercedesFeignClientService.getTiresStatus(id);
  }

  @Override
  public Location getVehicleLocation(String id) {
    return mercedesFeignClientService.getVehicleLocation(id);

  }

  @Override
  public Odometer getVehicleOdometer(String id) {
    return mercedesFeignClientService.getVehicleOdometer(id);
  }

  @Override
  public Fuel getVehicleFuel(String id) {
    return mercedesFeignClientService.getVehicleFuel(id);
  }

  @Override
  public Battery getVehicleBattery(String id) {
    return mercedesFeignClientService.getVehicleBattery(id);
  }

  @Override
  public DoorStatus getVehicleDoorStatus(String id) {
    return mercedesFeignClientService.getVehicleDoorStatus(id);
  }

  @Override
  public Status changeVehicleDoorStatus(String id, Command command) {
    return mercedesFeignClientService.changeVehicleDoorStatus(id, command);

  }
}
