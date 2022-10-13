package com.SettingsTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class SettingMain extends Base_class {

	public static WebDriver driver = getbrowser("opera");

	public static Pom_Class1 pom = new Pom_Class1(driver);

//	public static void main(String[] args) throws InterruptedException {

	
	@Test(priority = 0)

	public void Login() throws InterruptedException {
		// Driver Maximize and Url Launch

		// Driver Maximize and Url Launch

		geturl("https://ehr1.vozo.xyz:444/");
		
		driver.manage().window().maximize();
		// Enter Username

		sendkeys(pom.getinstance().getUsername(), "Admin3");

		// Enter Password

		sendkeys(pom.getinstance().getPassword(), "Admin@123");

		// Click Signin Button '

		Clickonelement(pom.getinstance().getSigninbtn());

		// Click On Month Option

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	
		//////////////////////// settings //////////////
	
	@Test(priority = 1)

	public void Myprofile() throws InterruptedException {
		// click Settings

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		Clickonelement(pom.getSettings().getClickSettingsModule());

		// click account settings

		Thread.sleep(3000);

	//	Clickonelement(pom.getSettings().getclickaccountsettings());

		// send first name

		sendkeys(pom.getSettings().getsendfirst(), "ABCD");

		// send last

		sendkeys(pom.getSettings().getsendlastname(), "xyz");

		// middle name

		sendkeys(pom.getSettings().getsendmiddlename(), "PRR");

		// clcik suffix

		Clickonelement(pom.getSettings().getselectsuffix());

		// select suffix

		Clickonelement(pom.getSettings().getselectmrsuffix());

		// email name

		ClearText(pom.getSettings().getsendmail());

		sendkeys(pom.getSettings().getsendmail(), "xyz@gmail.com");

		// phone

		ClearText(pom.getSettings().getsendphone());

		sendkeys(pom.getSettings().getsendphone(), "123456789");

		// send new pass

		sendkeys(pom.getSettings().getsendnewpass(), "abc@123");

		// send confirm pass

		sendkeys(pom.getSettings().getsendconpass(), "abc@123");

		// send confirm pass

		sendkeys(pom.getSettings().getsendcurrennpass(), "abc@123");

		// get text

		// gettext(pom.getSettings().getgetprofile());

		////////////// click clinical ////////////////

		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		WebElement clinical = wait3
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Clinical')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clinical);

		// Thread.sleep(6000);
		//
		// Clickonelement(pom.getSettings().getclickclini());

		// license

		// clear(pom.getSettings().getcfirstname());

		Clickonelement(pom.getSettings().getlicensety());

		// select license

		Clickonelement(pom.getSettings().getselelicensety());

		// license#

		sendkeys(pom.getSettings().getselelicenseno(), "12345");

		// calender sele

		sendkeys(pom.getSettings().getcalendercl(), "03/16/2022");

		// license state

//		Clickonelement(pom.getSettings().getlicensestate());

		// license state

		Thread.sleep(3000);
		
		sendkeys(pom.getSettings().getNpinumber(), "1234");

		// specality

		Thread.sleep(3000);

		Selectone(pom.getSettings().getSpecality(), "Lactation consulting");

//		Select se = new Select(driver.findElement(By.xpath("(//select[@name='specialty'])[1]")));
		//
//		se.selectByVisibleText("Lactation consulting");

//		Clickonelement(pom.getSettings().getSpecality());
		//
//		Clickonelement(pom.getSettings().getseleSpecality());

		// sele tc

		ClearText(pom.getSettings().getseleTC());

		sendkeys(pom.getSettings().getseleTC(), "123456789");
		
	}

	
	@Test(priority = 3)

	public void Facility() throws InterruptedException {
		////////////// facility info /////////////

		Thread.sleep(3000);

		Clickonelement(pom.getSettings().getselefac());

		// add faci

		Clickonelement(pom.getSettings().getaddselefac());

		// facename

		sendkeys(pom.getSettings().getaddselefacname(), "xyz");

		// facename

		sendkeys(pom.getSettings().getaddselefaccountry(), "abc");

		// facename

		sendkeys(pom.getSettings().getaddselefacadd(), "abc street");

		// facename

		sendkeys(pom.getSettings().getaddselefaczip(), "55555");

		// State

		sendkeys(pom.getSettings().getaddselefacstate(), "abc state");

		// City

		sendkeys(pom.getSettings().getaddselefaccity(), "abc City");

		// phone

		sendkeys(pom.getSettings().getaddseleofficephone(), "123456");

		// phone

		sendkeys(pom.getSettings().getaddseleofficephone(), "123456");

		// fax

		sendkeys(pom.getSettings().getaddfax(), "54321");

		// radio button

		Clickonelement(pom.getSettings().getradiobtntele());

		// cli con btn

		Clickonelement(pom.getSettings().getclicon());

		// Billing add fac

		Thread.sleep(3000);
		Clickonelement(pom.getSettings().getclickbill());

		// pos code

		Selectone(pom.getSettings().getseleposco(), "Telehealth");

		// Facility Npi

		sendkeys(pom.getSettings().getfacnpi(), "54321");

		// Facility Npi

		sendkeys(pom.getSettings().getfacnpi(), "54321");

		// Facility fac num

		sendkeys(pom.getSettings().getfacprovnum(), "456789");

		// billing tax no

		sendkeys(pom.getSettings().getbillingtaxid(), "456789");

		// billing npi no

		sendkeys(pom.getSettings().getbillingnpino(), "456789");

		// clia npi no

		sendkeys(pom.getSettings().getbillingclia(), "03/18/2022");

		// billing npi no

		sendkeys(pom.getSettings().getbillingcliano(), "456789");

		// radio bill fac

		Clickonelement(pom.getSettings().getradiobilfa());

		// close fac

		Clickonelement(pom.getSettings().getclosefac());
		
	}

		////////////////// click user//////////////////
	@Test(priority = 4)

	public void User() throws InterruptedException {
		Thread.sleep(2000);

		Clickonelement(pom.getSettings().getUsersele());

		// click user

		Thread.sleep(2000);

		Clickonelement(pom.getSettings().getaddprovsele());

		// firstname p

		sendkeys(pom.getSettings().getpfirstname(), "hello");

		// last p

		sendkeys(pom.getSettings().getplastname(), "123");

		Thread.sleep(2000);

		// select prime
		Clickonelement(pom.getSettings().getprimpro());

		Clickonelement(pom.getSettings().getprimpro1());

		// select prime

		Clickonelement(pom.getSettings().getprimro2());

		Clickonelement(pom.getSettings().getprimro3());
		// select role

		sendkeys(pom.getSettings().getemailadd(), "xyz@gmail.com");

		// select usernam

		sendkeys(pom.getSettings().getusernam(), "admin");

		// select pass

		sendkeys(pom.getSettings().getpasspro(), "admin@123");

		// select pass

		sendkeys(pom.getSettings().getcpasspro(), "admin@123");

		// select phon

		sendkeys(pom.getSettings().getcphon(), "123456");

		// select phon

		Clickonelement(pom.getSettings().getClickdfac());

		Clickonelement(pom.getSettings().getseledfac());

		// radio

//	Clickonelement(pom.getSettings().getchepror());
//
//	// Federal Tax ID:
//
//	Clickonelement(pom.getSettings().getfedrata());
//
//	// select dea
//
//	sendkeys(pom.getSettings().getdeanu(), "12343");
//
//	// select dea
//
//	sendkeys(pom.getSettings().getjobdes(), "welcome");
//
//	// select dea
//
//	sendkeys(pom.getSettings().gettaxom(), "Hello");
//
//	// select upi
//
//	sendkeys(pom.getSettings().getupinp(), "123");
//
//	// select npi
//
//	sendkeys(pom.getSettings().getNPIP(), "123");
//	// select spe
//
//	Selectone(pom.getSettings().getSpecp(), "Acupuncture");
//
//	// select lic
//
//	Selectone(pom.getSettings().getlicty(), "LCSW");
//
//	// select lic
//
//	sendkeys(pom.getSettings().getlicsen(), "123456");
//
//	// select lic
//
//	sendkeys(pom.getSettings().getcalep(), "03/17/2022");
//
//	// select spe
//
//	Selectone(pom.getSettings().getlicsta(), "AK");
//
//	// add lice
//
//	// Clickonelement(pom.getSettings().getaddlic());
//
//	// dele lice
//
//	// Clickonelement(pom.getSettings().getaddlic());

		// close

		Clickonelement(pom.getSettings().getcloseus());

		// click edit

		Clickonelement(pom.getSettings().getclickedit());

		// close edit

		Clickonelement(pom.getSettings().getcloseclickedit());
		
	}

		//// //////// staff /////////////////
	@Test(priority = 4)

	public void staff() throws InterruptedException {
		Thread.sleep(2000);

		Clickonelement(pom.getSettings().getclistaff());

		// addstaff
		Thread.sleep(2000);

		Clickonelement(pom.getSettings().getcliaddstaff());

		// first name

		sendkeys(pom.getSettings().getfisrtnames(), "abcd");

		// last name

		sendkeys(pom.getSettings().getlastnames(), "efgh");

		// select pp

		Clickonelement(pom.getSettings().getClipripro());

		Clickonelement(pom.getSettings().getselepripro());

		// select role

		Clickonelement(pom.getSettings().getClirole());

		Clickonelement(pom.getSettings().getselerole());

		// select pass

		sendkeys(pom.getSettings().getseleemaiadd(), "admin@gmail.com");

		// select pass

		sendkeys(pom.getSettings().getseleuserna(), "admin123");

		// select pass

		sendkeys(pom.getSettings().getselepass(), "admin123");

		// select pass

		sendkeys(pom.getSettings().getselecpass(), "admin123");

		// select pass

		sendkeys(pom.getSettings().getselehoph(), "123456");

		// select pass

		sendkeys(pom.getSettings().getselecelph(), "123456");

		// select pass
		Clickonelement(pom.getSettings().getCliDF());

		Clickonelement(pom.getSettings().getseleDF());

		// check for provider
//
//	Clickonelement(pom.getSettings().getradiopro());
//
//	// select pass
//
//	sendkeys(pom.getSettings().getfedtaxid(), "123456");
//
//	// select deanum
//
//	sendkeys(pom.getSettings().getdeanump(), "654321");
//
//	// job des
//
//	sendkeys(pom.getSettings().getjobdesp(), "welcome");
//
//	// taxmp
//
//	sendkeys(pom.getSettings().gettaxmp(), "hello");
//
//	// upi
//
//	sendkeys(pom.getSettings().getupinpro(), "123456");
//
//	// npi
//
//	sendkeys(pom.getSettings().getnpipro(), "65432");
//
//	// select spec
//
//	Selectone(pom.getSettings().getspesele(), "Counseling");
//
//	// select spec
//
//	Selectone(pom.getSettings().getlicetyp(), "LICSW");
//
//	// upi
//
//	sendkeys(pom.getSettings().getlicetp(), "123456");
//
//	// upi
//
//	sendkeys(pom.getSettings().getliceexpp(), "03/19/2022");
//
//	// licsta
//
//	Selectone(pom.getSettings().getlicestat(), "AZ");
//
//	// close

		Clickonelement(pom.getSettings().getcloseus());

		// click Settings

		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//
		// Clickonelement(pom.getSettings().getclciksettings());
		
	}		
		
		
	////// My Plan /////
	@Test(priority = 5)

	public void MyPlan() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement element1 = wait1
		.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='My plan'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);

		Thread.sleep(5000);

		// Clickonelement(pom.getSettings_Module().getmyplan());

		// Plan details

//		gettext(pom.getSettings().getplanname());

		// Add Clinicians

		Clickonelement(pom.getSettings().getaddclinicians());

		// Add clinicians

		Clickonelement(pom.getSettings().getincclinicians());

		// reduc clinicians

		Clickonelement(pom.getSettings().getdecclinicians());

		// get pay clinicians

		gettext(pom.getSettings().getpaynowtex());

		// Close Clinicians

		Clickonelement(pom.getSettings().getcloseclini());

		// up bil
		System.out.println("Estimated Monthly Total");
//		gettext(pom.getSettings().getessmontlyto());

		// edit Payment
		Clickonelement(pom.getSettings().geteditpayment());

		// get card name

		gettext(pom.getSettings().getcardholname());

		// card no

		//gettext(pom.getSettings_Module().getcardno());

		// get card name

		//gettext(pom.getSettings_Module().getexpino());

		//cancel ed

		Clickonelement(pom.getSettings().getcanceledi());

		// sub id

		System.out.println("Your Subscription ID");
//		gettext(pom.getSettings().getsubid());
//
//		//cus id
		System.out.println("Your Customer ID");
//		gettext(pom.getSettings().getcusid());

		//select Invoice

		Thread.sleep(6000);

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement invoic = wait2
		.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'Invoice')])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", invoic);


		//Clickonelement(pom.getSettings_Module().getinvoicesele());

		//View Invoice
		Thread.sleep(6000);

	//	Clickonelement(pom.getSettings().getviewinvo());

		//billi Cycl

	//	gettext(pom.getSettings().getbillingcycl());

		//Paid Amount

		System.out.println("Paid Amount");

	//	gettext(pom.getSettings().getpaidam());

		//close invoi
		Thread.sleep(6000);
	//	Clickonelement(pom.getSettings().getcloseinvo());


		System.out.println("My Plan Tested Successfully ");
	}

//////////////////////// Document
	@Test(priority = 6)

	public void Document() throws InterruptedException {
    		Thread.sleep(4000);

			// click Document Button
			Clickonelement(pom.getSettings().getClickDocument());

			Thread.sleep(2000);
			// click Include Logo Radio Button
			Clickonelement(pom.getSettings().getClickRadioButton());

			// Enter Fooder Information
			sendkeys(pom.getSettings().getEnterFooderInfo(), "Hi Team");

			// click Edit option
			Clickonelement(pom.getSettings().getClickEdit());

			// click Macro Clinicion Option
			Clickonelement(pom.getSettings().getClickClinicianOption());

			// click Macro Practice Option
			Clickonelement(pom.getSettings().getClickPracticeOption());

			// click Macro client Option
			Clickonelement(pom.getSettings().getClickClientOption());

			// click Macro Appointment Option
			Clickonelement(pom.getSettings().getClickAppointmentOption());

			// click Macro Links Option
			Clickonelement(pom.getSettings().getClickLinksOption());

			// Enter Subject
			sendkeys(pom.getSettings().getEnterSubject(), "Hi All");

			// click Cancel Option
			Clickonelement(pom.getSettings().getClickCancel());

//					//click SAVE Option
//					Clickonelement(pom.getSettings().getClickSave());  		

			// click Include Logo Radio Button
			Clickonelement(pom.getSettings().getClickRadioButton1());

			// Enter Fooder Information
			sendkeys(pom.getSettings().getClickFooterInfo(), "GOOD MORNING");

			// click Edit option
			Clickonelement(pom.getSettings().getClickEdit1());

			// click Macro Clinicion Option
			Clickonelement(pom.getSettings().getClickClinicianOption1());

			// click Macro Practice Option
			Clickonelement(pom.getSettings().getClickPracticeOption1());

			// click Macro client Option
			Clickonelement(pom.getSettings().getClickClientOption1());

			// click Macro Appointment Option
			Clickonelement(pom.getSettings().getClickAppointmentOption1());

			// click Macro Links Option
			Clickonelement(pom.getSettings().getClickLinksOption1());

			// Enter Subject
			sendkeys(pom.getSettings().getEnterSubject1(), "Hi All");

			// Enter MSG
			sendkeys(pom.getSettings().getEntermsg(), "good morning to all");

			// click Cancel Option
			Clickonelement(pom.getSettings().getClickCancel1());

//					//click SAVE Option
//					Clickonelement(pom.getSettings().getClickSave1());  		

			// Superbills

			// click Include Logo Option
			Clickonelement(pom.getSettings().getClickIncludeLogo1());

			// click Include Signature line option
			Clickonelement(pom.getSettings().getClickIncludeSignatureLine());

			// click Include Diagnosis Description option
			Clickonelement(pom.getSettings().getClickIncludeDiagnosis());

			// clear the already stored text
			// ClearText(pom.getSettings().getClearFooderInfo());

			// Enter Footer Information
			// sendkeys(pom.getSettings().getEnterFooderInformation(), "good ");

			Thread.sleep(2000);

			// Default Superbill Email Edit option
			Clickonelement(pom.getSettings().getclcickEditOption());

			// click Macro Clinicion Option
			Clickonelement(pom.getSettings().getClickClinicianOption2());

			// click Macro Practice Option
			Clickonelement(pom.getSettings().getClickPracticeOption2());

			// click Macro client Option
			Clickonelement(pom.getSettings().getClickClientOption2());

			// click Macro Appointment Option
		//	Clickonelement(pom.getSettings().getClickAppointmentOption2());

			Thread.sleep(3000);
			
			// click Macro Links Option
	//		Clickonelement(pom.getSettings().getClickLinksOption2());

//			// clear the already stored text
//			 ClearText(pom.getSettings().getclearSubject());
//
//			// Enter Subject
//			 sendkeys(pom.getSettings().getEnterSubject2(), "Hello All");
//
////					//clear the already stored text
//					ClearText(pom.getSettings().getclearMsg());  
//					
//					//Enter MSG
//					sendkeys(pom.getSettings().getEntermsg2(), "good morning to all");

			// click Cancel Option
			Clickonelement(pom.getSettings().getClickCancel2());

			// click SAVE Option
			// Clickonelement(pom.getSettings().getClickSave2());

			// click Cancel Option
			Clickonelement(pom.getSettings().getClickIncludeLogo());

			// clear the already stored text
			ClearText(pom.getSettings().getclearFooterInfor());

			// Enter Footer info
			sendkeys(pom.getSettings().getEnterFooterInfor(), "good morning to all");

			// click SAVE Option
			 Clickonelement(pom.getSettings().getClickSAVE());

		
	}

	
		//BILLING AND SERVICES
	@Test(priority = 7)

	public void BILLINGANDSERVICES() throws InterruptedException {
		        Thread.sleep(4000);

		        WebDriverWait wait4 = new WebDriverWait(driver, 10);
				WebElement clinical1 = wait4
						.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='schedule-title m-t-10 f-s-16 for-set-nav-arrow3'])[1]")));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", clinical1);

		        
				// click Billing and Services
				//Clickonelement(pom.getSettings().getClickBilligandServices());

				Thread.sleep(2000);
	}

		//Billing	
	@Test(priority = 8)

	public void Billing() throws InterruptedException {		
				// click Billing
				Clickonelement(pom.getSettings().getClickBillig());

//				// click Billing Currency
				Clickonelement(pom.getSettings().getClickBilligCurrency());
		//
//				// Select USD
				Clickonelement(pom.getSettings().getSelectUSD());
				Thread.sleep(2000);
		//
//				// Enter TaxID
				sendkeys(pom.getSettings().getEnterTaxID(), "123456");
				Thread.sleep(2000);
		//
				// Enter Organization NPI
				sendkeys(pom.getSettings().getEnterOrgNPI(), "456");
		//
				// click Send Verification Button
		//		Clickonelement(pom.getSettings().getclickSendVerification());
		//
		//		Thread.sleep(2000);
		//
				// Enter verification Code
		//		sendkeys(pom.getSettings().getEnterVerificationCode(), "4566");
		//
		//		Thread.sleep(2000);
		//
				// click close
	//			Clickonelement(pom.getSettings().getclickClose());
		//
				// click Submit
				// Clickonelement(pom.getSettings().getclickSubmit());
		//
				// click Send Verification Button
				// Clickonelement(pom.getSettings().getclickSaveInformation());
				
	}
	

		//Services Button
	@Test(priority = 9)

	public void Services() throws InterruptedException {		
				Thread.sleep(6000);

				// click Services Button
				Clickonelement(pom.getSettings().getclickServicesbutton());

				Thread.sleep(2000);

				// click Add services Button
				Clickonelement(pom.getSettings().getclickAddServicesbutton());
				Thread.sleep(2000);
				// click code type
				Clickonelement(pom.getSettings().getclickcodetype());

				// Select code type CVX Immunization
				// sendkeys(pom.getSettings().getSelectCVXImmunization(), "LOINC");

				// Enter Code
				sendkeys(pom.getSettings().getEnterCode(), "007");

				// Enter Fees
				sendkeys(pom.getSettings().getEnterFees(), "7000");

				// Enter Description
				sendkeys(pom.getSettings().getEnterDescription(), "The type of problem");

				// click Cancel Button
				Clickonelement(pom.getSettings().getClickCancelButton());

				// click SAVE Button
				// Clickonelement(pom.getSettings().getClickSaveButton());

				Thread.sleep(2000);
	}
	
				
				// PayerSearch
	@Test(priority = 10)

	public void PayerSearch() throws InterruptedException {	
				// click Payer Search
				Clickonelement(pom.getSettings().getClickPayerSearch());

				// Click New Payer
				Clickonelement(pom.getSettings().getClickNewPayer());

				Thread.sleep(2000);

				// Enter Payer Name
				sendkeys(pom.getSettings().getEnterPayerName(), "UNITED INDIA LIMITED");

				// Enter Payer Address
				sendkeys(pom.getSettings().getEnterPayerAddress(), "Chennai,India");

				// Enter Payer City
				sendkeys(pom.getSettings().getEnterPayerCity(), "Chennai");

				// Select Payer State
		//		Selectone(pom.getSettings().getSlectPayerState(), "TN");

				// Enter Payer City
				sendkeys(pom.getSettings().getEnterPayerZIP(), "600028");

				// Click Close
				Clickonelement(pom.getSettings().getClickclose());

				// Click SAVE
				// Clickonelement(pom.getSettings().getClickSAVEButton());

				// click Billing and Services
				// Clickonelement(pom.getSettings().getClickBilligandServices());

				Thread.sleep(3000);

	}
	@Test(priority = 11)

	public void LAB() throws InterruptedException {			
				// LAB

				// click LAB Button
				Clickonelement(pom.getSettings().getClickLAB());

				// click Add New LAB Button
				Clickonelement(pom.getSettings().getClickAddNew());

				// Lab INformation
				// Enter Organisation
				sendkeys(pom.getSettings().getEnterOrganisation(), "capminds");

				// Enter Phone Number
				sendkeys(pom.getSettings().getEnterPhone(), "9090909");

				// Enter Mobile Number
				sendkeys(pom.getSettings().getEnterMobile(), "9090909");

				// Enter Email
			//	sendkeys(pom.getSettings().getEnterEmail(), "abcd@gmail.com");

				// Enter Address
				sendkeys(pom.getSettings().getEnterAddress(), "No.4,Chennai,India");

				// Enter City
				sendkeys(pom.getSettings().getEnterCity(), "Chennai");

				// Enter State
				sendkeys(pom.getSettings().getEnterState(), "Chennai");

				// Enter State
				sendkeys(pom.getSettings().getEnterPINcode(), "600028");

				// Enter UPIN
				sendkeys(pom.getSettings().getEnterUPIN(), "998");

				// Enter NPI
				sendkeys(pom.getSettings().getEnterNPI(), "6767");

				// Enter TIN
				sendkeys(pom.getSettings().getEnterTIN(), "9898787898");

				// Enter TIN
				sendkeys(pom.getSettings().getEnterTaxonomy(), "91234489898");

				// Click Cancel
			//	 Clickonelement(pom.getSettings().getClickCancelButto());

				// Click SAVE
				// Clickonelement(pom.getSettings().getClickSaveButto());

				// Lab Configuration
				Thread.sleep(4000);
				
				// Click Lab Configuration
				Clickonelement(pom.getSettings().getClickLabConfig());

				// Click Check Active Radio Button
				Clickonelement(pom.getSettings().getCheckActiveRadiobutton());

				// Enter Sender Applicat Name
				sendkeys(pom.getSettings().getEnterApplicantname(), "Ragu");

				// Enter Sender Facility Name
				sendkeys(pom.getSettings().getEnterFacilityname(), "Sundar");

				// Enter Receivers Applicat Name
				sendkeys(pom.getSettings().getEnterApplicantname1(), "laxman");

				// Enter Receivers Facility Name
				sendkeys(pom.getSettings().getEnterFacilityname1(), "kannan");

				// Select SFTP
				Selectone(pom.getSettings().getSelectProtocal(), "SFTP");

				// Enter Login ID
				sendkeys(pom.getSettings().getEnterLoginID(), "Capminds2");

				// Enter Remote Host
				sendkeys(pom.getSettings().getEnterRemoteHost(), "Minds");

				// Enter Result Path
				sendkeys(pom.getSettings().getEnterResultPath(), "RESULT");

				// Enter Orders Path
				sendkeys(pom.getSettings().getEnterOrdersPath(), "Orders");

				// Click Cancel
				Clickonelement(pom.getSettings().getClickCancelButto1());

				// Click SAVE
				// Clickonelement(pom.getSettings().getClickSaveButto1());

				// Click Delete Button
				// Clickonelement(pom.getSettings().getClickDelete());

				// Click Edit Button
				// Clickonelement(pom.getSettings().getClickEditButton());

				// Click Edit Button
				// Clickonelement(pom.getSettings().getClickCancel1Button());
	}
				
				/////////////////// Scheduling
	
	
	@Test(priority = 12)

	public void Scheduling() throws InterruptedException {					
				// Click Scheduling Button
//				WebDriverWait wait10 = new WebDriverWait(driver, 10);
//				WebElement ediii = wait10.until(ExpectedConditions.elementToBeClickable(
//						By.xpath("//div[@class='schedule-title m-t-10 f-s-16 for-set-nav-arrow4']")));
//				((JavascriptExecutor) driver).executeScript("arguments[0].click();", ediii);

				Thread.sleep(4000);
				
				Clickonelement(pom.getSettings().getClickScheduling());

						
				////////////// Calender Settings

				Thread.sleep(4000);
				Clickonelement(pom.getSettings().getClickCalenderSetting());
				
//				// select From time 
//				Selectone(pom.getSettings().getSelectFromTime(), "09");
//				
//				// select To time 
//				Selectone(pom.getSettings().getSelectToTime(), "04");
//				
//				// select week
//				Selectone(pom.getSettings().getSelectWeek(), "Week");
//				
//				// select Dont shows sundays
//				Selectone(pom.getSettings().getSelectDontSun(), "Don't show Sundays");
//				
				// Click sAVE
				Clickonelement(pom.getSettings().getCALICKsAVE());
	}		

	@Test(priority = 13)

	public void Remainder() throws InterruptedException {						
				
		//////////////Appointment  Remainder //////////////

			Thread.sleep(4000);

		//	Clickonelement(pom.getSettings().getfeaturcli());

			// click schedul
//			Thread.sleep(4000);
		//	Clickonelement(pom.getSettings().getclischedul());

//			Clickonelement(pom.getSettings().getapprem());

			// ccli
//			Thread.sleep(4000);

//			Clickonelement(pom.getSettings().getemairad());

			// remail edit

//			WebDriverWait wait3 = new WebDriverWait(driver, 10);
//			WebElement edi = wait3.until(
//					ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'][normalize-space()='Edit'])[1]")));
//			((JavascriptExecutor) driver).executeScript("arguments[0].click();", edi);
//
//			Thread.sleep(6000);

//			Clickonelement(pom.getSettings().getemailedit());
//
//			// remail edit
//
//			Clickonelement(pom.getSettings().getemailcli());
//
//			// remail edit
//
//			Clickonelement(pom.getSettings().getclprae());
//
//			// client
//
//			Clickonelement(pom.getSettings().getclclie());
//
//			// client
//
//			Clickonelement(pom.getSettings().getclcappe());
//
//			// client
//
//		//	Clickonelement(pom.getSettings().getclclinke());
//
//			// remai
//
//		//	ClearText(pom.getSettings().getremsenem());
//
//			sendkeys(pom.getSettings().getremsenem(), "Hello 123 ");
//
//			// msgem
//
//		//	ClearText(pom.getSettings().getmsgema());
//
//			sendkeys(pom.getSettings().getmsgema(), "appiontment  ");
//
//			// cancel
//
//			Clickonelement(pom.getSettings().getcancelema());
//
//			//////////
//
//			// remail edit
//
//			Clickonelement(pom.getSettings().getteleedit());
//
//			// remail edit
//
//			Clickonelement(pom.getSettings().gettelecli());
//
//			// remail edit
//
//			Clickonelement(pom.getSettings().getclpraT());
//
//			// client
//
//			Clickonelement(pom.getSettings().getclcliT());
//
//			// client
//
//			Clickonelement(pom.getSettings().getclcappT());
//
//			// client
//
//			Clickonelement(pom.getSettings().getclclinkT());
//
//			// remai
//
//		//	ClearText(pom.getSettings().getremsentel());
//
//			sendkeys(pom.getSettings().getremsentel(), "Hello 123 ");
//
//			// msgem
//
//		//	ClearText(pom.getSettings().getmsgtele());
//
//			sendkeys(pom.getSettings().getmsgtele(), "Tele appiontment  ");
//
//			// cancel
//
//			Clickonelement(pom.getSettings().getcanceltele());
//
//			/////////////// Voice ///////////////
//
//			// clc voice ar
//			Thread.sleep(4000);
//
//			Clickonelement(pom.getSettings().getvoicear());
//
//			// app remail
//			Thread.sleep(4000);
//
////			Clickonelement(pom.getSettings().getvoicerad());
//
//			// remail edit
//
//			Clickonelement(pom.getSettings().getvoiceedit());
//
//			// remail edit
//
//			Clickonelement(pom.getSettings().getvoicecli());
//
//			// remail edit
//
//			Clickonelement(pom.getSettings().getclpravoice());
//
//			// client
//
//			Clickonelement(pom.getSettings().getclclievoice());
//
//			// client
//
//			Clickonelement(pom.getSettings().getclcappvoice());
//
//			// client
//
//			Clickonelement(pom.getSettings().getclclinkvoice());
//
////						// remai
//			//
////						clear(pom.getSettings().getremsenem());
//			//
////						sendkeys(pom.getSettings().getremsenem(), "Hello 123 ");
//
//			// msgem
//
//	//		ClearText(pom.getSettings().getmsgvoice());
//
//			sendkeys(pom.getSettings().getmsgvoice(), "Voice  appiontment   ");
//
//			// cancel
//
//			Clickonelement(pom.getSettings().getcancelvoice());
//
//		////////////////////text //////////
//
//			// clc voice ar
//			Thread.sleep(4000);
//
//			Clickonelement(pom.getSettings().gettextar());
//
//			// app remail
//			Thread.sleep(4000);
//
//	//		Clickonelement(pom.getSettings().gettextrad());
//
//			// remail edit
//
//			Clickonelement(pom.getSettings().gettextedit());
//
//			// remail edit
//
//			Clickonelement(pom.getSettings().gettextcli());
//
//			// remail edit
//
//			Clickonelement(pom.getSettings().getclpratext());
//
//			// client
//
//			Clickonelement(pom.getSettings().getclclietext());
//
//			// client
//
//			Clickonelement(pom.getSettings().getclcapptext());
//
//			// client
//
//			Clickonelement(pom.getSettings().getclclinktext());
//
////							// remai
//			//
////							clear(pom.getSettings().getremsenem());
//			//
////							sendkeys(pom.getSettings().getremsenem(), "Hello 123 ");
//
//			// msgem
//
//	//		ClearText(pom.getSettings().getmsgtext());
//
//		//	sendkeys(pom.getSettings().getmsgtext(), "text   appiontment   ");
//
//			// cancel
//
//			Clickonelement(pom.getSettings().getcanceltext());
//		
//			Thread.sleep(4000);
	}
//			
	@Test(priority = 14)

	public void Portal() throws InterruptedException {						
				
		
	        WebDriverWait wait6 = new WebDriverWait(driver, 10);
			WebElement clinical4 = wait6.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Patient Portal Settings')]")));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", clinical4);
		
		Thread.sleep(4000);
			// click Patient Portal Settings
//			Clickonelement(pom.getPatientPortalSetting().getclickAccess());
//	
//			Thread.sleep(2000);
//	
//			// click Enable
//	     	Clickonelement(pom.getPatientPortalSetting().getclickEnable());
//	
//			// click Enable again  
//			Clickonelement(pom.getPatientPortalSetting().getclickEnable1());

			// click Online Enable again
//			Clickonelement(pom.getPatientPortalSetting().getOnlineclickEnable1());

			// click Drop down
//			Clickonelement(pom.getPatientPortalSetting().getclickDropdown());
//
//			// select dropdown
//			Clickonelement(pom.getPatientPortalSetting().getSelectDropdown());
//
//			// Click drop down1
//			Clickonelement(pom.getPatientPortalSetting().getclickDropdown1());
//
//			// select dropdown
//			Clickonelement(pom.getPatientPortalSetting().getSelectDropdown1());
//
//			// Click change domain
//			Clickonelement(pom.getPatientPortalSetting().getClickChangeDomain());
//
//			// Click Enter domain
//			sendkeys(pom.getPatientPortalSetting().getEnterDefaultDomain(), "goodlife");
//
//			// Click close
//			Clickonelement(pom.getPatientPortalSetting().getClickClose());

			// ClickSave and Lock
//			Clickonelement(pom.getPatientPortalSetting().getClickSaveandLock());

		Thread.sleep(3000);
		
			// Click Eamil
			Clickonelement(pom.getSettings().getClickEmail());

			Thread.sleep(3000);

			// Click Edit
			Clickonelement(pom.getSettings().getClickEdit());

			// Click Edit
			// Clickonelement(pom.getPatientPortalSetting().getClickEdit());

			// Click Macros1
		//	Clickonelement(pom.getSettings().getClickMacro1());
			
			Thread.sleep(2000);

			// selectk Macros1
		//	Clickonelement(pom.getSettings().getSelectMacro1());

			// Click Macros2
			Clickonelement(pom.getSettings().getClickMacro2());

			// select Macros2
			Clickonelement(pom.getSettings().getSelectMacro2());

			// Click Macros3
			Clickonelement(pom.getSettings().getClickMacro3());
			
			

			// select Macros3
			Clickonelement(pom.getSettings().getSelectMacro3());

//			// Click Macros4
//			Clickonelement(pom.getSettings().getClickMacro4());
//			
//			// select Macros4
//			Clickonelement(pom.getSettings().getSelectMacro4());
			
			// select save
			Clickonelement(pom.getSettings().getClickPatientSave());
			
//			Thread.sleep(2000);
			
//			// Click PatientActivities
//			Clickonelement(pom.getSettings().getClickPatientActivities());
//
//			// Click PatientActivities
//			Clickonelement(pom.getSettings().getClickEdit1());
//
//			// Click Macros5
//			Clickonelement(pom.getSettings().getClickMacros5());
//			
//			Thread.sleep(2000);
//
//			// selectk Macros5
//			Clickonelement(pom.getSettings().getSelectMacros5());
//
//			// Click Macros6
//			Clickonelement(pom.getSettings().getClickMacros6());
//			
//			Thread.sleep(2000);
//
//			// selectk Macros6
//			Clickonelement(pom.getSettings().getSelectMacros6());
//
//			// Click Macros7
//			Clickonelement(pom.getSettings().getClickMacros7());
//			
//			Thread.sleep(2000);
//
//			// selectk Macros7
//			Clickonelement(pom.getSettings().getSelectMacros7());
//
//			// Click Macros8
//			Clickonelement(pom.getSettings().getClickMacros8());
//			
//			Thread.sleep(2000);
//
//			// selectk Macros8
//			Clickonelement(pom.getSettings().getSelectMacros8());
//
//			// click cancel
//			Clickonelement(pom.getSettings().getClickCancel());
//
//			// click save
//			Clickonelement(pom.getSettings().getClickSave());
//
//			// click Writing Review
//			Clickonelement(pom.getSettings().getClickReview());
//
//			// click Save Patient Document
//			Clickonelement(pom.getSettings().getClickSavePatient());
//
//			// click Cancel Patient Document
//			Clickonelement(pom.getSettings().getClickCancel());
//
//	
	}	

		//////////// Administration Senderx ///////////
	
	@Test(priority = 15)

	public void Senderx() throws InterruptedException {						
				
		// admi cli
		Thread.sleep(5000);
		
		WebDriverWait wait62 = new WebDriverWait(driver, 10);
		WebElement clinical42 = wait62.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Administration')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clinical42);

	//	Clickonelement(pom.getSettings().getAdmcli());

		// erx set

		Thread.sleep(2000);

		Clickonelement(pom.getSettings().geterxset());

		// clic fav

	//	Clickonelement(pom.getSettings().getfavpres());

		// Clickonelement(pom.getSettings().getcancelgh());

		//////////////////// ADD med///////

//				WebDriverWait wait1 = new WebDriverWait(driver, 10);
//				WebElement element1 = wait1
//						.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'E-Prescriptions')]")));
//				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);

		// sch cli
		// Thread.sleep(6000);

		// Clickonelement(pom.getSettings().getclicsene());

		// clic fav

		// Clickonelement(pom.getSettings().getadpres());

		// fin med

//		sendkeys(pom.getSettings().getfinmedp(), "a");
//
//		// sel med
//
//		Thread.sleep(5000);
//
//		Clickonelement(pom.getSettings().getselmedp());
//
//		// sel sig
//
//		Thread.sleep(4000);
//
//		Clickonelement(pom.getSettings().getselsigp());
//
//		// sel dos
//
//		Thread.sleep(3000);
//
//		Clickonelement(pom.getSettings().getseldosp());
//
//		// cli dos
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings().getclidosp());
//
//		// sel uni
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings().getselunip());
//
//		// cli uni
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings().getcliunip());
//
//		// sel uni
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings().getselroup());
//
//		// cli uni
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings().getcliroup());

//				// sel uni
//				Thread.sleep(2000);
		//
//				Clickonelement(pom.getSettings().getselfrep());
		//
//				// cli uni
		//
//				Thread.sleep(2000);
		//
//				Clickonelement(pom.getSettings().getclifrep());
		//
//				// sel dir
//				Thread.sleep(1000);
		//
//				Clickonelement(pom.getSettings().getseldirp());
		//
//				// cli dir
		//
//				Thread.sleep(1000);
		//
//				Clickonelement(pom.getSettings().getclidirp());
		//
//				// sel dir
//				Thread.sleep(1000);
		//
//				Clickonelement(pom.getSettings().getseldurp());
		//
//				// cli dir
		//
//				Thread.sleep(1000);
		//
//				Clickonelement(pom.getSettings().getclidurp());

		// cli updat

//		Clickonelement(pom.getSettings().getcliupdp());
//
////				// eff date
//		//
////				Clickonelement(pom.getSettings().geteffdatp());
//		//
////				// sele eff da
//		//
////				Thread.sleep(2000);
//		//
////				Clickonelement(pom.getSettings().geteffdatselp());
//
//		// sen di
//
//		sendkeys(pom.getSettings().getsendip(), "10");
//
//		// dis un
//
//		Clickonelement(pom.getSettings().getdiunp());
//
//		// sele dis
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings().getdiunselp());
//		// sele dis
//
//		sendkeys(pom.getSettings().getrefip(), "10");
//
//		// cli up
//
//		// sendkeys(pom.getSettings().getnotophap(), "Hello 123 ");
//
//		// cli sav
//
//		Clickonelement(pom.getSettings().getclisavp());
//
//		///////////// clic compound ///////////
//
//		Thread.sleep(6000);
//
//		Clickonelement(pom.getSettings().getadpres());
//
//		// cli comp
//
////				WebDriverWait wait2 = new WebDriverWait(driver, 10);
////				WebElement comp = wait2
////						.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[normalize-space()='Compound'])[1]")));
////				((JavascriptExecutor) driver).executeScript("arguments[0].click();", comp);
//
//		Thread.sleep(6000);
//
//		Clickonelement(pom.getSettings().getclicomp());
//
//		// fin med
//
//		sendkeys(pom.getSettings().getfincompp(), "a");
//
//		// sel med
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings().getselcomp());
//
//		// sel sig
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings().getselsigp());
//
//		// sel dos
//
//		Clickonelement(pom.getSettings().getseldosp());
//
//		// cli dos
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings().getclidosp());
//
//		// sel uni
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings().getselunip());
//
//		// cli uni
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings().getcliunip());
//
//		// sel uni
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings().getselroup());
//
//		// cli uni
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings().getcliroup());
//
////				// sel uni
////				Thread.sleep(2000);
//		//
////				Clickonelement(pom.getSettings().getselfrep());
//		//
////				// cli uni
//		//
////				Thread.sleep(2000);
//		//
////				Clickonelement(pom.getSettings().getclifrep());
//		//
////				// sel dir
////				Thread.sleep(1000);
//		//
////				Clickonelement(pom.getSettings().getseldirp());
//		//
////				// cli dir
//		//
////				Thread.sleep(1000);
//		//
////				Clickonelement(pom.getSettings().getclidirp());
//		//
////				// sel dir
////				Thread.sleep(1000);
//		//
////				Clickonelement(pom.getSettings().getseldurp());
//		//
////				// cli dir
//		//
////				Thread.sleep(1000);
//		//
////				Clickonelement(pom.getSettings().getclidurp());
//		//
//		// cli updat
//
//		Clickonelement(pom.getSettings().getcliupdp());
//
////				// eff date
//		//
////				Clickonelement(pom.getSettings().geteffdatp());
//		//
////				// sele eff da
//		//
////				Thread.sleep(2000);
//		//
////				Clickonelement(pom.getSettings().geteffdatselp());
//
//		// sen di
//
//		sendkeys(pom.getSettings().getsendip1(), "10");
//
//		// dis un
//
//		Clickonelement(pom.getSettings().getdiunp());
//
//		// sele dis
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings().getdiunselp());
//		// sele dis
//
//		sendkeys(pom.getSettings().getrefip1(), "10");
//
//		// cli up
//
//		// sendkeys(pom.getSettings().getnotophap(), "Hello 123 ");
//
//		// cli sav
//
//		Clickonelement(pom.getSettings().getclisavp());
//
//		//////////////// click Supply ///////////////////
//
//		Thread.sleep(4000);
//
//		Clickonelement(pom.getSettings().getadpres());
//
//		// cli sup
////				WebDriverWait wait3 = new WebDriverWait(driver, 10);
////				WebElement sup = wait3
////						.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[normalize-space()='Supply'])[1]")));
////				((JavascriptExecutor) driver).executeScript("arguments[0].click();", sup);
//
//		Thread.sleep(6000);
//
//		Clickonelement(pom.getSettings().getclisupp());
//
//		// fin med
//
//		sendkeys(pom.getSettings().getfinsupp(), "a");
//
//		// sel med
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings().getselsupp());
//
//		// sel sig
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings().getselsigp());
//
//		// sel dos
//
//		Clickonelement(pom.getSettings().getseldosp());
//
//		// cli dos
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings().getclidosp());
//
//		// sel uni
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings().getselunip());
//
//		// cli uni
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings().getcliunip());
//
////				// sel uni
////				Thread.sleep(2000);
//		//
////				Clickonelement(pom.getSettings().getselroup());
//		//
////				// cli uni
//		//
////				Thread.sleep(2000);
//		//
////				Clickonelement(pom.getSettings().getcliroup());
//		//
////				// sel uni
////				Thread.sleep(2000);
//		//
////				Clickonelement(pom.getSettings().getselfrep());
//		//
////				// cli uni
//		//
////				Thread.sleep(2000);
//		//
////				Clickonelement(pom.getSettings().getclifrep());
//		//
////				// sel dir
////				Thread.sleep(1000);
//		//
////				Clickonelement(pom.getSettings().getseldirp());
//		//
////				// cli dir
//		//
////				Thread.sleep(1000);
//		//
////				Clickonelement(pom.getSettings().getclidirp());
//		//
////				// sel dir
////				Thread.sleep(1000);
//		//
////				Clickonelement(pom.getSettings().getseldurp());
//		//
////				// cli dir
//		//
////				Thread.sleep(1000);
//		//
////				Clickonelement(pom.getSettings().getclidurp());
//
//		// cli updat
//
//		Clickonelement(pom.getSettings().getcliupdp());
//
////				// eff date
//		//
////				Clickonelement(pom.getSettings().geteffdatp());
//		//
////				// sele eff da
//		//
////				Thread.sleep(2000);
//		//
////				Clickonelement(pom.getSettings().geteffdatselp());
//
//		// sen di
//
//		sendkeys(pom.getSettings().getsendip(), "10");
//
//		// dis un
//
//		Clickonelement(pom.getSettings().getdiunp());
//
//		// sele dis
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettings().getdiunselp());
//		// sele dis
//
//		sendkeys(pom.getSettings().getrefip(), "10");
//
//		// cli up
//
//		// sendkeys(pom.getSettings().getnotophap(), "Hello 123 ");
//
//		// cli sav
//
//		Clickonelement(pom.getSettings().getclisavp());
//		//
////				// cli pre pres
//		//
////				Clickonelement(pom.getSettings().getprepres());
//		//
////				// edi pre pres
//		//
////				Thread.sleep(2000);
//		//
////				Clickonelement(pom.getSettings().getedipres());
//
//		driver.close();
	
		System.out.println("settings successfull");

		
		
	}
}
