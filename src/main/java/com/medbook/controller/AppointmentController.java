package com.medbook.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
"/api/appointments"
@CrossOrigin
public class AppointmentController {

    private final List<Map<String, String>> appointments = new ArrayList<>();

    @GetMapping
    public List<Map<String, String>> getAppointments() {
        return appointments;
    }

    @PostMapping
    public Map<String, String> createAppointment(
            @RequestBody Map<String, String> appointment) {
        appointments.add(appointment);
        return appointment;
    }
}
