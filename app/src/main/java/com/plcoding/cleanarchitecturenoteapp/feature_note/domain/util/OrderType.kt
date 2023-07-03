package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util

// Step 5
sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}
