package com.medbook.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
"/api/doctors"
@CrossOrigin
public class DoctorController {

    private final List<Map<String, String>> doctors = new ArrayList<>();

    public DoctorController() {
        doctors.add(Map.of(
            "id", "1",
            "name", "Анна Иванова",
            "specialty", "Терапевт"
        ));

        doctors.add(Map.of(
            "id", "2",
            "name", "Иван Петров",
            "specialty", "Кардиолог"
        ));

        doctors.add(Map.of(
            "id", "3",
            "name", "Мария Смирнова",
            "specialty", "Невролог"
        ));
    }

    @GetMapping
    public List<Map<String, String>> getDoctors() {
        return doctors;
    }
}


