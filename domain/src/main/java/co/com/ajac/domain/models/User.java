package co.com.ajac.domain.models;

import org.immutables.value.Value;
import org.immutables.value.Value.Parameter;
import co.com.ajac.base.inmutables.styles.ImmutableStyle;

import java.time.ZonedDateTime;
import java.util.UUID;

@Value.Immutable
@ImmutableStyle
public interface User {

    @Parameter
    String id();

    @Parameter
    ZonedDateTime creationDate();

    @Parameter
    StateUser stateUser();

    @Parameter
    UUID idAuthentication();
}
