package com.group.miniproject.dto.user.request;

import java.time.LocalDate;

public class UserCreateRequest {

    private String name;

    private String teamName;

    private String role;

    private LocalDate birthday;

    private LocalDate workStartDate;

    public UserCreateRequest(String name, String teamName, String role, LocalDate birthday, LocalDate workStartDate) {
        this.name = name;
        this.teamName = teamName;
        this.role = role;
        this.birthday = birthday;
        this.workStartDate = workStartDate;
    }

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
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
