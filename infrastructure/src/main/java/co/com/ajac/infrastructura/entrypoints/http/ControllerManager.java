package co.com.ajac.infrastructura.entrypoints.http;

import co.com.ajac.infrastructura.entrypoints.http.controllers.users.ControllerCommandUser;
import co.com.ajac.infrastructure.api.commands.CommandProvider;
import co.com.ajac.infrastructure.api.commands.ProviderManager;
import io.vavr.collection.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControllerManager implements ProviderManager {

    private final List<CommandProvider> commandProviders;

    @Autowired
    public ControllerManager(ControllerCommandUser controllerCommandUser) {
        commandProviders = List.of(controllerCommandUser);
    }

    @Override
    public List<CommandProvider> getCommandProviders() {
        return commandProviders;
    }
}
