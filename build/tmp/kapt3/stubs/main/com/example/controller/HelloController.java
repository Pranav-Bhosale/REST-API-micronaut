package com.example.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/example/controller/HelloController;", "", "()V", "index", "", "RestAPI"})
@io.micronaut.http.annotation.Controller(value = "/")
public final class HelloController {
    
    public HelloController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Produces(value = {"text/plain"})
    @io.micronaut.http.annotation.Get()
    public final java.lang.String index() {
        return null;
    }
}