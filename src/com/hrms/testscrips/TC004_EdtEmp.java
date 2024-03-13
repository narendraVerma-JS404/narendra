package com.hrms.testscrips;
import org.testng.annotations.Test;

import com.hrms.lib.GeneralUniverse;
public class TC004_EdtEmp {

	//public static void main(String args[]) {
	@Test
	public void TC004() {
		
		
		//Test Steps
		
		GeneralUniverse obj = new GeneralUniverse();
		
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.addEmployee();
		obj.edtEmp();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
}
}
