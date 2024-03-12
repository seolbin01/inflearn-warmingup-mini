package com.group.miniproject.domain.team;

import com.group.miniproject.domain.user.User;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    @Column(nullable = false)
    private String name;

    private String manager;


//    @OneToMany(mappedBy = "team")
//    private List<User> user = new ArrayList<>();

    protected Team() {}

    public Team(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManager() {
        return manager;
    }

//    public List<User> getUser() {
//        return user;
//    }


}
