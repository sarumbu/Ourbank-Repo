package actionClass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import actionForm.Admin_AddEmp;
import actionForm.Emp_Login;
import java.util.Random;

public class Admin_AddEmp_ActionTest {
	private Admin_AddEmp_Action adminAddEmpAction;
	private Admin_AddEmp adminAddEmp;
	private String addEmployee;
	private Emp_Login empLogin;
	private String addEmployeeLogin;
	private Random random;
	private String randomId;

	@Before
	public void setUp() throws Exception {
		adminAddEmpAction = new Admin_AddEmp_Action();
		adminAddEmp = new Admin_AddEmp();
		empLogin =  new Emp_Login();
		random = new Random();
	}


	@Test
	public void testAddEmp() {
		randomId = String.format("%04d", random.nextInt(10000));
		adminAddEmp.setAddress("test address");
		adminAddEmp.setBank_id(randomId);
		adminAddEmp.setBranch("test branch");
		adminAddEmp.setCity("test city");
		adminAddEmp.setDob("9/9/1989");
		adminAddEmp.setEmail("abc@abc.com");
		adminAddEmp.setFirstName("Emp FName");
		adminAddEmp.setGender("Female");
		adminAddEmp.setLandLine("99999999999");
		adminAddEmp.setLastName("Emp LName");
		adminAddEmp.setMiddleName("Emp MName");
		adminAddEmp.setMobile("9916215249");
		adminAddEmp.setRole_name("Regional Manager");
		adminAddEmp.setState("Karnakata");
		adminAddEmpAction.setAdd(adminAddEmp);
		addEmployee = adminAddEmpAction.addEmp();

		assertEquals("success", addEmployee);	}

	@After
	public void testAddEmps() {
		empLogin.setBank_id(randomId);
		empLogin.setPassword("testemppass");
		empLogin.setUserName("testemp");
		adminAddEmpAction.setAdds(empLogin);
		addEmployeeLogin = adminAddEmpAction.addEmps();
		
		assertEquals("success", addEmployeeLogin);	}

}
