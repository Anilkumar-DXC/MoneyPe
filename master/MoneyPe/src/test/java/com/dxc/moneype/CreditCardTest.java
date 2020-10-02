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
	
import com.dxc.moneype.entities.CreditCard;


	@RunWith(SpringRunner.class)
	@SpringBootTest(classes = MoneyPeApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
	 public class CreditCardTest {
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
	    CreditCard card =new CreditCard();
	       
	    	card.setCreditcardNumber(345678990);
	    	card.setAmount(5000);
	    
	    
	        ResponseEntity<CreditCard> postResponse = restTemplate.postForEntity(getRootUrl() + "/creditcard", card, CreditCard.class);
	        assertNotNull(postResponse);
	        assertNotNull(postResponse.getBody());
	    }

	}