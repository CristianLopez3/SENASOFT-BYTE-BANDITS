package com.sena.senasoft.domain.options_question;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Table(name = "tb_options_question")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OptionsQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @ManyToOne
    @JoinColumn(name = "question_id")
    private OptionsQuestion questions;
}