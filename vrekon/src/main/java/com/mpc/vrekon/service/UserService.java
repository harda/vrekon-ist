package com.mpc.vrekon.service;

import com.mpc.vrekon.domain.User;
import com.mpc.vrekon.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by hashem on 2/20/17.
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(int todoId) {
        return this.userMapper.getUserById(todoId);
    }
    public List<User> getAll() {
        return this.userMapper.getAll();
    }

}
