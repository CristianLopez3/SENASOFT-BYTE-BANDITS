package com.sena.senasoft.domain.user;


import com.sena.senasoft.domain.devrole.DevRole;
import com.sena.senasoft.domain.form.Form;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    private String email;
    private String password;
    private String education;
    private Date birthDate;
    private String city;

    @Enumerated(EnumType.STRING)
    private Role role;

    /**
     * map many to many with developer role entity (DevRole)
     */
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "tb_users_has_dev_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "roledev_id"))
    private Set<DevRole> devRoles = new HashSet<>();


    @OneToMany(mappedBy = "creator")
    private Set<Form> forms = new HashSet<>();


}
