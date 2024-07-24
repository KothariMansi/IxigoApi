package com.example.ixigo.controller

import com.example.ixigo.models.Train
import com.example.ixigo.models.TrainSearch
import com.example.ixigo.service.TrainService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/trains")
class TrainController(
    private val trainService: TrainService
) {
    @GetMapping
    fun getAllTrains(): List<Train> = trainService.getTrains()

    @PostMapping
    fun postTrains(@RequestBody train: Train): Train = trainService.postTrains(train)

    @GetMapping("/search")
    fun getTrainByTrainSearch(@RequestParam arrival: String,
                              @RequestParam departure: String,
                              @RequestParam date: String
    ): List<Train?>? {
        val trainSearch = TrainSearch(arrival, departure, date)
        return trainService.getTrainByTrainSearch(trainSearch)
    }
}