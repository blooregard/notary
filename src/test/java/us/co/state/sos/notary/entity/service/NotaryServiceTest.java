package us.co.state.sos.notary.entity.service;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import us.co.state.sos.notary.entity.Notary;
import us.co.state.sos.notary.entity.sevices.NotaryService;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={ "classpath:applicationContext.xml"})
@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=false)
public class NotaryServiceTest {
	
	@Before
	public void setup() {
		
	}
	
	@After
	public void teardown() {
		
	}
	
	@Test
	public void create() {
		Notary notary = new Notary();
		notary.setName("Ben Rector");
		
		String value = new NotaryService().create(notary);
		assertEquals("Success", value);
	}

}
