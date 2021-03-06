package org.jdogma.springstrutstest.action;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertNotNull;

/**
 * @author Kristian Rosenvold
 */
public class TestService2Test extends AbstractTestCase
{
    @Autowired
    TestService testService;

    @org.junit.Test
    public void testExecute() throws Exception {
        assertNotNull( testService);
    }
}