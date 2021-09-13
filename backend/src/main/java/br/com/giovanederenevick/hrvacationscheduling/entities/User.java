package br.com.giovanederenevick.hrvacationscheduling.entities;

import br.com.giovanederenevick.hrvacationscheduling.dto.UserDTO;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_users")
public class User implements Serializable {

    private static final long serialVersionUID = -5237317836235648497L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private ChoiceSequence choiceSequence;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<UserPeriod> userPeriodList = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<VacationDate> vacationDateList = new HashSet<>();

    public User() {
    }

    public User(Long id, String name, String email, ChoiceSequence choiceSequence, List<UserPeriod> userPeriodList, Set<VacationDate> vacationDateList) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.choiceSequence = choiceSequence;
        this.userPeriodList = userPeriodList;
        this.vacationDateList = vacationDateList;
    }

    public User(UserDTO userDTO) {
        this.id = userDTO.getId();
        this.name = userDTO.getName();
        this.email = userDTO.getEmail();
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

    public Set<VacationDate> getVacationDateList() {
        return vacationDateList;
    }
}
