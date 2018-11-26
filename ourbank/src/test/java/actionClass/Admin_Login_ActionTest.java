package actionClass;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.opensymphony.xwork2.ActionContext;

import actionForm.Admin_Login;

public class Admin_Login_ActionTest {

	private Admin_Login adminLoginIn;
	private String adminLogin;
	private Admin_Login_Action adminLoginAction;
	private Map<String, Object> session;

	@Before
	public void setUp() throws Exception {
		adminLoginIn = new Admin_Login();
		ActionContext adminActionContext = new ActionContext(new HashMap());
		ActionContext.setContext(adminActionContext);
		session = new HashMap<String, Object>();
		adminActionContext.getContext().setSession(session);
		adminLoginAction = new Admin_Login_Action();
	}

	@Test
	public void testCheckLogin() {

		adminLoginIn.setBank_id("1234");
		adminLoginIn.setPassword("admin");
		adminLoginIn.setUserName("admin");

		adminLoginAction.setLogin(adminLoginIn);
		adminLoginAction.setSession(session);
		adminLogin = adminLoginAction.checkLogin();

		assertEquals("success", adminLogin);
	}

}
