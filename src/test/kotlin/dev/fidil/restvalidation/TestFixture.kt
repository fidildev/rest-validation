package dev.fidil.restvalidation

import dev.fidil.restvalidation.models.CreateItem
import dev.fidil.restvalidation.models.ItemType
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component
import java.time.Instant
import java.util.UUID

// TODO: Figure out why @TestComponent isn't wiring
@Profile("test")
@Component
class TestFixture {

    fun createItem(): CreateItem {
        return CreateItem(
            "name",
            "description",
            ItemType.LOW,
            Instant.now().toString()
        )
    }

    fun createItemWithInvalidDescription(): CreateItem {
        return CreateItem(
            "name",
            "x",
            ItemType.LOW,
            Instant.now().toString()
        )
    }
}