package com.mms.starterMongoDB;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "User")
public class User {
    @Id
    private String id;
    private String name;
    private String cod;
    private int edad;

}
