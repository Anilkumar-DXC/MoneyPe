/*
 * 
 * 
 * public class MobileRechargeTest {
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
		
import com.dxc.moneype.entities.MobileRecharge;


		@RunWith(SpringRunner.class)
		@SpringBootTest(classes = MoneyPeApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
		 public class MobileRechargeTest {
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
		       MobileRecharge recharge=new MobileRecharge();
		       
		    	recharge.setMobileNumber(809608149);
		    	recharge.setAmount(100);
		    
		    
		        ResponseEntity<MobileRecharge> postResponse = restTemplate.postForEntity(getRootUrl() + "/mobilerecharge", recharge, MobileRecharge.class);
		        assertNotNull(postResponse);
		        assertNotNull(postResponse.getBody());
		    }

		}