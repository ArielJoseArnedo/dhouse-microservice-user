package co.com.ajac.infrastructura.entrypoints.http.controllers.users;

import co.com.ajac.infrastructure.api.commands.CommandName;
import io.vavr.collection.List;
import io.vavr.control.Option;

public enum CommandUsersName implements CommandName {

    REGISTER_USER("RegisterUser");

    private final String name;

    CommandUsersName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public static Option<CommandUsersName> getCommandName(String name) {
        return List.of(CommandUsersName.values())
          .find(commandName -> commandName.name.equals(name));
    }
}
