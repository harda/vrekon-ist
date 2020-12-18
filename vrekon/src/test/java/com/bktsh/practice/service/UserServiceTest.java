package com.bktsh.practice.service;

import com.bktsh.practice.AbstractTest;
import com.bktsh.practice.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static com.bktsh.practice.TestUtil.prettyString;
import static org.junit.Assert.*;

/**
 * Created by hashem on 2/20/17.
 */
public class UserServiceTest extends AbstractTest {

    @Autowired
    private UserService subject;

    @Test
    public void getTodoById() throws Exception {
        User result = subject.getUserById(1);
        System.out.println("--------------------------");
        prettyString(result);
        System.out.println("--------------------------");
    }

    @Test
    public void getAll() throws Exception {
        List<User> result = subject.getAll();
        System.out.println("--------------------------");
        result.forEach(x -> prettyString(x));
        System.out.println("--------------------------");

    }

}