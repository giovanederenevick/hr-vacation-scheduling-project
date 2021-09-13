package br.com.giovanederenevick.hrvacationscheduling.controllers;

import br.com.giovanederenevick.hrvacationscheduling.entities.VacationDate;
import br.com.giovanederenevick.hrvacationscheduling.services.VacationDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vacation-dates")
public class VacationDateController {

    @Autowired
    private VacationDateService vacationDateService;

    @GetMapping
    public ResponseEntity<Page<VacationDate>> findAll(Pageable pageable) {

        Page<VacationDate> vacationDatePage = vacationDateService.findAll(pageable);

        return ResponseEntity.ok(vacationDatePage);
    }
}
