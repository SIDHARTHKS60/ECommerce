package com.example.ecomerce.project.controller

import com.example.ecomerce.project.model.User
import com.example.ecomerce.project.service.UserService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/")
class UserController
    (val userService : UserService) {

    @GetMapping("/users")
    fun getAllUsers(): Flux<User> {
        return userService.findAllUsers()
    }

    @GetMapping("/users/list/")
    fun getUserBasisSearch(@PathVariable(required = true) query: String): Flux<User> {
        return userService.findAllUsers()
    }

    @DeleteMapping("/user/delete/{id}")
    fun deleteUserById(@PathVariable("id") id: String): Mono<Void> {
        return userService.deleteUserById(id)
    }
    //Comments
}
