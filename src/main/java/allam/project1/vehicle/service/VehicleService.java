package allam.project1.vehicle.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import allam.project1.vehicle.database.DatabaseClass;
import allam.project1.vehicle.module.VehicleModule;

public class VehicleService {
	
	private Map<Integer, VehicleModule> vehicles = DatabaseClass.getVehiclesModules();
	
    public VehicleService(){
		  vehicles.put(1,new VehicleModule(1,2017,"coupe","Mercedes"));
		  vehicles.put(2,new VehicleModule(2,2017,"coupe","BMW"));
      	}
	
	public List<VehicleModule> getAllVehicles(){
		return new ArrayList<VehicleModule>(vehicles.values());
	}
	
	public VehicleModule getVehicleModule(int id){
		return vehicles.get(id);
	}
	public VehicleModule addVehicleModule( VehicleModule VM){
		VM.setId(vehicles.size() + 1);
		vehicles.put(VM.getId(),VM);
		return VM;
	}
	public VehicleModule updateVehicleModule( VehicleModule VM){
		if(VM.getId() <= 0){
			return null;
		}
		vehicles.put(VM.getId(),VM);
		return VM;
	}
	public VehicleModule removeVehicleModule(int id){
		return vehicles.remove(id);
	} 
	
	// filtering by make
	public List<VehicleModule> getAllVehicleByMake(String make){
		List<VehicleModule> listOfVehicle = new ArrayList<>();
		for(VehicleModule vehicle: vehicles.values()){
			if(vehicle.getMake().equals(make)){
				listOfVehicle.add(vehicle);
			}
		}
		return listOfVehicle;
		
	}
	
	
}
   

