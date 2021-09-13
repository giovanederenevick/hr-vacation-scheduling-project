package br.com.giovanederenevick.hrvacationscheduling.dto;

import br.com.giovanederenevick.hrvacationscheduling.entities.ChoiceSequence;
import br.com.giovanederenevick.hrvacationscheduling.entities.User;
import br.com.giovanederenevick.hrvacationscheduling.entities.UserPeriod;
import br.com.giovanederenevick.hrvacationscheduling.entities.VacationDate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserDTO implements Serializable {

    private static final long serialVersionUID = 5268788269085987902L;

    private Long id;
    private String name;
    private String email;
    private ChoiceSequence choiceSequence;
    private List<UserPeriod> userPeriodList = new ArrayList<>();
    private Set<VacationDate> vacationDateList = new HashSet<>();

    public UserDTO() {
    }

    public UserDTO(Long id, String name, String email, ChoiceSequence choiceSequence, List<UserPeriod> userPeriodList, Set<VacationDate> vacationDateList) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.choiceSequence = choiceSequence;
        this.userPeriodList = userPeriodList;
        this.vacationDateList = vacationDateList;
    }

    public UserDTO(User entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
        this.choiceSequence = entity.getChoiceSequence();
        this.userPeriodList = entity.getUserPeriodList();
        this.vacationDateList = entity.getVacationDateList();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ChoiceSequence getChoiceSequence() {
        return choiceSequence;
    }

    public void setChoiceSequence(ChoiceSequence choiceSequence) {
        this.choiceSequence = choiceSequence;
    }

    public List<UserPeriod> getUserPeriodList() {
        return userPeriodList;
    }

    public void setUserPeriodList(List<UserPeriod> userPeriodList) {
        this.userPeriodList = userPeriodList;
    }

    public Set<VacationDate> getVacationDateList() {
        return vacationDateList;
    }

    public void setVacationDateList(Set<VacationDate> vacationDateList) {
        this.vacationDateList = vacationDateList;
    }
}
