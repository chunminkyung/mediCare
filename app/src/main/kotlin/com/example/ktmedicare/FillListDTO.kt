package com.example.ktmedicare

data class FillListDTO(
    val imageUri: String,   // 대표이미지 URI
    val fillName: String,      // 약 이름
    val fillNumber: String,   // 약 개수
    val fillCount: String,     // 복용 횟수
    val fillCount2: String,    // 복용 횟수 2
    var fillmorning: String,
    var filllunch: String,
    var fillevening: String
)

