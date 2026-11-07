package com.medbook.controller;

import com.medbook.model.Appointment;
import com.medbook.repository.AppointmentRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
"/api/appointments"
@CrossOrigin
public class AppointmentController {

    private final AppointmentRepository appointmentRepository;

    public AppointmentController(
            AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @GetMapping
    public List<Appointment> getAppointments() {
        return appointmentRepository.findAll();
    }

    @PostMapping
    public Appointment createAppointment(
            @RequestBody Appointment appointment) {
        return appointmentRepository.save(appointment);
    }
}


