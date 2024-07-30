package com.example.ixigo.controller

import com.example.ixigo.models.Platform
import com.example.ixigo.service.PlatformService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RequestMapping("/platform")
@RestController
class PlatformController(
    private val platformService: PlatformService
) {
    @GetMapping
    fun getPlatform(): List<Platform> = platformService.getPlatform()
}