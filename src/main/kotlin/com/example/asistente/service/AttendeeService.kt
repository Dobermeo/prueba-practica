package com.example.asistente.service


import com.example.asistente.model.Attendee
import com.example.asistente.repository.AttendeeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class AttendeeService {

    @Autowired
    lateinit var attendeeRepository: AttendeeRepository

    fun list():List<Attendee>{
        return attendeeRepository.findAll()
    }

    fun save(client:Attendee):Attendee{
        return attendeeRepository.save(client)
    }
}