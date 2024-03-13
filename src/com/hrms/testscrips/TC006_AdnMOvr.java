package com.hrms.testscrips;

import org.testng.annotations.Test;

import com.hrms.lib.GeneralUniverse;

public class TC006_AdnMOvr {
	
	//public static void main(String[] args) throws Exception{
	@Test
	public void TC006() throws Exception {
		
	      //Test Steps
		
GeneralUniverse obj = new GeneralUniverse();

                obj.openApplication();
                obj.login();
                Thread.sleep(4000);
                obj.adnLocation();
                obj.enterFrame();
                //obj.add_Location();
                //obj.addLoc_Srchmtd();
                obj.delete_Location();
                obj.exitFrame();
                obj.logout();
                obj.closeApplication();
                
                
              
		
	}
	

}
