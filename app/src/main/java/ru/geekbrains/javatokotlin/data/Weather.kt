package ru.geekbrains.javatokotlin.data

data class Weather(var town: String = "My Town", var temperature: Int = 10) {

    constructor(town: String, temperature: Int, preassure: Int) : this(town, temperature) {
        this.preassure = preassure
    }

    constructor(humidity: Int) : this() {

    }

    var preassure: Int = 0
        get() {
            registrator("get")
            return field
        }
        set(value) {
            registrator("before set")
            field = value
            registrator("after set", "set")
        }

    fun registrator(vararg strings: String): Unit {
        val a = if (strings[0] == "get") {
            "get"
        } else {
            "set"
        }

        for((index, myVar) in strings.withIndex()){

        }

        for (i in strings.indices){

        }

        for (s in strings) {

        }
    }
}