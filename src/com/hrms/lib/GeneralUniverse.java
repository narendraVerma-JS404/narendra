package com.hrms.lib;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.Log4j;

public class GeneralUniverse extends GlobalUniverse{
	
	// Standard rule: To provide all re-usable fun:/methods related to whole application

public void openApplication() {
	driver = new ChromeDriver();
	driver.navigate().to(url);
	System.out.println("Application Opened");
}
public void login() {
	driver.findElement(By.name(txt_Loginame)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pd);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("Login Completed");
	   Log4j.info("Loginn completed");
}
public void enterFrame() {
	driver.switchTo().frame(iframe);
	System.out.println("Enter into Frame");
	Log4j.info("Enter into Frame");
}
public void exitFrame() {
	driver.switchTo().defaultContent();
	System.out.println("Exit into Frame");
	Log4j.info("Exit into Frame");
}
public void addEmployee() {
    
    driver.findElement(By.xpath(Btn_Add)).click();
    driver.findElement(By.name(FirstName)).sendKeys(efn);
    driver.findElement(By.name(LastName)).sendKeys(eLn);
    driver.findElement(By.id(Btn_Save)).click(); 
    System.out.println("Employee Added Successfully");
}

public void logout() {
	 driver.findElement(By.linkText(link_logout)).click();
	 System.out.println("Logout Completed");
}

public void closeApplication() {
	 driver.quit();
     System.out.println("Application Closed");
}

public void dltEmployee() {
	Select st = new Select(driver.findElement(By.xpath(Btn_SearchBy))); 
	 st.selectByVisibleText(dropDownValue);
	// driver.findElement(By.xpath(Btn_SearchBy));
	 //driver.findElement(By.xpath(dropDownValue)).click();
	 driver.findElement(By.xpath(Btn_SearchFor)).sendKeys(S_For);
	 driver.findElement(By.xpath(Btn_Search)).click();
	 driver.findElement(By.name(checkbox)).click();
	 driver.findElement(By.xpath(Btn_Dlt)).click();
	 
//	 Alert a = driver.switchTo().alert();
//	 System.out.println(a.getText());
//a.dismiss();

	 System.out.println("Delet Employee Successfully");
	String str= driver.findElement(By.xpath(DL_Stmt)).getText();
	System.out.println(str);
}
public void edtEmp() {
	
	driver.findElement(By.xpath(Btn_Edt)).click();        //Edit button
	driver.findElement(By.name(E_fn)).clear();            //Employee First name:PD Page
	driver.findElement(By.name(E_Ln)).clear();            //Employee Last name :
	driver.findElement(By.name(E_fn)).sendKeys(PdFn);     //Edit emp Name
	driver.findElement(By.name(E_Ln)).sendKeys(PdLn);     //Edit emp L.N
	driver.findElement(By.id(Save_Btn )).click();
	System.out.println("Employee Name Change Successfully!!!!!");

}
public void smEdtEmp() {
	Select st = new Select(driver.findElement(By.name("loc_code")));
	st.selectByValue("1");
	//driver.findElement(By.xpath(Btn_SearchBy)).click();
	//driver.findElement(By.xpath(EmpFirstName )).click();
	driver.findElement(By.xpath(Btn_SearchFor)).sendKeys(S_For);
	driver.findElement(By.xpath(Btn_Search)).click();
	driver.findElement(By.xpath(S_emp_name)).click();
	System.out.println("Employee Search Method Successfully done!!!!!!");
}

public void selectEmp() {
	 
	 Select st = new Select(driver.findElement(By.xpath(Btn_SearchBy))); 
	 st.selectByValue(EmpFirstName);
	 driver.findElement(By.xpath(Btn_SearchFor)).sendKeys(efn);
	 driver.findElement(By.xpath(Btn_Search )).click();
	 System.out.println("Select Employee -->Comfirmed");
}

public void adnLocation() throws Exception {
	
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.xpath(Admin_MM ))).perform();
	Thread.sleep(3500);
	ac.moveToElement(driver.findElement(By.linkText(CIF_G))).perform();
	Thread.sleep(3600);
	ac.moveToElement(driver.findElement(By.linkText(loc_info))).perform();
	Thread.sleep(3900);
	driver.findElement(By.linkText(loc_info)).click();
}

public void add_Location() {
	
	driver.findElement(By.xpath(loc_name)).click();
	driver.findElement(By.xpath(edt_btn_lc)).click();
	driver.findElement(By.name(edt_nm_lc)).clear();
	driver.findElement(By.name(edt_nm_lc)).sendKeys(name_Loc);
	Select st = new Select(driver.findElement(By.xpath( dd_cnry_lc )));
	st.selectByValue( drop_down );
	driver.findElement(By.name(stat_p_lc)).sendKeys(s_p_L);
	driver.findElement(By.name(edt_cty_lc)).sendKeys(city );
	driver.findElement(By.name(edt_add_lc)).clear();
	driver.findElement(By.name(edt_add_lc)).sendKeys(Add_Loc);
	driver.findElement(By.name(edt_zc_lc)).clear();
	driver.findElement(By.name(edt_zc_lc)).sendKeys(zip_cdL );
	driver.findElement(By.name(edt_phn_lc )).sendKeys(Ph_no_L );
	driver.findElement(By.name(edt_fax_lc)).sendKeys(fax_Loc);
	driver.findElement(By.name(edt_cmnt_lc )).sendKeys(cmnt_loc );
	driver.findElement(By.xpath(save_btn_lc)).click();
	System.out.println("Location Added Successfully");
}
public void addLoc_Srchmtd() {
	
	Select st = new Select(driver.findElement(By.name("loc_code")));
	st.selectByValue("0");
	
	System.out.println("ID Select");
	driver.findElement(By.xpath(sch_For)).sendKeys("LOC002");
	driver.findElement(By.xpath(sch_btn)).click();
	System.out.println("Location id is displayed*************");
	
	driver.findElement(By.linkText(id_Loc)).click();
	driver.findElement(By.xpath(edt_btn_lc)).click();
	System.out.println("Company location page opened*********For Editing");
	driver.findElement(By.name(edt_nm_lc)).clear();
	driver.findElement(By.name(edt_nm_lc)).sendKeys(name_Loc);
	
	System.out.println("Name is cleared and Changed");
	
	Select vt = new Select(driver.findElement(By.xpath( dd_cnry_lc )));
	vt.selectByValue( drop_down );
	driver.findElement(By.name(stat_p_lc)).sendKeys(s_p_L);
	driver.findElement(By.name(edt_cty_lc)).sendKeys(city );
	driver.findElement(By.name(edt_add_lc)).clear();
	driver.findElement(By.name(edt_add_lc)).sendKeys(Add_Loc);
	
	System.out.println("Location Changed Successfully");
	
	driver.findElement(By.name(edt_zc_lc)).clear();
	driver.findElement(By.name(edt_zc_lc)).sendKeys(zip_cdL );
	driver.findElement(By.name(edt_phn_lc )).sendKeys(Ph_no_L );
	driver.findElement(By.name(edt_fax_lc)).sendKeys(fax_Loc);
	driver.findElement(By.name(edt_cmnt_lc )).sendKeys(cmnt_loc );
	driver.findElement(By.xpath(save_btn_lc)).click();
	System.out.println("Location Added Successfully");
	
	System.out.println("All Things are changed and Testing Excellent");
	
}
public void delete_Location() {
	driver.findElement(By.xpath(chk_Box)).click();
	
	driver.findElement(By.xpath(delet_btn)).click();
	Alert at = driver.switchTo().alert();
	at.accept();
	System.out.println(at.getText());
	 System.out.println("Delet Employee Successfully");
		String str= driver.findElement(By.xpath(Text)).getText();
		System.out.println(str);
	


	
}
}



