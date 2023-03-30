package com.tachla.CRUD.managecrudbackendapi.todo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todoCount = 0;
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

        Predicate<? super Todo> predicate = todo ->
                todo.getUsername().equalsIgnoreCase(name);

        return todos.stream().filter(predicate).toList();
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        todos.add(Todo.builder().id(++todoCount)
                .username(username)
                .description(description)
                .targetDate(targetDate)
                .done(done)
                .build());
    }

    public void deleteById(int id) {
        //todo.getId() == id
        // todo -> todo.getId() == id
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void updateTodo(Todo todo) {
        Todo updatedTodo =findById(todo.getId());
        updatedTodo.setDescription(todo.getDescription());
    }
}
