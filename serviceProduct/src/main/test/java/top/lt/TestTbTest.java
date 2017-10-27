package top.lt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.lt.core.service.TestTbService;
import top.lt.core.bean.TestTb;

import java.util.Date;

/** 测试类  junit + Spring
 * @author LittleTry
 * @date 2017-10-26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestTbTest {

    @Autowired
    private TestTbService testTbService;

    @Test
    public void testAdd() throws Exception{

        TestTb testTb = new TestTb();
        testTb.setName("小李");
        testTb.setBirthday(new Date());

        testTbService.insertTestTb(testTb);
    }
}
