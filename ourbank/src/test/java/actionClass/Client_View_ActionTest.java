package actionClass;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.opensymphony.xwork2.ActionContext;

import actionForm.Client_View;

public class Client_View_ActionTest {

	private Client_View clientView;
	private Client_View_Action clientViewAction;
	private Map<String, Object> session;
	private String clientciew;

	@Before
	public void setUp() throws Exception {
		clientViewAction = new Client_View_Action();
		clientView = new Client_View();
		session = new HashMap<String, Object>();
		session.put("user1", "1234");

		ActionContext.setContext(new ActionContext(new HashMap()));
		ActionContext.getContext().setSession(session);

	}

	@Test
	public void testViewcl() {
		clientView.setClid("1234");
		clientViewAction.setView(clientView);
		clientciew = clientViewAction.viewcl();
		assertEquals("success", clientciew);

	}

}
