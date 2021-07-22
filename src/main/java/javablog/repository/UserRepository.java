package javablog.repository;

import javablog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
