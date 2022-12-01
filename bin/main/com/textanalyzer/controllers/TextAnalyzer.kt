package com.textanalyzer.controllers

import com.textanalyzer.models.AnalyzerResponse
import com.textanalyzer.models.TextInput
import com.textanalyzer.services.sayHello
import com.textanalyzer.services.textAnalyzerUtil
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Get


@Controller("/text")
class TextAnalyzer {

    @Post("/analyze")
    @Produces(MediaType.TEXT_JSON)
    fun analyze(@Body body: TextInput): HttpResponse<AnalyzerResponse>{
        return HttpResponse.ok(textAnalyzerUtil(body.content))
    }

}
