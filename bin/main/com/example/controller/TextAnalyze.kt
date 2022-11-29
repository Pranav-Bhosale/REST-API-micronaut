package com.example.controller

import com.example.data.TextData
import com.fasterxml.jackson.databind.ObjectMapper
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces
import io.micronaut.json.tree.JsonArray
import io.micronaut.json.tree.JsonNode
import io.micronaut.json.tree.JsonObject

@Controller("/text")
class textAnalyze {

@Post("/analyze")
@Produces(MediaType.TEXT_PLAIN)
    fun analyzeText(@Body request: TextData): String {

        var map: MutableMap<String, JsonNode> = mutableMapOf<String, JsonNode>()
        fun countLines( str:String): Int {
            val lines: List<String> = str.split("\r\n|\r|\n")
            return  lines.size
        }

        val data = """{"word_count": "${request.getWordCount()}, "character_count_with_spaces": ${request.getCharCountWithSpaces()},
            |"character_count_without_spaces": ${request.getCharCountWithoutSpaces()}, "line_count":${countLines(request.content)},
            |"unique_words":${request.getUniqueWordCount()}}""".trimMargin()

        println(countLines(request.content))
        return data
    }


}