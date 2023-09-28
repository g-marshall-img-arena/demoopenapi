package com.example;

import io.micronaut.http.annotation.*;

@Controller("/demoopenapi")
public class DemoopenapiController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}