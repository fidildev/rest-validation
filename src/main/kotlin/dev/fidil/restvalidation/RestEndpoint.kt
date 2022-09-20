package dev.fidil.restvalidation

import dev.fidil.restvalidation.models.CreateItem
import dev.fidil.restvalidation.models.ItemView
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.*
import javax.validation.Valid

@RestController
@Validated
class RestEndpoint {

    @PostMapping
    fun create(@RequestBody @Valid createItem: CreateItem): ItemView {
        return ItemView(UUID.randomUUID(), createItem.name, createItem.description, createItem.type, createItem.requestTime)
    }
}