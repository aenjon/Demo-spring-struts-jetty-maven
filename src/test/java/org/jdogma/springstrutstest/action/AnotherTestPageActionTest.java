package org.jdogma.springstrutstest.action;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Kristian Rosenvold
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext-web.xml"})
public class AnotherTestPageActionTest
{
    @org.junit.Test
    public void testExecute() throws Exception {
    }
}
