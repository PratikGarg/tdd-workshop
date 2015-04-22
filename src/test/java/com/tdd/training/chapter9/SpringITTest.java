package com.tdd.training.chapter9;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.tdd.training.services.LowestPriceFinderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-servlet-context.xml")
@WebAppConfiguration
public class SpringITTest {

	@Autowired
	public LowestPriceFinderService lowestPriceFinderService;
	
	@Test
	public void shouldLoadConfigurationCorrectly(){
		Assert.assertNotNull(lowestPriceFinderService);
	}
}
	