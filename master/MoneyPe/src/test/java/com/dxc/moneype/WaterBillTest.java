/*
 * 
 * 
 * public class WaterBillTest {
 * 
 * }
 */
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


import com.dxc.moneype.entities.WaterBill;


		@RunWith(SpringRunner.class)
		@SpringBootTest(classes = MoneyPeApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
		 public class WaterBillTest {
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
		    	 WaterBill water=new WaterBill();
		       
		    	water.setCanNumber(809608149);
		    	water.setAmount(100);
		    
		    
		    	 ResponseEntity<WaterBill> postResponse = restTemplate.postForEntity(getRootUrl() + "/waterbill", water, WaterBill.class);
		        assertNotNull(postResponse);
		        assertNotNull(postResponse.getBody());
		    }

		}