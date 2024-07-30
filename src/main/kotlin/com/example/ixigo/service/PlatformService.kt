package com.example.ixigo.service

import com.example.ixigo.models.Platform
import com.example.ixigo.repository.PlatformRepository
import org.springframework.stereotype.Service

@Service
class PlatformService(
    private val platformRepository: PlatformRepository
) {
    fun getPlatform(): List<Platform> = platformRepository.findAll()
}