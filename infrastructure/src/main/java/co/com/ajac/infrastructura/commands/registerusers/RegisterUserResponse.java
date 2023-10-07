package co.com.ajac.infrastructura.commands.registerusers;

import co.com.ajac.infrastructure.api.commands.Response;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RegisterUserResponse implements Response {
    private final String name;
}
