package com.teamsparta.todoproject.domain.tododetail.controller

import com.teamsparta.todoproject.domain.todo.dto.UpdateTodoRequest
import com.teamsparta.todoproject.domain.todo.service.TodoService
import com.teamsparta.todoproject.domain.tododetail.dto.AddDetailRequest
import com.teamsparta.todoproject.domain.tododetail.dto.DetailResponse
import com.teamsparta.todoproject.domain.tododetail.dto.UpdateDetailRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/todos/{todoId}/details")
@RestController
class DetailController(
    private val todoService: TodoService
) {

    @GetMapping
    fun getDetailList(@PathVariable todoId: Long): ResponseEntity<List<DetailResponse>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.getDetailList(todoId))
    }

    @GetMapping("/{detailId}")
    fun getDetail(@PathVariable todoId: Long, @PathVariable detailId: Long): ResponseEntity<DetailResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.getDetail(todoId,detailId))
    }

    @PostMapping
    fun addDetail(
        @PathVariable todoId: Long,
        @RequestBody addDetailRequest: AddDetailRequest
    ): ResponseEntity<DetailResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.addDetail(todoId,addDetailRequest))
    }

    @PutMapping("/{detailId}")
    fun updateDetail(
        @PathVariable todoId: Long,
        @PathVariable detailId: Long,
        @RequestBody updateDetailRequest: UpdateDetailRequest
    ):ResponseEntity<DetailResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.updateDetail(todoId,detailId,updateDetailRequest))
    }

    @DeleteMapping("/{detailId}")
    fun removeDetail(
        @PathVariable todoId: Long,
        @PathVariable detailId: Long
    ):ResponseEntity<Unit> {
        todoService.removeDetail(todoId,detailId)
        return ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .build()
    }


}