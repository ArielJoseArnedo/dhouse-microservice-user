package co.com.ajac.infrastructura.entrypoints.http.controllers.version;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
public class ControllerVersion {

    @GetMapping("/version")
    public Mono<JsonNode> getVersion() {
        return Mono.just(JsonNodeFactory.instance)
          .map(jsonNodeFactory -> jsonNodeFactory
            .objectNode()
            .put("name", co.com.ajac.infrastructura.entrypoints.http.controllers.version.BuildInfo.name)
            .put("version", co.com.ajac.infrastructura.entrypoints.http.controllers.version.BuildInfo.version)
          );
    }
}
