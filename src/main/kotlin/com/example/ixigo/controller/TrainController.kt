package com.example.ixigo.controller

import com.example.ixigo.models.Train
import com.example.ixigo.models.TrainSearch
import com.example.ixigo.repository.TrainRepository
import com.example.ixigo.service.TrainService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/trains")
class TrainController(
    private val trainService: TrainService
) {
    @GetMapping()
    fun getAllTrains(): List<Train> = trainService.getTrains()

    @PostMapping
    fun postTrains(@RequestBody train: Train): Train = trainService.postTrains(train)
}