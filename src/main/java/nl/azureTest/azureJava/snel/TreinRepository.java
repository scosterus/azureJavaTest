package nl.azureTest.azureJava.snel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TreinRepository extends CrudRepository<Trein, Long>{

}
