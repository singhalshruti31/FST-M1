package HR_Mngt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import java.util.List;

public class Activities {
    public WebDriver driver;

    @BeforeMethod
    public void Setup() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://alchemy.hguy.co/orangehrm");
        Reporter.log("URL is entered in the search bar and is accessed");
        //Find WebElements
        WebElement username_Txt = driver.findElement(By.id("txtUsername"));
        WebElement password_Txt = driver.findElement(By.id("txtPassword"));
        WebElement login_Btn = driver.findElement(By.id("btnLogin"));
        //Enter Credentials
        username_Txt.sendKeys("orange");
        Reporter.log("Username field is given value as 'orange'");
        password_Txt.sendKeys("orangepassword123");
        Reporter.log("Password field is given value as 'orangepassword123'");
        login_Btn.submit();
        Reporter.log("Login button is clicked");
        //Verify Dashboard screen is loaded
        Thread.sleep(3000);
        WebElement dashboard_Lnk = driver.findElement(By.xpath("//h1"));
        dashboard_Lnk.isDisplayed();
        Reporter.log("Dashboard Screen is Loaded");
    }

    @Test
    public void AddNewEmployee() throws InterruptedException {
        //PIM is clicked
        WebElement PIM_Lnk = driver.findElement(By.id("menu_pim_viewPimModule"));
        PIM_Lnk.click();
        Thread.sleep(2000);
        Reporter.log("PIM Link Tab is clicked");
        //Click Add Buton
        WebElement Add_Btn = driver.findElement(By.id("btnAdd"));
        Add_Btn.click();
        Thread.sleep(2000);
        Reporter.log("Add Employee Button is clicked");
        //Enter Mandatory Fields
        WebElement firstname_Txt = driver.findElement(By.id("firstName"));
        WebElement lastname_Txt = driver.findElement(By.id("lastName"));
        WebElement middlename_Txt = driver.findElement(By.id("middleName"));
        WebElement employeeid_Txt = driver.findElement(By.id("employeeId"));
        WebElement save_Btn = driver.findElement(By.id("btnSave"));
        firstname_Txt.sendKeys("Shruti");
        Reporter.log("First Name field is given value as :: Shruti");
        middlename_Txt.sendKeys("Vinod");
        Reporter.log("Middle Name field is given value as :: Vinod");
        lastname_Txt.sendKeys("Singhal");
        Reporter.log("Last Name field is given value as :: Singhal");
        String EmployeeID = employeeid_Txt.getAttribute("value");
        Reporter.log("Employee ID Fetched :: "+EmployeeID);
        save_Btn.click();
        Thread.sleep(2000);
        Reporter.log("Save Button is clicked");
        WebElement employeelist_Lnk = driver.findElement(By.id("menu_pim_viewEmployeeList"));
        employeelist_Lnk.click();
        Thread.sleep(2000);
        Reporter.log("Employee List Tab is clicked");
        WebElement id_Txt = driver.findElement(By.id("empsearch_id"));
        id_Txt.sendKeys(EmployeeID);
        Reporter.log("ID Search field is given value as :: "+EmployeeID);
        //Search Button is clicked
        WebElement search_Btn = driver.findElement(By.id("searchBtn"));
        search_Btn.click();
        Thread.sleep(2000);
        driver.findElement(By.id("resultTable")).isDisplayed();
        WebElement firstmiddlename_Txt = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr/td[3]/a"));
        WebElement lastnamesearch_Txt = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr/td[4]/a"));
        WebElement empid_Txt = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr/td[2]/a"));
        //Verify Created Employee
        Assert.assertEquals(firstmiddlename_Txt.getText(), "Shruti Vinod");
        Reporter.log("First, Middle Name is Verified in searched Results");
        Assert.assertEquals(lastnamesearch_Txt.getText(), "Singhal");
        Reporter.log("Last Name is Verified in searched Results");
        Assert.assertEquals(empid_Txt.getText(), EmployeeID);
        Reporter.log("Employee ID is Verified in searched Results");
    }

    @Test
    public void EditMyProfile(){
        //MyInfo is clicked
        WebElement myinfo_Lnk = driver.findElement(By.id("menu_pim_viewMyDetails"));
        myinfo_Lnk.click();
        Reporter.log("My Info Tab is clicked");
        WebElement edit_Btn = driver.findElement(By.id("btnSave"));
        edit_Btn.click();
        Reporter.log("Edit Button is clicked");
        WebElement firstname_Txt = driver.findElement(By.id("personal_txtEmpFirstName"));
        WebElement lastname_Txt = driver.findElement(By.id("personal_txtEmpLastName"));
        WebElement gendermale_Rdo = driver.findElement(By.id("personal_optGender_1"));
        WebElement nationality_Drp = driver.findElement(By.id("personal_cmbNation"));
        firstname_Txt.clear();
        firstname_Txt.sendKeys("Shruti_Updated");
        Reporter.log("First Name field is given value as :: Shruti_Updated");
        lastname_Txt.clear();
        lastname_Txt.sendKeys("Singhal_Updated");
        Reporter.log("Last Name field is given value as :: Singhal_Updated");
        gendermale_Rdo.click();
        Reporter.log("Male is selected as Gender");
        nationality_Drp.click();
        driver.findElement(By.xpath("(.//*[@id='personal_cmbNation']//option)[5]")).click();
        Reporter.log("Value is selected in Nationality Dropdown");
        WebElement dob_Txt = driver.findElement(By.id("personal_DOB"));
        dob_Txt.click();
        Reporter.log("DOB field is clicked and calendar is opened");
        WebElement dobmonth_Drp = driver.findElement(By.className("ui-datepicker-month"));
        dobmonth_Drp.click();
        driver.findElement(By.xpath("(.//*[@class='ui-datepicker-month']//option)[3]")).click();
        WebElement dobyear_Drp = driver.findElement(By.className("ui-datepicker-year"));
        dobyear_Drp.click();
        driver.findElement(By.xpath("//*[@class='ui-datepicker-year']//option[contains(text(),'1996')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'31')]")).click();
        Reporter.log("Date is selected in DOB field");
        edit_Btn.click();
        Reporter.log("Save Button is clicked");
    }

    @Test
    public void ViewDirectory(){
        //Directory Link is verified to be Visible and Clickable
        WebElement directory_Lnk = driver.findElement(By.id("menu_directory_viewDirectory"));
        if((directory_Lnk.isDisplayed())||(directory_Lnk.isEnabled())) {
            Reporter.log("Directory Link is Visible On Screen");
            Reporter.log("Directory Link is Clickable? :: "+directory_Lnk.isEnabled());
            directory_Lnk.click();
            Reporter.log("Directory Link is Clicked");
            WebElement header = driver.findElement(By.xpath("//h1"));
            Assert.assertEquals(header.getText(), "Search Directory");
            Reporter.log("Header of page is verified as :: Search Directory");
        }
        else
            Reporter.log("Directory Link is not Visible On Screen");
    }

    @Test
    public void AddQualifications() throws InterruptedException {
        //MyInfo is clicked
        WebElement myinfo_Lnk = driver.findElement(By.id("menu_pim_viewMyDetails"));
        myinfo_Lnk.click();
        Reporter.log("My Info Tab is clicked");
        Thread.sleep(2000);
        //Qualifications is clicked
        WebElement qual_Lnk = driver.findElement(By.xpath("(//a[contains(text(),'Qualifications')])[2]"));
        qual_Lnk.click();
        Reporter.log("Qualifications Link is clicked");
        //Add button is clicked
        WebElement add_Btn = driver.findElement(By.id("addWorkExperience"));
        add_Btn.click();
        Reporter.log("Add qualifications button is clicked");
        //Qualifications saved
        WebElement comp_Txt = driver.findElement(By.id("experience_employer"));
        WebElement jobtitle_Txt = driver.findElement(By.id("experience_jobtitle"));
        WebElement from_Txt = driver.findElement(By.id("experience_from_date"));
        WebElement to_Txt = driver.findElement(By.id("experience_to_date"));
        comp_Txt.sendKeys("IBM");
        Reporter.log("Company Name is filled");
        jobtitle_Txt.sendKeys("Automation Test Specialist");
        Reporter.log("Job Title is filled");
        from_Txt.click();
        WebElement dobmonth_Drp = driver.findElement(By.className("ui-datepicker-month"));
        dobmonth_Drp.click();
        driver.findElement(By.xpath("(.//*[@class='ui-datepicker-month']//option)[5]")).click();
        WebElement dobyear_Drp = driver.findElement(By.className("ui-datepicker-year"));
        dobyear_Drp.click();
        driver.findElement(By.xpath("//*[@class='ui-datepicker-year']//option[contains(text(),'2021')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'18')]")).click();
        Reporter.log("From Date is selected");
        Thread.sleep(2000);
        to_Txt.click();
        WebElement dobmonth_Drp1 = driver.findElement(By.className("ui-datepicker-month"));
        dobmonth_Drp1.click();
        driver.findElement(By.xpath("(.//*[@class='ui-datepicker-month']//option)[2]")).click();
        WebElement dobyear_Drp1 = driver.findElement(By.className("ui-datepicker-year"));
        dobyear_Drp1.click();
        driver.findElement(By.xpath("//*[@class='ui-datepicker-year']//option[contains(text(),'2022')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'18')]")).click();
        Reporter.log("To Date is selected");
        WebElement save_Btn = driver.findElement(By.id("btnWorkExpSave"));
        save_Btn.click();
        Reporter.log("Save button is clicked");
    }

    @Test
    public void ApplyForLeave() throws InterruptedException {
        //Click Apply leave Option
        WebElement applyleave_Lnk = driver.findElement(By.xpath("//span[contains(text(),'Apply Leave')]//ancestor::div[1]"));
        applyleave_Lnk.click();
        Reporter.log("Apply Leave Image Link is clicked");
        Thread.sleep(2000);
        //Enter all mandatory fields
        WebElement leavetype_Drp = driver.findElement(By.id("applyleave_txtLeaveType"));
        WebElement leavetype_Opt = driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']/option[2]"));
        WebElement fromdate_Txt = driver.findElement(By.id("applyleave_txtFromDate"));
        WebElement todate_Txt = driver.findElement(By.id("applyleave_txtToDate"));
        leavetype_Drp.click();
        Reporter.log("Leave Type Dropdown is clicked");
        leavetype_Opt.click();
        Reporter.log("Leave type is selected");
        fromdate_Txt.click();
        Reporter.log("From Date field is clicked");
        WebElement dobmonth_Drp = driver.findElement(By.className("ui-datepicker-month"));
        dobmonth_Drp.click();
        driver.findElement(By.xpath("(.//*[@class='ui-datepicker-month']//option)[2]")).click();
        WebElement dobyear_Drp = driver.findElement(By.className("ui-datepicker-year"));
        dobyear_Drp.click();
        driver.findElement(By.xpath("//*[@class='ui-datepicker-year']//option[contains(text(),'2022')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'18')]")).click();
        Reporter.log("From Date is selected");
        Thread.sleep(2000);
        todate_Txt.click();
        Reporter.log("To Date field is clicked");
        WebElement dobmonth_Drp1 = driver.findElement(By.className("ui-datepicker-month"));
        dobmonth_Drp1.click();
        driver.findElement(By.xpath("(.//*[@class='ui-datepicker-month']//option)[2]")).click();
        WebElement dobyear_Drp1 = driver.findElement(By.className("ui-datepicker-year"));
        dobyear_Drp1.click();
        driver.findElement(By.xpath("//*[@class='ui-datepicker-year']//option[contains(text(),'2022')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'19')]")).click();
        Reporter.log("To Date is selected");
        //Apply for Leave
        WebElement apply_Btn = driver.findElement(By.id("applyBtn"));
        apply_Btn.click();
        Reporter.log("Apply button is clicked");
        Thread.sleep(2000);
        //Click My Leaves
        WebElement myleave_Lnk = driver.findElement(By.id("menu_leave_viewMyLeaveList"));
        myleave_Lnk.click();
        Reporter.log("My Leave Link is clicked");
        /*WebElement searchfromdate_Txt = driver.findElement(By.id("calFromDate"));
        WebElement searchtodate_Txt = driver.findElement(By.id("calToDate"));
        searchfromdate_Txt.click();
        Reporter.log("From Date field is clicked");
        WebElement dobmonth_Drp2 = driver.findElement(By.className("ui-datepicker-month"));
        dobmonth_Drp2.click();
        driver.findElement(By.xpath("(.//*[@class='ui-datepicker-month']//option)[2]")).click();
        WebElement dobyear_Drp2 = driver.findElement(By.className("ui-datepicker-year"));
        dobyear_Drp2.click();
        driver.findElement(By.xpath("//*[@class='ui-datepicker-year']//option[contains(text(),'2022')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'18')]")).click();
        Reporter.log("From Date is selected");
        Thread.sleep(2000);
        searchtodate_Txt.click();
        Reporter.log("To Date field is clicked");
        WebElement dobmonth_Drp3 = driver.findElement(By.className("ui-datepicker-month"));
        dobmonth_Drp3.click();
        driver.findElement(By.xpath("(.//*[@class='ui-datepicker-month']//option)[2]")).click();
        WebElement dobyear_Drp3 = driver.findElement(By.className("ui-datepicker-year"));
        dobyear_Drp3.click();
        driver.findElement(By.xpath("//*[@class='ui-datepicker-year']//option[contains(text(),'2022')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'19')]")).click();
        Reporter.log("To Date is selected");
        //Search for leave
        WebElement search_Btn = driver.findElement(By.id("btnSearch"));
        search_Btn.click();
        Reporter.log("Search button is clicked");*/
        //Verify status of leave
        WebElement status_Val = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr[2]/td[6]/a"));
        Assert.assertEquals(status_Val.getText(), "Pending Approval(1.00)");
        Reporter.log("Status of leave is verified");
    }

    @Test
    public void ViewEmergencyContacts(){
        //MyInfo is clicked
        WebElement myinfo_Lnk = driver.findElement(By.id("menu_pim_viewMyDetails"));
        myinfo_Lnk.click();
        Reporter.log("My Info Tab is clicked");
        //Emergency contact is clicked
        WebElement emercont_Lnk = driver.findElement(By.xpath("//a[contains(text(),'Emergency Contacts')]"));
        emercont_Lnk.click();
        Reporter.log("Emergency Contacts Link is clicked");
        //Values are retrieved
        List<WebElement> l = driver.findElements(By.xpath("//table[@id='emgcontact_list']//tbody//tr"));
        for(int i=0; i<l.size(); i++){
            String name = l.get(i).findElement(By.xpath("(//td/a)["+(i+1)+"]")).getText();
            String relationship = driver.findElement(By.xpath("(//tr["+(i+1)+"]/td)[3]")).getText();
            String hometel = driver.findElement(By.xpath("(//tr["+(i+1)+"]/td)[4]")).getText();
            String mobile = driver.findElement(By.xpath("(//tr["+(i+1)+"]/td)[5]")).getText();
            String worktel = driver.findElement(By.xpath("(//tr["+(i+1)+"]/td)[6]")).getText();
            Reporter.log("Name of Emergency contact is :: "+name+" with Relation as :: "+relationship+" with Home Telephone as :: "+hometel+", Mobile No as :: "+mobile+" and Work Telephone as :: "+worktel);
        }
    }

    @AfterMethod
    public void Teardown(){
        //Close the Browser
        driver.close();
        Reporter.log("Closing the Browser window after successful verification of Windows Title");
    }
}
