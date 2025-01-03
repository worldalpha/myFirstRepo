package winter.springboot.id1006.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "employee")
public class collection {

    @Id
    private String employeeid;
    private String employeename;
    private String department;
    private int salary;
    private String location;

    
}
