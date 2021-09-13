package br.com.giovanederenevick.hrvacationscheduling.repositories;

import br.com.giovanederenevick.hrvacationscheduling.entities.UserPeriod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPeriodRepository extends JpaRepository<UserPeriod, Long> {
}
