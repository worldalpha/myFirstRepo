package winter.springboot.id1006.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import winter.springboot.id1006.model.collection;

public interface repository extends MongoRepository<collection,String> {

}
