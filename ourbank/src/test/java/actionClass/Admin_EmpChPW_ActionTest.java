package actionClass;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import actionForm.Admin_EmpChPW;

public class Admin_EmpChPW_ActionTest {
	private Admin_EmpChPW adminEmpChPw;
	private Admin_EmpChPW_Action adminEmpChPWAction;
	private String changePassword;

	@Before
	public void setUp() throws Exception {
		adminEmpChPw = new Admin_EmpChPW();
		adminEmpChPWAction = new Admin_EmpChPW_Action();
	}

	@Test
	public void testChangepw() {
		adminEmpChPw.setBank_id("1234");
		adminEmpChPw.setPassword("emp");
		adminEmpChPw.setCnewpw("emp123");
		adminEmpChPw.setNewpw("emp456");
		adminEmpChPWAction.setChpw(adminEmpChPw);
		changePassword = adminEmpChPWAction.changepw();
		assertEquals("error", changePassword);
	}

}
