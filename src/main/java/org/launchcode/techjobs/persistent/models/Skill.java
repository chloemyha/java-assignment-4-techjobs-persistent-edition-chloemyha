package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {
    @NotBlank(message = "This field cannot be blank")
    @Size(min = 3)
    private String description;

    public Skill(@NotBlank(message = "This field cannot be blank")@Size(min = 3)String description){
        this.description=description;
    }
    public Skill(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}