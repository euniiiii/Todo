package com.example.todo.service;

import com.example.todo.domain.Todo;
import com.example.todo.mapper.TodoMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class TodoService {

    private final TodoMapper todoMapper;

    public void insertTodo(Todo params) {
        todoMapper.insertTodo(params);
    }
    public List<Todo> getTodoList() {
        return todoMapper.getTodoList();
    }

    public Todo getTodoById(Long id) {
        return todoMapper.getTodoById(id);
    }
    public int updateTodo(Long id, Todo params) {
        return todoMapper.updateTodo(id, params);
    }
    public int deleteTodo(Long id) {
        return todoMapper.deleteTodo(id);
    }
}
