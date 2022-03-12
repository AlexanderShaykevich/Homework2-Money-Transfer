package ru.netology

fun main() {
    val amount = 1513_000
    val minCommission = 3500
    val percentCommission = 0.75/100

    val finalCommission = if(amount*percentCommission < minCommission)
        minCommission else amount*percentCommission

    println("Transfer commission: $finalCommission")
}