package com.hrms.testscrips;
import org.testng.annotations.Test;

import com.hrms.lib.GeneralUniverse;
public class TC003_DltEmp {

//public static void main(String args[]) throws Exception{
	@Test
	public void TC003() throws InterruptedException {;
		
		//Test Steps

	GeneralUniverse obj = new GeneralUniverse();
	
	obj.openApplication();
	obj.login();
	obj.enterFrame();
	Thread.sleep(2000);
	//obj.selectEmp();
	obj.dltEmployee();
	obj.exitFrame();
	obj.logout();
	obj.closeApplication();
}
}
