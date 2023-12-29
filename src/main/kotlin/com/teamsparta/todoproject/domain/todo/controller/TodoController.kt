package com.teamsparta.todoproject.domain.todo.controller

import com.teamsparta.todoproject.domain.todo.dto.CreateTodoRequest
import com.teamsparta.todoproject.domain.todo.dto.TodoResponse
import com.teamsparta.todoproject.domain.todo.dto.UpdateTodoRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/todos")
@RestController
class TodoController {

    @GetMapping
    fun getTodoList():ResponseEntity<List<TodoResponse>> {
        TODO()
    }

    @GetMapping("/{todoId}")
    fun getTodo(@PathVariable todoId:Long):ResponseEntity<TodoResponse> {
        TODO()
    }

    @PostMapping
    fun createTodo(@RequestBody createTodoRequest: CreateTodoRequest): ResponseEntity<TodoResponse> {
        TODO()
    }

    @PutMapping("/{todoId}")
    fun updateTodo(@PathVariable todoId:Long , @RequestBody updateTodoRequest: UpdateTodoRequest):ResponseEntity<TodoResponse> {
        TODO()
    }

    @DeleteMapping("/{todoId}")
    fun deleteTodo(@PathVariable todoId:Long) {
        TODO()
    }

}