package com.teamsparta.todoproject.domain.tododetail.controller

import com.teamsparta.todoproject.domain.tododetail.dto.DetailResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/todos/{todoId}/details")
@RestController
class DetailController {

    @GetMapping
    fun getDetailList(@PathVariable todoId: Long): ResponseEntity<List<DetailResponse>>

}