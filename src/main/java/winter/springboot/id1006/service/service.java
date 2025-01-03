package winter.springboot.id1006.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import winter.springboot.id1006.model.collection;
import winter.springboot.id1006.repository.repository;

@Service
public class service {
    
    @Autowired
    private repository repositoryobject;

    public void saveDetails(collection collectionobject){
        repositoryobject.save(collectionobject);
    }

}
