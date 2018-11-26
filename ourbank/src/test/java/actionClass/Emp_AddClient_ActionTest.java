package actionClass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import actionForm.Emp_AddClient;
import actionForm.Client_Login;
import java.util.Random;

public class Emp_AddClient_ActionTest {

	private Emp_AddClient_Action empAddCientAction;
	private Emp_AddClient empAddClient;
	private String addClient;
	private Client_Login clientLogin;
	private String addClientLogin;
	private Random random;
	private String randomId;

	@Before
	public void setUp() throws Exception {
		empAddCientAction = new Emp_AddClient_Action();
		empAddClient = new Emp_AddClient();
		clientLogin = new Client_Login();
		random = new Random();
	}

	@Test
	public void testAddClient() {

		randomId = String.format("%04d", random.nextInt(10000));
		empAddClient.setAddress("test address");
		empAddClient.setBank_id(randomId);
		empAddClient.setBranch("test branch");
		empAddClient.setCity("test city");
		empAddClient.setDob("9/9/1999");
		empAddClient.setEmail("xyz@abc.com");
		empAddClient.setFirstName("First Cust Name");
		empAddClient.setGender("Male");
		empAddClient.setLandLine("99999999999");
		empAddClient.setLastName("Last Cust Name");
		empAddClient.setMiddleName("Middle Cust Name");
		empAddClient.setMobile("9989876566");
		empAddClient.setState("Karnakata");
		empAddCientAction.setAdd(empAddClient);
		addClient = empAddCientAction.addClient();

		assertEquals("success", addClient);
	}

	@After
	public void testAddClients() {
		clientLogin.setBank_id(randomId);
		clientLogin.setPassword("testcustpass");
		clientLogin.setUserName("testcust");
		empAddCientAction.setAdds(clientLogin);
		addClientLogin = empAddCientAction.addClients();

		assertEquals("success", addClientLogin);
	}

}
