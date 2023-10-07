package co.com.ajac.infrastructura.entrypoints.http.controllers.users;


import co.com.ajac.infrastructura.commands.registerusers.RegisterUserCommand;
import co.com.ajac.infrastructura.commands.registerusers.RegisterUserRequest;
import co.com.ajac.infrastructure.api.commands.Command;
import co.com.ajac.infrastructure.api.commands.CommandProvider;
import co.com.ajac.infrastructure.api.commands.Request;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.collection.HashMap;
import io.vavr.control.Option;
import io.vavr.control.Try;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControllerCommandUser extends CommandProvider {

    @Autowired
    public ControllerCommandUser(RegisterUserCommand registerUserCommand) {
        this.version = "user";
        this.commands = HashMap.of(CommandUsersName.REGISTER_USER, Tuple.of(registerUserCommand, new RegisterUserRequest()));
    }

    @Override
    public Option<Command> provide(String nombreComando) {
        return CommandUsersName.getCommandName(nombreComando)
          .flatMap(commands::get)
          .map(Tuple2::_1);
    }

    @Override
    public Try<Request> deserialize(JsonNode comandoBody, String nombreComando) {
        return CommandUsersName.getCommandName(nombreComando)
          .flatMap(commands::get)
          .map(Tuple2::_2)
          .toTry()
          .flatMap(request -> Try.of(() -> new ObjectMapper().readValue(comandoBody.toPrettyString(), request.getClass())));
    }
}
