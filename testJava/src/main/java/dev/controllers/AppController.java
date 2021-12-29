package dev.controllers;

import com.google.gson.Gson;
import dev.entities.ShowingOffGson;
import io.javalin.http.Handler;

import java.util.ArrayList;
import java.util.List;

public class AppController {

    List<ShowingOffGson> list = new ArrayList<>();

    public Handler hello = context -> {
        context.result("Hello there!");
        context.status(200);
    };

    public Handler addObject = ctx -> {
        Gson gson = new Gson();
        ShowingOffGson object = gson.fromJson(ctx.body(), ShowingOffGson.class);
        list.add(object);
        ctx.result("You have added your object to the list");
        ctx.status(201);
    };

    public Handler getObject = ctx -> {
        int index = Integer.parseInt(ctx.pathParam("index"));
        ShowingOffGson object = list.get(index);
        Gson gson = new Gson();
        String objectJson = gson.toJson(object);
        ctx.result(objectJson);
        ctx.status(201);
    };

}
