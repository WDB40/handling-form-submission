package greeting.model;

import org.springframework.data.repository.CrudRepository;

public interface GreetingRepository extends CrudRepository <Greeting, Integer> {
}
