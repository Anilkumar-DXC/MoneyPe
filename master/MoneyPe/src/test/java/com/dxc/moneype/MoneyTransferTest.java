/*
 * 
 * 
 * public class MoneyTransferTest {
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
		
import com.dxc.moneype.entities.MoneyTransfer;


		@RunWith(SpringRunner.class)
		@SpringBootTest(classes = MoneyPeApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
		 public class MoneyTransferTest {
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
		       MoneyTransfer transfer=new MoneyTransfer();
		       
		    	transfer.setAccountNo(1234567890);
		    	transfer.setBankIFSC("IDIB567876");
		    	transfer.setAmount(1000);
		    	transfer.setAccountHolder("Anilkumar");
		        ResponseEntity<MoneyTransfer> postResponse = restTemplate.postForEntity(getRootUrl() + "/moneytransfer", transfer, MoneyTransfer.class);
		        assertNotNull(postResponse);
		        assertNotNull(postResponse.getBody());
		    }

		}