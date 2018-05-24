package com.example.tictactoe

import org.springframework.web.reactive.function.server.*
import org.springframework.web.reactive.function.server.RequestPredicates.*
import org.springframework.web.reactive.function.server.RouterFunctions.route

class Router(private val healthHandler: HealthHandler) {


    fun route(): RouterFunction<ServerResponse> =
            route(GET("/health"), HandlerFunction { healthHandler.health(it) })

}