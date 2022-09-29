package nl.azureTest.azureJava.snel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trein {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	String naam;
	int snelheid;
	
	//getters and setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public int getSnelheid() {
		return snelheid;
	}
	public void setSnelheid(int snelheid) {
		this.snelheid = snelheid;
	}
	
	
}
