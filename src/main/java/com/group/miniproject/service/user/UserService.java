package com.group.miniproject.service.user;

import com.group.miniproject.domain.team.Team;
import com.group.miniproject.domain.team.TeamRepository;
import com.group.miniproject.domain.user.User;
import com.group.miniproject.domain.user.UserRepository;
import com.group.miniproject.dto.user.request.UserCreateRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final TeamRepository teamRepository;


    public UserService(UserRepository userRepository, TeamRepository teamRepository) {
        this.userRepository = userRepository;
        this.teamRepository = teamRepository;
    }

    @Transactional
    public void saveUser(UserCreateRequest request) {
        userRepository.save(new User(request.getName(),request.getRole(),request.getWorkStartDate(),request.getBirthday()));
    }


}
