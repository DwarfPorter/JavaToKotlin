package ru.geekbrains.javatokotlin.repository

import ru.geekbrains.javatokotlin.data.Weather

open class Repository : IRepository {

    private val weathers: List<Weather>

    init {
        weathers = listOf(
            Weather("Москва", 25),
            Weather("Санкт-Петербург", 20),
            Weather("Самара", 23),
            Weather("Новосибирск", 15)
        )
    }

    override fun getWeathers(): List<Weather> {
        return weathers
    }
}

interface IRepository{
    fun getWeathers(): List<Weather>
}

// RepositorySingle.INSTANCE.getWeathers() - for JAVA
object RepositorySingle : IRepository {

    private val weathers: List<Weather> = listOf(
        Weather("Москва", 25),
        Weather("Санкт-Петербург", 20),
        Weather("Самара", 23),
        Weather("Новосибирск", 15)
    )

    override fun getWeathers(): List<Weather> {
        return weathers
    }
}