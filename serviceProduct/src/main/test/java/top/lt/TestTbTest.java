package top.lt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.lt.core.bean.TestTb;
import top.lt.core.dao.TestTbDao;

import java.util.Date;

/** 测试类  junit + Spring
 * @author LittleTry
 * @date 2017-10-26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestTbTest {

    @Autowired
    private TestTbDao testTbDao;

    @Test
    public void testAdd() throws Exception{

        TestTb testTb = new TestTb();
        testTb.setName("张三");
        testTb.setBirthday(new Date());

        testTbDao.insertTestTb(testTb);
    }
}
