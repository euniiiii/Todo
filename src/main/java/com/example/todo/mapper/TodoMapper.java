package com.example.todo.mapper;

import com.example.todo.domain.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TodoMapper {
    void insertTodo(Todo params);
    List<Todo> getTodoList();
    int updateTodo(@Param("id") Long id, @Param("todo") Todo params);
    Todo getTodoById(Long id);
    int deleteTodo(Long id);
}
