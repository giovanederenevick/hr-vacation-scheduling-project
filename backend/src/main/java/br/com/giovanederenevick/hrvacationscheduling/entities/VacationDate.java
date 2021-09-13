package br.com.giovanederenevick.hrvacationscheduling.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "tb_vacation_dates")
public class VacationDate implements Serializable {

    private static final long serialVersionUID = -1490397309511922458L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate startDate;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate endDate;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public VacationDate() {
    }

    public VacationDate(Long id, LocalDate startDate, LocalDate endDate, User user) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
