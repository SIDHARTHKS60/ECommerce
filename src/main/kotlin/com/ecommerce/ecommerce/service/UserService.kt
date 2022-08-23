package com.example.ecomerce.project.service

import com.example.ecomerce.project.model.User
import com.example.ecomerce.project.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class UserService(
    @Autowired
        val userRepository: UserRepository) {

    fun findAllUsers(): Flux<User> {
        return userRepository.findAll()
    }

    fun addUsers(user:User): Mono<User>{
        return userRepository.save(user)
    }

    fun deleteUserById(id: String): Mono<Void> {
        return userRepository.deleteById(id)
    }

    /*fun updateUser*/

}