package com.example.ixigo.repository

import com.example.ixigo.models.Platform
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PlatformRepository: JpaRepository<Platform, Long>