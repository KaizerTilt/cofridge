package com.cofridge.cofridgeserver.repository

import com.cofridge.cofridgeserver.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long>