package actionClass;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import actionForm.Admin_ClientChPW;

public class Admin_ClientChPW_ActionTest {
	private Admin_ClientChPW adminClientChPw;
	private Admin_ClientChPW_Action adminClientChPWAction;
	private String changePassword;

	@Before
	public void setUp() throws Exception {
		adminClientChPw = new Admin_ClientChPW();
		adminClientChPWAction = new Admin_ClientChPW_Action();
	}

	@Test
	public void testChangepw() {
		adminClientChPw.setBank_id("1234");
		adminClientChPw.setPassword("mindtree");
		adminClientChPw.setCnewpw("admin123");
		adminClientChPw.setNewpw("admin456");
		adminClientChPWAction.setChpw(adminClientChPw);
		changePassword = adminClientChPWAction.changepw();
		assertEquals("error", changePassword);

	}

}
