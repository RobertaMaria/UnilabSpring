package com.unilab.controller

import com.unilab.request.UserRequest
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("user")
class UserController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createUser(@RequestBody userRequest: UserRequest): UserRequest {
        return userRequest
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun updateUser(@PathVariable id: String) {
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteUser(@PathVariable id: String) {
    }
}