package br.com.giovanederenevick.hrvacationscheduling.services;

import br.com.giovanederenevick.hrvacationscheduling.entities.VacationDate;
import br.com.giovanederenevick.hrvacationscheduling.repositories.VacationDateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class VacationDateService {

    @Autowired
    private VacationDateRepository vacationDateRepository;

    public Page<VacationDate> findAll(Pageable pageable) {

        return vacationDateRepository.findAll(pageable);
    }
}
