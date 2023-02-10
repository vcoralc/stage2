package com.proyecto.stage2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter

@Entity
@Table
public class LogActions {
    @Id
    @SequenceGenerator(
            name="catalogue_sequence",
            sequenceName = "catalogue_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "catalogue_sequence"
    )
    private Long id;
    private String action;
    private String bodyAction;
    private String name;
    private LocalDate date;

    //hacemos un constructor sin el ID porque este genera automatico
    public LogActions(String action, String bodyAction, String name, LocalDate date) {
        this.action = action;
        this.name = name;
        this.date = date;
        this.bodyAction = bodyAction;
    }


}
