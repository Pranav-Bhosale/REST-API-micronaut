package com.textanalyzer.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/textanalyzer/controllers/TextAnalyzer;", "", "()V", "analyze", "Lio/micronaut/http/HttpResponse;", "Lcom/textanalyzer/models/AnalyzerResponse;", "body", "Lcom/textanalyzer/models/TextInput;", "RestAPI"})
@io.micronaut.http.annotation.Controller(value = "/text")
public final class TextAnalyzer {
    
    public TextAnalyzer() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Produces(value = {"text/json"})
    @io.micronaut.http.annotation.Post(value = "/analyze")
    public final io.micronaut.http.HttpResponse<com.textanalyzer.models.AnalyzerResponse> analyze(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    com.textanalyzer.models.TextInput body) {
        return null;
    }
}