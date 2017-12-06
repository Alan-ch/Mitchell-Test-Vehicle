package allam.project1.vehicle.database;

import java.util.HashMap;
import java.util.Map;

import allam.project1.vehicle.module.VehicleModule;

public class DatabaseClass {

	private static Map<Integer,VehicleModule> vehiclesModules = new HashMap<>();
	
	public static Map<Integer,VehicleModule> getVehiclesModules(){
		return vehiclesModules;
	}
}
