package com.group.miniproject.dto.team.request;

public class TeamCreateRequest {

    private String name;

    public TeamCreateRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
