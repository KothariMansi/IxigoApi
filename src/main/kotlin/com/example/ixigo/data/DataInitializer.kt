package com.example.ixigo.data

import com.example.ixigo.models.AboutTrain
import com.example.ixigo.models.Train
import com.example.ixigo.models.TrainBase
import com.example.ixigo.models.TrainSearch
import com.example.ixigo.repository.TrainRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DataInitializer(
    private val trainRepository: TrainRepository
) {
    @Bean
    fun run(): ApplicationRunner = ApplicationRunner{
        val trains = listOf(
            Train(
                id = 0,
                trainNum = 645345,
                trainBase = TrainBase(
                    0,
                    "Balotra Jodhpur Exp",
                    TrainSearch(
                        "Balotra",
                        "Jodhpur",
                        "24-07-2024"
                    )
                ),
                aboutTrain = AboutTrain(
                    "170",
                    "67",
                    "100"
                ),
                availability = true,
                124
            ),
            Train(
                id = 0,
                trainNum = 122345,
                trainBase = TrainBase(
                    0,
                    "Goa Manali Exp",
                    TrainSearch(
                        "Goa",
                        "Manali",
                        "30-07-2024"
                    )
                ),
                aboutTrain = AboutTrain(
                    "1000",
                    "88",
                    "134"
                ),
                availability = false,
                3600

            ),
            Train(
                id = 0,
                trainNum = 455452,
                trainBase = TrainBase(
                    0,
                    "Bikaner Barmer Exp",
                    TrainSearch(
                        "Bikaner",
                        "Barmer",
                        "24-07-2024"
                    )
                ),
                aboutTrain = AboutTrain(
                    "300",
                    "80",
                    "120"
                ),
                availability = true,
                180
            ),
            Train(
                id = 0,
                trainNum = 363636,
                trainBase = TrainBase(
                    0,
                    "Bombay Exp",
                    TrainSearch(
                        "Jodhpur",
                        "Bombay",
                        "24-07-2024"
                    )
                ),
                aboutTrain = AboutTrain(
                    "250",
                    "100",
                    "150"
                ),
                availability = true,
                870
            ),

        )
        trainRepository.saveAll(trains)
    }
}