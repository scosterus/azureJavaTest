package nl.azureTest.azureJava.snel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TreinEndpoint {
	@Autowired
	TreinRepository tr;
	
	@GetMapping("eerste")
	public Trein go(){
		Trein trein = new Trein();
		trein.setSnelheid(24);
		trein.setNaam("Thomas");
		tr.save(trein);
		return trein;
	}
}
