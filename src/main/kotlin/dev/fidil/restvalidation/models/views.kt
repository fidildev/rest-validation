package dev.fidil.restvalidation.models

import java.util.*

data class ItemView(
    val id: UUID,
    val name: String,
    val description: String,
    val type: ItemType,
    val requestTime: String,
)