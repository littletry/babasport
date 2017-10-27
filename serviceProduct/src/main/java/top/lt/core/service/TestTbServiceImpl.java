package top.lt.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.lt.core.bean.TestTb;
import top.lt.core.dao.TestTbDao;

/**
 * @author LittleTry
 * @date 2017-10-27
 */
@Service("testTbService")
@Transactional
public class TestTbServiceImpl implements TestTbService {

    @Autowired
    private TestTbDao testTbDao;

    @Override
    public void insertTestTb(TestTb testTb){
        testTbDao.insertTestTb(testTb);

        //throw new RuntimeException();
    }
}
