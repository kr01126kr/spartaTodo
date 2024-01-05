package com.teamsparta.todoproject.domain.todo.service

import com.teamsparta.todoproject.domain.todo.dto.CreateTodoRequest
import com.teamsparta.todoproject.domain.todo.dto.TodoResponse
import com.teamsparta.todoproject.domain.todo.dto.UpdateTodoRequest
import com.teamsparta.todoproject.domain.tododetail.dto.AddDetailRequest
import com.teamsparta.todoproject.domain.tododetail.dto.DetailResponse
import com.teamsparta.todoproject.domain.tododetail.dto.UpdateDetailRequest

interface TodoService {

    fun getAllTodoList():List<TodoResponse>

    fun getTodoById(todoId:Long) : TodoResponse

    fun createTodo(request: CreateTodoRequest) : TodoResponse

    fun updateTodo(todoId: Long,request: UpdateTodoRequest):TodoResponse

    fun deleteTodo(todoId: Long)

    fun getDetailList(todoId: Long):List<DetailResponse>

    fun getDetail(todoId: Long, detailId: Long): DetailResponse

    fun addDetail(todoId: Long, request: AddDetailRequest): DetailResponse

    fun updateDetail(
        todoId: Long,
        detailId: Long,
        updateDetailRequest: UpdateDetailRequest
    ):DetailResponse

    fun removeDetail(todoId: Long, detailId: Long)




}