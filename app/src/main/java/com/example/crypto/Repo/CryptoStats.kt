package com.example.crypto.Repo

data class CryptoStats(
    var id: String? = null,
    var rank: String? = null,
    var symbol: String?= null,
    var name: String?= null,
    var supply: String?= null,
    var maxSupply: String?= null,
    var marketCapUsd: String?= null,
    var volumeUsd24Hr: String?= null,
    var priceUsd: String?= null,
    var changePercent24Hr: String?= null,
    var vwap24Hr: String?=null,
    var explorer: String?=null
)