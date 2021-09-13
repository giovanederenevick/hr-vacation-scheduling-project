package br.com.giovanederenevick.hrvacationscheduling.repositories;

import br.com.giovanederenevick.hrvacationscheduling.entities.VacationDate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacationDateRepository extends JpaRepository<VacationDate, Long> {
}
