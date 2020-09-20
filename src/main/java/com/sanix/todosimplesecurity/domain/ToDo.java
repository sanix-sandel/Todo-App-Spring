package com.sanix.todosimplesecurity.domain;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
public class ToDo {

    @Id
    @GeneratedValue(generator="System-uuid")
    private String id;

    @NotNull
    @NotBlank
    private String description;

    @Column(insertable=true, updatable=false)
    private LocalDateTime created;

    private LocalDateTime modified;

    private boolean completed;

    public ToDo() {}

    public ToDo(String description) {
        this.description = description;
    }

    @PrePersist
    void onCreate(){
        this.setCreated(LocalDateTime.now());
        this.setModified(LocalDateTime.now());
    }

    @PreUpdate
    void onUpdate(){
        this.setModified(LocalDateTime.now());
    }
}
