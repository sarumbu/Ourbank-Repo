package actionClass;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import actionForm.Emp_AddTrans;

public class Emp_AddTrans_ActionTest {
	private Emp_AddTrans_Action empAddTransAction;
	private Emp_AddTrans empDepositTrans;
	private Emp_AddTrans empWithdrawTrans;
	private Emp_AddTrans empViewTrans;
	private String deposit;
	private String withdraw;
	private String view;

	@Before
	public void setUp() throws Exception {
		empAddTransAction = new Emp_AddTrans_Action();
		empDepositTrans = new Emp_AddTrans();
		empWithdrawTrans = new Emp_AddTrans();
		empViewTrans = new Emp_AddTrans();
	}

	@Test
	public void testDeposit() {
		empDepositTrans.setAmount("2000");
		empDepositTrans.setDetails("cheque");
		empDepositTrans.setClid("1234");
		empAddTransAction.setDepo(empDepositTrans);
		deposit = empAddTransAction.deposit();
		assertEquals("success", deposit);
	}

	@Test
	public void testWithdrawn() {
		empWithdrawTrans.setAmount("1000");
		empWithdrawTrans.setDetails("cash");
		empWithdrawTrans.setClid("1234");
		empAddTransAction.setWith(empWithdrawTrans);
		withdraw = empAddTransAction.withdrawn();
		assertEquals("success", withdraw);
	}

	@Test
	public void testViewcls() {
		empViewTrans.setClid("1234");
		empAddTransAction.setViews(empViewTrans);
		view = empAddTransAction.viewcls();
		assertEquals("success", view);
	}

}
