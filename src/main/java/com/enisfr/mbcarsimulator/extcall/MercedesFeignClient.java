package com.enisfr.mbcarsimulator.extcall;

import com.enisfr.mbcarsimulator.config.MercedesFeignClientConfig;
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
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(path = "/vehicles", name = "${mercedes.feign.name}", url = "${mercedes.feign.url}", configuration = MercedesFeignClientConfig.class)
public interface MercedesFeignClient {

  @GetMapping
  ResponseEntity<List<BaseVehicle>> getAllVehicles();

  @GetMapping("/{id}")
  ResponseEntity<Vehicle> getVehicle(@PathVariable String id);

  @GetMapping("/{id}/tires")
  ResponseEntity<TirePressure> getTiresStatus(@PathVariable String id);

  @GetMapping("/{id}/location")
  ResponseEntity<Location> getVehicleLocation(@PathVariable String id);

  @GetMapping("/{id}/odometer")
  ResponseEntity<Odometer> getVehicleOdometer(@PathVariable String id);

  @GetMapping("/{id}/fuel")
  ResponseEntity<Fuel> getVehicleFuel(@PathVariable String id);

  @GetMapping("/{id}/stateofcharge")
  ResponseEntity<Battery> getVehicleBattery(@PathVariable String id);

  @GetMapping("/{id}/doors")
  ResponseEntity<DoorStatus> getVehicleDoorStatus(@PathVariable String id);

  @PostMapping("/{id}/doors")
  ResponseEntity<Status> changeVehicleDoorStatus(@PathVariable String id, @RequestBody Command command);
}
