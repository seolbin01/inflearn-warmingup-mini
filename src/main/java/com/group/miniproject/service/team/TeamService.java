package com.group.miniproject.service.team;

import com.group.miniproject.domain.team.Team;
import com.group.miniproject.domain.team.TeamRepository;
import com.group.miniproject.dto.team.request.TeamCreateRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Transactional
    public void saveTeam(TeamCreateRequest request) {
        teamRepository.save(new Team(request.getName()));
    }

}
