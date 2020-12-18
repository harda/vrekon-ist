package com.bktsh.practice.service;

import com.bktsh.practice.AbstractTest;
import com.mpc.vrekon.domain.Shclog;
import com.mpc.vrekon.service.ShclogService;

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
public class ShclogServiceTest extends AbstractTest {

    @Autowired
    private ShclogService subject;

    @Test
    public void testGetTodoById() throws Exception {
        List<Shclog> result = subject.getAll();
        System.out.println("--------------------------");
        prettyString(result);
        System.out.println("--------------------------");

    }
   
}