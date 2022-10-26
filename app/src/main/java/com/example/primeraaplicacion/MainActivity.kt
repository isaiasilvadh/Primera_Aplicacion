package com.example.primeraaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variableConstantes()
        tiposDatos()
        arrays()
        maps()
    }

    fun variableConstantes() {
        var saludo = "Hola mundo";
        println(saludo)
    }

    fun tiposDatos() {
        val string1 = "Desarrollo movil"
        val string2 = "Bienvenidos"
        val string3 = string2 + " a la materia de " + string1
        println(string3)

        val edad = 11


        /*
        *<,>,>=,<=,!=,==
        *
        *
         */
        if (edad < 18) {
            println("Usted es mayor de edad")
        } else {
            println("Usted no es mayor de edad")
        }

        val pais = "Argetina"
        when (pais) {
            "Peru", "Ecuador", "Colombia" -> {
                println("Habla Español")
            }
        }

    }

    fun arrays() {
        val name = "Isaias"
        val surname = "Silva"
        val university = "UTPL"
        val age = "25"
        val myArray = arrayListOf<String>()

    }

    fun maps() {
        var myMap: Map<String, Int>
        myMap = mutableMapOf("Isaias" to 1, "Pedro" to 2, "Sara" to 5, "6" to 6)
        println(myMap)
        myMap["Carlos"] = 7
        myMap.put("Abigail", 8)
        println(myMap)
        println(myMap["Samantha"])

    }

    fun clases(){

    }

}
