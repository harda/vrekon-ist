package com.mpc.vrekon.service;

import com.mpc.vrekon.AbstractTest;
import com.mpc.vrekon.domain.Shclog;
import com.mpc.vrekon.service.ShclogService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static com.mpc.vrekon.TestUtil.prettyString;

/**
 * Created on 2017-Feb-16
 */
public class ShclogServiceTest extends AbstractTest {

    @Autowired
    private ShclogService subject;

    @Test
    public void testGetFileM200() throws Exception {
        List<Shclog> result = subject.get210ByDate("08-09-2020");
        System.out.println("--------------------------");
        prettyString(result);
        System.out.println("--------------------------");

    }
   
}