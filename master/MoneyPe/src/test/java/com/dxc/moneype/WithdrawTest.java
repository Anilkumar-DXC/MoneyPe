package com.dxc.moneype;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.test.context.SpringBootTest;
	import org.springframework.boot.test.web.client.TestRestTemplate;
	import org.springframework.boot.web.server.LocalServerPort;
	
	import org.springframework.http.ResponseEntity;
	import org.springframework.test.context.junit4.SpringRunner;
	
import com.dxc.moneype.entities.Withdraw;


	@RunWith(SpringRunner.class)
	@SpringBootTest(classes = MoneyPeApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
	 public class WithdrawTest {
	     @Autowired
	     private TestRestTemplate restTemplate;

	     @LocalServerPort
	     private int port;

	     private String getRootUrl() {
	         return "http://localhost:" + port;
	     }

	     @Test
	     public void contextLoads() {

	     }

	    @Test
	    public void testCreateTransfer() {
	    Withdraw withdraw=new Withdraw();
	       
	    withdraw.setAccountNumber(1278563890);
	    withdraw.setBankIFSC("IDIB567873");
	    withdraw.setAmount(1000);
	    withdraw.setAccountHolder("Pranathi");
	        ResponseEntity<Withdraw> postResponse = restTemplate.postForEntity(getRootUrl() + "/withdraw", withdraw, Withdraw.class);
	        assertNotNull(postResponse);
	        assertNotNull(postResponse.getBody());
	    }

	}
