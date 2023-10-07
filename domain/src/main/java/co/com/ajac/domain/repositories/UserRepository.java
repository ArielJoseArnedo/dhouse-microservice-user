package co.com.ajac.domain.repositories;

import co.com.ajac.base.errors.AppError;
import co.com.ajac.concurrency.FutureEither;
import co.com.ajac.domain.models.User;
import io.vavr.control.Option;

public interface UserRepository {

    FutureEither<AppError, Option<User>> getUser(String id);
    FutureEither<AppError, User> registerUser(User user);
}
