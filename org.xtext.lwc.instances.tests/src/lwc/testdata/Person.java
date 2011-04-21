package lwc.testdata;
import java.util.Date;


public class Person {
	
	private String name;
	private String firstname;
	private Date birthdate;
	private Car ownedCar;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public Car getOwnedCar() {
		return ownedCar;
	}
	public void setOwnedCar(Car car) {
		this.ownedCar = car;
	}
	
	
}
