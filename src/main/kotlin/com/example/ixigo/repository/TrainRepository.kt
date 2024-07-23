package com.example.ixigo.repository

import com.example.ixigo.models.Train
import com.example.ixigo.models.TrainSearch
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository

@Repository
interface TrainRepository: JpaRepository<Train, Long>