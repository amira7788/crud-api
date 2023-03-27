package com.tachla.CRUD.managecrudbackendapi.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(Todo.builder().id(1)
                .username("user1")
                .description("learn spring3")
                .targetDate(LocalDate.now().plusYears(1))
                .build());
        todos.add(Todo.builder().id(2)
                .username("user2")
                .description("learn spring3")
                .targetDate(LocalDate.now().plusYears(1))
                .build());
        todos.add(Todo.builder().id(3)
                .username("user3")
                .description("learn spring3")
                .targetDate(LocalDate.now().plusYears(1))
                .build());
    }

    public List<Todo> findByUserName(String name) {
        return todos;
    }
}
