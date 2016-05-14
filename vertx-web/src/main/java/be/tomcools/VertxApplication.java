package be.tomcools;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpClient;
import io.vertx.core.http.HttpServer;

public class VertxApplication {

    public static void main(String[] args) {
        HttpServer server = Vertx.vertx().createHttpServer();

        server.requestHandler(request -> {
            request.response().end("Hello from Vertx! :-)");
        });

        server.listen(8080);
    }
}
