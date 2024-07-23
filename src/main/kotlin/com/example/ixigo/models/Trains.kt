package com.example.ixigo.models

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.*

@Entity
data class Train(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val trainNum: Long,

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "train_base_id", referencedColumnName = "id")
    val trainBase: TrainBase,

    @Embedded
    val aboutTrain: AboutTrain,

    val availability: Boolean,
    val timeTaken: Long
)

@Entity
data class TrainBase(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    val name: String,

    @Embedded
    val trainSearch: TrainSearch
)

@Embeddable
data class TrainSearch(
    val arrival: String,
    val departure: String,
    val date: String
)

@Embeddable
data class AboutTrain(
    val distance: String,
    val avgSpeed: String,
    val maxSpeed: String
)
