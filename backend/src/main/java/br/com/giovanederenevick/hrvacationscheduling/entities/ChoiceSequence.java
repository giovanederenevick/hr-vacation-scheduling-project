package br.com.giovanederenevick.hrvacationscheduling.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_choice_sequence")
public class ChoiceSequence implements Serializable {

    private static final long serialVersionUID = 6375746099155859568L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public ChoiceSequence() {
    }

    public ChoiceSequence(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
