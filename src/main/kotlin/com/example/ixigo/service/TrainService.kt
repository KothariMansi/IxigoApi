package com.example.ixigo.service

import com.example.ixigo.models.Train
import com.example.ixigo.repository.TrainRepository
import org.springframework.stereotype.Service

@Service
class TrainService(
    private val trainRepository: TrainRepository
) {
    fun getTrains(): List<Train> = trainRepository.findAll()

    fun postTrains(train: Train): Train = trainRepository.save(train)
}