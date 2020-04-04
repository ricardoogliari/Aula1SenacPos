package com.study.aula1senacpos.model

import java.io.Serializable

data class Car(
    val manufacturer: String,
    val model: String,
    var price: Float,
    val photo: String) : Serializable