package com.app.apiFitness.service

import com.app.apiFitness.controller.dto.request.TeacherProfileRequestDTO
import com.app.apiFitness.database.repository.entity.TeacherEntity
import com.app.apiFitness.database.repository.entity.UserEntity

interface TeacherProfileService {
    fun create(teacherProfileRequestDTO: TeacherProfileRequestDTO)
    fun verifyIfExistEmail(email: String): Boolean
    fun createUser(teacherProfileRequestDTO: TeacherProfileRequestDTO) : UserEntity
    fun createTeacherUser(teacherProfileRequestDTO: TeacherProfileRequestDTO)
    fun createTeacher(userId: Long?) : TeacherEntity
}