package com.group.miniproject.domain.user;

import com.group.miniproject.domain.team.Team;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    @Column(nullable = false)
    private String name;

    //@ManyToOne
    //private Team team;

    @Column(nullable = false,length = 50)
    private String role;

    private LocalDate birthday;

    private LocalDate workStartDate;

    protected User() {}

    public User(String name, String role, LocalDate birthday, LocalDate workStartDate) {
        this.name = name;
        this.role = role;
        this.birthday = birthday;
        this.workStartDate = workStartDate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate getWorkStartDate() {
        return workStartDate;
    }


}
