package com.mlevshin.gradlemonorepo.domain

import java.time.LocalDateTime

interface Domain<ID : Any> {
    val id: ID
    val createdDate: LocalDateTime
    val updatedDate: LocalDateTime
}