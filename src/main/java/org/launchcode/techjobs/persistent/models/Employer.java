package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {
    @Size(min=3,max=200,message = "Employer must have at least 3 characters")
    @NotBlank(message = "This field cannot be blank")
    private String location;

    public Employer(@Size(min=3,max=200,message = "Employer must have at least 3 characters")@NotBlank(message = "This field cannot be blank")String location){
        this.location=location;
    }
    public Employer(){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
