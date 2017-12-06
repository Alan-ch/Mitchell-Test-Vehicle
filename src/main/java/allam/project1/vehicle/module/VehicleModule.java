package allam.project1.vehicle.module;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class VehicleModule {
   

	private int Id;
	
	@Size(min=1950, max=2050)
	private int year;
	
	@NotNull
	private String Model;
	
	@NotNull
	private String Make;
	
	public VehicleModule(){
		
	}
	public VehicleModule(int id, int year, String model, String make) {
		Id = id;
		this.year = year;
		Model = model;
		Make = make;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	
	 
}
