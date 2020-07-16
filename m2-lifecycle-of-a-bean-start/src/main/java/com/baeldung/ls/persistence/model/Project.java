package com.baeldung.ls.persistence.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Project {

    private Long id;

    private String name;

    private LocalDate dateCreated;

    public Project(Long id, String name, LocalDate dateCreated) {
        if(Objects.isNull(id)) {
            id = new Random().nextLong();
        }
        this.id = id;
        this.name = name;
        this.dateCreated = dateCreated;
    }

    public Project(String name, LocalDate dateCreated) {
        this(null, name, dateCreated);
    }

    public Project(Project project) {
        this(project.getId(), project.getName(), project.getDateCreated());
    }

}
