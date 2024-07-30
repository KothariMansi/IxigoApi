package com.example.ixigo.data

import com.example.ixigo.models.Platform
import com.example.ixigo.repository.PlatformRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class PlatformDataInitializer (
    private val platformRepository: PlatformRepository
) {
    @Bean
    fun runPlatform(): ApplicationRunner = ApplicationRunner{
        val platform = listOf(
            Platform(0, "BLT", "Balotra"),
            Platform(0, "JDP", "Jodhpur"),
            Platform(0, "MNLI", "Manali"),
            Platform(0, "VSG", "Vasco-da-Gama"),
            Platform(0, "BKN", "Bikaner"),
            Platform(0, "BME", "Barmer"),
        )
        platformRepository.saveAll(platform)
    }
}