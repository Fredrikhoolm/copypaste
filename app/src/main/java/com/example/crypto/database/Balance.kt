package com.example.crypto.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "balance_table")
data class Balance(
        @PrimaryKey(autoGenerate = true) val balanceID: Int,
        val currency: String?,
        val amount: Float?,
        val totalWorth: Float?
)