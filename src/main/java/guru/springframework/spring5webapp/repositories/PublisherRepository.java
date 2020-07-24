package guru.springframework.spring5webapp.repositories;

/* Created by SK on 7/24/20 */


import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
