package com.dxc.moneype;
import static org.junit.jupiter.api.Assertions.*;


import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.test.context.SpringBootTest;
	import org.springframework.boot.test.web.client.TestRestTemplate;
	import org.springframework.boot.web.server.LocalServerPort;
	
	import org.springframework.http.ResponseEntity;
	import org.springframework.test.context.junit4.SpringRunner;
	
import com.dxc.moneype.entities.LifeInsurance;


	@RunWith(SpringRunner.class)
	@SpringBootTest(classes = MoneyPeApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
	 public class LifeInsuranceTest {
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
	       LifeInsurance insurance=new LifeInsurance();
	       
	    	insurance.setPolicyNumber(809990769);
	    
	    	insurance.setAmount(100);
	    
	    
	        ResponseEntity<LifeInsurance> postResponse = restTemplate.postForEntity(getRootUrl() + "/lifeinsurance", insurance, LifeInsurance.class);
	        assertNotNull(postResponse);
	        assertNotNull(postResponse.getBody());
	    }

	}
