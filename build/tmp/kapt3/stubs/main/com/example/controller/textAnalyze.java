package com.example.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/example/controller/textAnalyze;", "", "()V", "analyzeText", "", "request", "Lcom/example/data/TextData;", "RestAPI"})
@io.micronaut.http.annotation.Controller(value = "/text")
public final class textAnalyze {
    
    public textAnalyze() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Produces(value = {"text/plain"})
    @io.micronaut.http.annotation.Post(value = "/analyze")
    public final java.lang.String analyzeText(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    com.example.data.TextData request) {
        return null;
    }
}