package com.warh.routes

import com.warh.data.model.Rabbit
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://192.168.0.83:8080"

private val rabbits = listOf(
    Rabbit("Carlos", "Un bonito conejo marrón", "$BASE_URL/rabbits/rabbit1.jpg"),
    Rabbit("Jess", "A Jess le gusta comer manzanas", "$BASE_URL/rabbits/rabbit2.jpg"),
    Rabbit("Florencia", "Florencia siempre está hambrienta", "$BASE_URL/rabbits/rabbit3.jpg"),
    Rabbit("Federico", "A Federico le gusta subir por las montañas", "$BASE_URL/rabbits/rabbit4.jpg"),
    Rabbit("Martin", "A Martín no le gusta saltar", "$BASE_URL/rabbits/rabbit5.jpg"),
)


fun Route.randomRabbit() {
    get("/randomrabbit") {
        //call.parameters["rabbitId"]
        call.respond(
            HttpStatusCode.OK,
            rabbits.random()
        )
    }
}