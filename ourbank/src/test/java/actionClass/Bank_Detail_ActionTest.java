package actionClass;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Bank_Detail_ActionTest {

	private Bank_Detail_Action bankDetailAction;
	private String bankDetail;

	@Before
	public void setUp() throws Exception {
		bankDetailAction = new Bank_Detail_Action();
	}

	@Test
	public void testExecute() {
		bankDetail = bankDetailAction.execute();
		assertEquals("success", bankDetail);

	}

}
