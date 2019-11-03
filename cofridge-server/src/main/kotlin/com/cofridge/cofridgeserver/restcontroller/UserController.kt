package com.cofridge.cofridgeserver.restcontroller

import com.cofridge.cofridgeserver.model.User
import com.cofridge.cofridgeserver.repository.UserRepository
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class UserController(private val userRepository: UserRepository) {

    @GetMapping("/users")
    fun getAllUsers(): List<User> =
            userRepository.findAll()

    @PostMapping("/users")
    fun createNewUser(@Valid @RequestBody user: User): User =
            userRepository.save(user)
}