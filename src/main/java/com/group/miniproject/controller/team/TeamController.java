package com.group.miniproject.controller.team;

import com.group.miniproject.dto.team.request.TeamCreateRequest;
import com.group.miniproject.service.team.TeamService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping("/team")
    public void saveTeam(@RequestBody TeamCreateRequest request) {
        teamService.saveTeam(request);
    }
}
