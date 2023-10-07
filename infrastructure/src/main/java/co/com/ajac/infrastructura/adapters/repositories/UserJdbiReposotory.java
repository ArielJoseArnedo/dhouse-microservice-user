package co.com.ajac.infrastructura.adapters.repositories;

import co.com.ajac.base.errors.AppError;
import co.com.ajac.concurrency.FutureEither;
import co.com.ajac.domain.models.User;
import co.com.ajac.domain.repositories.UserRepository;
import io.vavr.control.Option;
import org.springframework.stereotype.Repository;

@Repository
public class UserJdbiReposotory implements UserRepository {

    @Override
    public FutureEither<AppError, Option<User>> getUser(String id) {
        return null;
    }

    @Override
    public FutureEither<AppError, User> registerUser(User user) {
        return null;
    }
}
