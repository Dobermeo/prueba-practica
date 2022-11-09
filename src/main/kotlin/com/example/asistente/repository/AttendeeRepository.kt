package com.example.asistente.repository

import com.example.asistente.model.Attendee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AttendeeRepository: JpaRepository <Attendee, Long> {
}