package actionClass;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import actionForm.Admin_Login;
import actionForm.Client_Login;
import daoImpl.Client_Login_DaoImpl;

public class Client_Login_ActionTest {

	private Client_Login clientLoginIn;
	private String clientLogin;
	private Client_Login_Action clientLoginAction;
	private Map<String, Object> session;

	@Before
	public void setUp() throws Exception {
		clientLoginIn = new Client_Login();
		ActionContext clientActionContext = new ActionContext(new HashMap());
		ActionContext.setContext(clientActionContext);
		session = new HashMap<String, Object>();
		clientActionContext.getContext().setSession(session);
		clientLoginAction = new Client_Login_Action();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCheckLogin() {

		clientLoginIn.setBank_id("1234");
		clientLoginIn.setPassword("mindtree");
		clientLoginIn.setUserName("mindtree");

		clientLoginAction.setLogin(clientLoginIn);
		clientLoginAction.setSession(session);
		clientLogin = clientLoginAction.checkLogin();

		assertEquals("success", clientLogin);

	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Object getModel() {
		clientLoginIn = new Client_Login();
		return clientLoginIn;
	}

}
