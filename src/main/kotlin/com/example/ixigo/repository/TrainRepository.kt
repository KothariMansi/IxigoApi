package com.example.ixigo.repository

import com.example.ixigo.models.Train
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository


@Repository
interface TrainRepository: JpaRepository<Train, Long> {
    @Query("SELECT t FROM Train t WHERE t.trainBase.trainSearch.arrival = :arrival AND t.trainBase.trainSearch.departure = :departure AND t.trainBase.trainSearch.date = :date")
    fun findTrainsByTrainSearch(
        @Param("arrival") arrival: String?,
        @Param("departure") departure: String?,
        @Param("date") date: String?
    ): List<Train?>?

}