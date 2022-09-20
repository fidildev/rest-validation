package dev.fidil.restvalidation.models

import dev.fidil.restvalidation.config.ValidType
import org.hibernate.validator.constraints.Length
import org.springframework.format.annotation.DateTimeFormat
import javax.validation.constraints.NotBlank

data class CreateItem(
    @field:NotBlank(message = "name cannot be empty")
    val name: String,
    @field:Length(min = 2, max = 255, message = "Description must be between 2 and 255 characters")
    val description: String,
    @field:ValidType(type = ItemType::class)
    val type: ItemType,
    @field:DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    val requestTime: String,
)