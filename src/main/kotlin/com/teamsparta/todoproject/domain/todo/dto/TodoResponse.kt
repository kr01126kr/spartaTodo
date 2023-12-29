package com.teamsparta.todoproject.domain.todo.dto



data class TodoResponse(

    val id: Long,
    val title: String,
    val description: String?,
    val date: String,

)


