package com.example.todo.controller;

import com.example.todo.domain.Todo;
import com.example.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/todo")
@RestController
public class TodoController {

    private final TodoService todoService;

    @PostMapping
    public ResponseEntity<Todo> insertTodo(@RequestBody Todo params) {
        todoService.insertTodo(params);
        return ResponseEntity.ok(params);
    }

    @GetMapping
    public ResponseEntity<List<Todo>> getTodoList() {
        return ResponseEntity.ok(todoService.getTodoList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable Long id) {
        return ResponseEntity.ok(todoService.getTodoById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateTodo(@PathVariable Long id, @RequestBody Todo request) {
        todoService.updateTodo(id, request);
        return ResponseEntity.ok("updated!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
        return ResponseEntity.ok("deleted!");
    }
}
