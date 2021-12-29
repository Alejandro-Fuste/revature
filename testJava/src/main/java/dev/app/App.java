package dev.app;

import dev.controllers.AppController;
import io.javalin.Javalin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    // need this to do manual logging
    static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        logger.info("creating Javalin object");
        Javalin app = Javalin.create(config -> {
            config.enableCorsForAllOrigins();
            config.enableDevLogging();
        });

        logger.info("Javalin object created");

        AppController appController = new AppController();

        app.get("/", appController.hello);

        app.get("object/{index}", appController.getObject);

        app.post("/object", appController.addObject);

        app.start();


    }
}
