package actionClass;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.opensymphony.xwork2.ActionContext;

import actionForm.Emp_Login;

public class Emp_Login_ActionTest {

	private Emp_Login EmpLoginIn;
	private String empLogin;
	private Emp_Login_Action empLoginAction;
	private Map<String, Object> session;

	@Before
	public void setUp() throws Exception {
		EmpLoginIn = new Emp_Login();
		ActionContext empActionContext = new ActionContext(new HashMap());
		ActionContext.setContext(empActionContext);
		session = new HashMap<String, Object>();
		empActionContext.getContext().setSession(session);
		empLoginAction = new Emp_Login_Action();
	}

	@Test
	public void testCheckLogin() {
		EmpLoginIn.setBank_id("1234");
		EmpLoginIn.setPassword("emp");
		EmpLoginIn.setUserName("emp");

		empLoginAction.setLogin(EmpLoginIn);
		empLoginAction.setSession(session);
		empLogin = empLoginAction.checkLogin();

		assertEquals("success", empLogin);
	}

}
