/*
 * 
 * 
 * public class DepositTest {
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
		
import com.dxc.moneype.entities.Deposit;


		@RunWith(SpringRunner.class)
		@SpringBootTest(classes = MoneyPeApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
		 public class DepositTest {
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
		    Deposit deposit=new Deposit();
		       
		    	deposit.setAccountNumber(1278563890);
		        deposit.setBankIFSC("IDIB567873");
		    	deposit.setAmount(1000);
		    	deposit.setAccountHolder("Pranathi");
		        ResponseEntity<Deposit> postResponse = restTemplate.postForEntity(getRootUrl() + "/deposit", deposit, Deposit.class);
		        assertNotNull(postResponse);
		        assertNotNull(postResponse.getBody());
		    }

		}