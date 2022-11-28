package com.example.controller

import com.example.data.TextData
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces
import io.micronaut.json.tree.JsonArray
import io.micronaut.json.tree.JsonObject

@Controller("/text")
class textAnalyze {

@Post("/analyze")
@Produces(MediaType.TEXT_PLAIN)
    fun analyzeText(@Body request: TextData): String {
          return request.content
    }

}