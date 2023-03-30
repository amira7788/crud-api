package com.tachla.CRUD.managecrudbackendapi.todo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;


@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class Todo {

    @Id
    @GeneratedValue
    private int id;
    private String username;

    @Size(min=10, message="Enter atleast 10 caracter")
    @Column
    private String description;
    @Column
    private LocalDate targetDate;

    @Column
    private boolean done;

    public Todo(int id, String username, String description, LocalDate targetDate, boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }
}
