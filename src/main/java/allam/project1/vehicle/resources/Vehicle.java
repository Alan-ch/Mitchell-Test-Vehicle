package allam.project1.vehicle.resources;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import allam.project1.vehicle.module.VehicleModule;
import allam.project1.vehicle.service.VehicleService;

import java.util.List;

@Path("/vehicles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Vehicle {
	
	VehicleService vehicleService = new VehicleService();
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<VehicleModule> getJsonVehicles(@QueryParam("make") String make){
    	if(make == null){
        	return vehicleService.getAllVehicles();
         	}
    	return vehicleService.getAllVehicleByMake(make);
	}
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
  	public List<VehicleModule> getXmlVehicles(@QueryParam("make") String make){
      	if(make == null){
          	return vehicleService.getAllVehicles();
           	}
      	return vehicleService.getAllVehicleByMake(make);
  	}
    
    @GET
    @Path("/{VehicleModuleId}")
	public VehicleModule getOneVehicle(@PathParam("VehicleModuleId") int VehicleModuleID){
		return vehicleService.getVehicleModule(VehicleModuleID);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/{VehicleModuleId}")
	public VehicleModule getXmlOneVehicle(@PathParam("VehicleModuleId") int VehicleModuleID){
		return vehicleService.getVehicleModule(VehicleModuleID);
    }
    
    @POST
    public VehicleModule addVehicle(@Valid VehicleModule VM){
    	    
    	return vehicleService.addVehicleModule(VM);
    	     
    	   }
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public VehicleModule addXmlVehicle(@Valid VehicleModule VM){
    	    
    	return vehicleService.addVehicleModule(VM);
    	     
    	   }
    
    @DELETE
    @Path("/{VehicleModuleId}")
	public VehicleModule deleteOneVehicle(@PathParam("VehicleModuleId") int VehicleModuleID){
		return vehicleService.removeVehicleModule(VehicleModuleID);
    }
    
    @DELETE
    @Produces(MediaType.APPLICATION_XML)
    @Path("/{VehicleModuleId}")
	public VehicleModule deleteXmlOneVehicle(@PathParam("VehicleModuleId") int VehicleModuleID){
		return vehicleService.removeVehicleModule(VehicleModuleID);
    }
    
    @PUT
    @Path("/{VehicleModuleId}")
    public VehicleModule updateVehicle(@PathParam("VehicleModuleId") int VehicleModuleID,VehicleModule VM){
    	VM.setId(VehicleModuleID);
    	return vehicleService.updateVehicleModule(VM);
    	     
    	   }
    
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    @Path("/{VehicleModuleId}")
    public VehicleModule updateXmlVehicle(@PathParam("VehicleModuleId") int VehicleModuleID,VehicleModule VM){
    	VM.setId(VehicleModuleID);
    	return vehicleService.updateVehicleModule(VM);
    	     
    	   }
    
    
    
	
}
