package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GlobalUniverse {
public WebDriver driver;

// Standard rule: To provide Test Data & Objects related to whole application
//------->:  Test Data
//------->:  DT    VAR                   VV
    public String url       = "http://183.82.103.245/nareshit/login.php";
    public String un        = "nareshit";
    public String pd        = "nareshit";
    public String efn       = "Suresh";      //Add EMP: First Name
    public String eid       = "3825";      //Add EMP: ID
    public String eLn       = "Sel";         //Add EMP: Last Name
    public String PdFn      = "Mahesh";      //personal detail page======>First name
    public String PdLn      = "Keshri";        //personal detail page=======>last name
    public String S_For     = "radha";      //Search For Name ===========>First name
    public String DltTxt    = "Successfully Deleted"; //stmt Dlt
    
                  //Company Info : General Test Data
    public String com_Nm    = "Opera IT";
    public String ID_Tax    = "Deb010";
    public String Ph_no     = "1020304050";
    public String Add_1     = "Bhopal";
    public String cT        = "Indrapuri";
    public String zip_cd    = "500021";
    public String cmnt      = "Good Employee";
    public String Naics     = "none";
    public String fax       = "3201";
    public String Add_2     = "Telangna";
    public String s_p       = "Ameerpet";
    public String Ret_TxT   = "Successfully Added";  //Successfully Add Location
    public String Ret_txt   = "Successfully Deleted"; //Successfully Delete Location
                //Company Info : Locations Test Data
    
    public String name_Loc  = "Abhinav";
    public String Ph_no_L   = "1020304050";
    public String city      = "Delhi";
    public String zip_cdL   = "500074";
    public String cmnt_loc  = "nothing";
    public String fax_Loc   = "1074";
    public String Add_Loc   = "Telangna s";
    public String s_p_L     = "Ameerpet matrivanam";
    public String drop_down = "IN";
    public String Search_for= "LOC002";
  
   
    		
    
    
    
                  //***********OBJECTS & ELEMENTS

                      //LOGIN ACTIVITY
    public String txt_Loginame  = "txtUserName";                            //Name
    public String txt_password  = "txtPassword";                            //Name
    public String btn_login     = "Submit";                                 //Name
    public String link_logout   = "Logout";                                 //LinkText
    
                      //ENTER INTO FRAME ADD EMPLOYEE
    public String iframe        = "rightMenu";                              //frame
    public String Btn_Add       = "//input['@type=button'][@value='Add']";  //xpath: with multiple Attribute
    public String FirstName     = "txtEmpFirstName";                        //Name  //EMP FN
    public String LastName      = "txtEmpLastName";                         //Name  //EMP LN
    public String Btn_Save      = "btnEdit";                                //id
                      
                      //SEARCH PROCESS
    public String Btn_SearchBy  = "//select[@id='loc_code']";               //xpath relative
    public String Btn_SearchFor = "//input[@id='loc_name']";                //xpath 
    public String Btn_Search    = "//input[@value='Search']";               //xpath relative
    public String EmpFirstName  = "0";                                      //DROPDOWN WITH SEL BY VALUE
    public String dropDownValue = "Emp. ID";                                //linktext
    public String checkbox      = "chkLocID[]";                             //Name
    public String Btn_Dlt       = "//input[@value='Delete']";               //xpath
                    
    //PERSONAL DETAIL PAGE AFTER ADD EMP PROCESS
    public String Btn_Edt       = "//input[@id='btnEditPers']";             //xpath
    public String E_fn          = "txtEmpFirstName";                        //personal detail page==>First name
    public String E_Ln          = "txtEmpLastName";                         //personal detail page==>Last name
    public String Save_Btn      = "btnEditPers";                            //id --personal detail save btn
    public String S_emp_name    = "//*[@id=\"standardView\"]/table/tbody/tr[1]/td[3]/a"; //AFTER SEARCH NAME
    public String DL_Stmt       = "//*[@id=\"standardView\"]/div[2]/span"; //xpath 
    
                     //ADMIN MAIN MENU PAGE
    
    public String Admin_MM      = "//*[@id=\"admin\"]/a/span";             //xpath
    public String CIF_G         = "Company Info"; //LT
    public String Gen_info      = "General";       //LT
    public String Edt_btn       = "//*[@id=\"editBtn\"]"; //xpath
    public String Cmp_name      = "txtCompanyName";  //Name
    public String Tax_id        = "txtTaxID";        //Name
    public String DD_Ctry       = "cmbCountry";        //Name
    public String Adds_1        = "txtStreet1";        //Name
    public String Adds_2        = "txtStreet2";        //Name
    public String ciTy          = "cmbCity";        //Name
    public String zip_Cd        = "txtZIP";        //Name
    public String cmnt_txt      = "txtComments";        //Name
    public String naics         = "txtNAICS";        //Name
    public String Fax_txt       = "txtFax";        //Name
    public String State_pro     = "txtState";        //Name
    public String Save_BtnCIG   = "//*[@id=\"editBtn\"]";        //xpath
    public String Re_set_CIG    = "//*[@id=\"frmGenInfo\"]/div[2]/input[2]";        //xpath
    
                   //ADMIN LOCATIONS DATA
    
    
    public String loc_info      = "Locations";  //LT
    public String sch_By        = "loc_code";  //Name
    public String sch_For       = "//input[@id='loc_name']";  //xpath
    public String sch_btn       = "//input[@value='Search']";  //xpath
    public String ReS_btn       = "/html/body/div/div[2]/form/div[3]/input[3]";  //xpath
    public String add_btn       = "//input[@value='Add']";  //Relative xpath
    public String delet_btn     = "//input[@type='button'][@value='Delete']";  // xpath
    public String chkBox        = "allCheck";  //Name  :Select all
    public String chk_Box       = "/html/body/div/div[2]/form/table/tbody/tr[5]/td[1]/input";  //Name :Perticular select
    public String loc_name      = "/html/body/div/div[2]/form/table/tbody/tr[1]/td[3]/a";  //After Search location
    public String id_Loc        = "LOC002";
    public String dlt_Txt_IsP   = "Successfully Deleted";  //Link Text
    public String Text          = "/html/body/div/div[2]/form/div[2]/span";
    
                  //COMPNY INFO LOCATION EDIT
    
    public String edt_btn_lc     = "//input[@id='editBtn']";  //xpath
    public String edt_nm_lc      = "txtLocDescription";  //NAME
    public String dd_cnry_lc     = "//select[@id='cmbCountry']";  //value
    public String stat_p_lc      = "txtState";  //NAME
    public String edt_cty_lc     = "cmbDistrict";  //NAME
    public String edt_add_lc     = "txtAddress";  //NAME
    public String edt_zc_lc      = "txtZIP";  //NAME
    public String edt_phn_lc     = "txtPhone";  //NAME
    public String edt_fax_lc     = "txtFax";  //NAME
    public String edt_cmnt_lc    = "txtComments";  //NAME
    public String save_btn_lc    = "//input[@id='editBtn']";  //REL:xpath
    public String reSet_btn_lc   = "//input[@value='Reset']";  //REL:xpath
    public String Ret_txt_lc     = "Successfully Added";   //Link text
    
    
    

    
 
    
}
