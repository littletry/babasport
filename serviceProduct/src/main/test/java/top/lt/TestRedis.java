package top.lt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;

/**
 * @author LittleTry
 * @date 2017-11-07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestRedis {

    @Autowired
    private Jedis jedis;

    @Test
    public void testSpringJedis() throws Exception{
        jedis.set("ooo","aaa");
    }


    @Test
    public void testRedis() throws Exception{
        Jedis jedis = new Jedis("192.168.200.128",6379);
        Long pno = jedis.incr("pno");
        System.out.println(pno);
        jedis.close();
    }
}
