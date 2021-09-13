package br.com.giovanederenevick.hrvacationscheduling.repositories;

import br.com.giovanederenevick.hrvacationscheduling.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
