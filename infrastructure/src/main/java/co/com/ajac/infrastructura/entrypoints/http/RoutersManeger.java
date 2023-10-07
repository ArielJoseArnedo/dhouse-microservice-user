package co.com.ajac.infrastructura.entrypoints.http;

import co.com.ajac.infrastructure.commands.Routes;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Component
public class RoutersManeger implements Routes {
    @Override
    public <T extends ServerResponse> RouterFunction<T> endpoints(HandlerFunction<T> handlerFunction) {
        return RouterFunctions.route(
          POST("/user/commands").and(accept(MediaType.APPLICATION_JSON)), handlerFunction
        );
    }
}
