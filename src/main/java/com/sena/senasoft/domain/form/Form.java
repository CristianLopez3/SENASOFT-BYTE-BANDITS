package com.sena.senasoft.domain.form;

import com.sena.senasoft.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "tb_forms")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tittle;
    private String description;
    private Date start;
    private Date end;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
