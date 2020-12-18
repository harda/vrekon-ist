package com.bktsh.practice.service;

import com.bktsh.practice.AbstractTest;
import com.bktsh.practice.domain.Todo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static com.bktsh.practice.TestUtil.prettyString;

/**
 * Created on 2017-Feb-16
 */
public class TodoServiceTest extends AbstractTest {

    @Autowired
    private TodoService subject;

    @Test
    public void testGetTodoById() throws Exception {
        Todo result = subject.getTodoById(1);
        System.out.println("--------------------------");
        prettyString(result);
        System.out.println("--------------------------");

    }
    @Test
    public void testGetAll() throws Exception {
        List<Todo> result = subject.getAll();
        System.out.println("--------------------------");
        result.forEach(x -> prettyString(x));
        System.out.println("--------------------------");

    }
}