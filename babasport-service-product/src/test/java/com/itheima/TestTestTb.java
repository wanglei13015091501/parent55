package com.itheima;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.core.pojo.TestTb;
import com.itheima.core.service.TestTbService;

/**
 * 测试Spring整合Mybatis
 * 
 * @author lx
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestTestTb {

	
	@Autowired
//	private TestTbDao testTbDao;
	private TestTbService testTbService;
	
	@Test
	public void testAdd() throws Exception {
		TestTb testTb = new TestTb();
		testTb.setName("阿五");
		testTb.setBirthday(new Date());
		testTbService.insertTestTb(testTb);
	}
}
