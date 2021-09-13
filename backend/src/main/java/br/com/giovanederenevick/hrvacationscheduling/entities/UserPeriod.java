package br.com.giovanederenevick.hrvacationscheduling.entities;

import br.com.giovanederenevick.hrvacationscheduling.entities.enums.SemesterEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "tb_users_periods")
public class UserPeriod implements Serializable {

    private static final long serialVersionUID = 7630896634153408831L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate startDate;
    private LocalDate endDate;
    private Integer semesterEnum;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public UserPeriod() {
    }

    public UserPeriod(Long id, LocalDate startDate, LocalDate endDate, SemesterEnum semesterEnum, User user) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.semesterEnum = semesterEnum.getCod();
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public SemesterEnum getSemesterEnum() {
        return SemesterEnum.toEnum(semesterEnum);
    }

    public void setSemesterEnum(SemesterEnum semesterEnum) {
        this.semesterEnum = semesterEnum.getCod();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
