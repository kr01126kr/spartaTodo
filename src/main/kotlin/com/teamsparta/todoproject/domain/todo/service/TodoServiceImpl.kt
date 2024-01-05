package com.teamsparta.todoproject.domain.todo.service

import com.teamsparta.todoproject.domain.exception.ModelNotFoundException
import com.teamsparta.todoproject.domain.todo.dto.CreateTodoRequest
import com.teamsparta.todoproject.domain.todo.dto.TodoResponse
import com.teamsparta.todoproject.domain.todo.dto.UpdateTodoRequest
import com.teamsparta.todoproject.domain.tododetail.dto.AddDetailRequest
import com.teamsparta.todoproject.domain.tododetail.dto.DetailResponse
import com.teamsparta.todoproject.domain.tododetail.dto.UpdateDetailRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class TodoServiceImpl: TodoService {
    override fun getAllTodoList(): List<TodoResponse> {
        TODO("Not yet implemented")
    }

    override fun getTodoById(todoId: Long): TodoResponse {
        //TODO("Not yet implemented")
        throw ModelNotFoundException(modelName = "Todo",id = 1L)
    }

    @Transactional
    override fun createTodo(request: CreateTodoRequest): TodoResponse {
        TODO("Not yet implemented")
    }

    @Transactional
    override fun updateTodo(todoId: Long, request: UpdateTodoRequest): TodoResponse {
        TODO("Not yet implemented")
    }

    @Transactional
    override fun deleteTodo(todoId: Long) {
        TODO("Not yet implemented")
    }

    override fun getDetailList(todoId: Long): List<DetailResponse> {
        TODO("Not yet implemented")
    }

    override fun getDetail(todoId: Long, detailId: Long): DetailResponse {
        TODO("Not yet implemented")
    }

    @Transactional
    override fun addDetail(todoId: Long, request: AddDetailRequest): DetailResponse {
        TODO("Not yet implemented")
    }

    @Transactional
    override fun updateDetail(todoId: Long, detailId: Long, updateDetailRequest: UpdateDetailRequest): DetailResponse {
        TODO("Not yet implemented")
    }

    @Transactional
    override fun removeDetail(todoId: Long, detailId: Long) {
        TODO("Not yet implemented")
    }


}