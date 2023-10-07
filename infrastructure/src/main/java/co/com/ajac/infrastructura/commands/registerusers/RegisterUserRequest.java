package co.com.ajac.infrastructura.commands.registerusers;

import co.com.ajac.infrastructure.api.commands.Request;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RegisterUserRequest implements Request {
    private String name;
}
