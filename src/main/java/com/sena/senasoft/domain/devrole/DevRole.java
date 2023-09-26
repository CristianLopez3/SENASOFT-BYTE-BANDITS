package com.sena.senasoft.domain.devrole;

import com.sena.senasoft.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_dev_role")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DevRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @ManyToMany(mappedBy = "devRoles", fetch = FetchType.LAZY)
    private Set<User> users = new HashSet<>();
}

