package GenericLibrarys;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pomPages.AddressFormPage;
import pomPages.CartPage;
import pomPages.HeadPhonesPage;
import pomPages.Homepage;
import pomPages.MyAddressPage;
import pomPages.MyProfilrPage;
import pomPages.ShopperLoginpage;
import pomPages.WelcomePage;
import pomPages.signUpPage;

public class BaseClass {
	
	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected JavaUtility jutil;
	protected WebDriverUtility webUtil;
	public WebDriver driver;
	public static WebDriver sdriver;
	
	protected WelcomePage welcome;
	protected ShopperLoginpage login;
	protected Homepage home;
	protected signUpPage signUp;
	protected MyProfilrPage myprofile;
	protected MyAddressPage myAddress;
	protected HeadPhonesPage headPhones;
	protected CartPage cart;
	protected AddressFormPage address;
	
	//@Beforesuite
	//@BeforeTest
	
	@BeforeClass
	public void classonfiguration() {
		property = new PropertiesUtility();
		excel = new ExcelUtility();
		jutil = new JavaUtility();
		webUtil = new WebDriverUtility();
		
		property.propertiesInit(ConstantPath.PROPERTIES_PATH);
		excel.excelInit(ConstantPath.EXCEL_PATH);
		
	}
	@BeforeMethod
	public void methodconfiguration() {
		driver = webUtil.navigateToApp(property.getData("browser"),
				property.getData("url"),
				Long.parseLong(property.getData("time")));
		sdriver = driver;
		
		welcome = new WelcomePage(driver);
		login = new ShopperLoginpage(driver);
		home = new Homepage(driver);
		signUp = new signUpPage(driver);
		myprofile = new MyProfilrPage(driver);
		myAddress = new MyAddressPage(driver);
		headPhones = new HeadPhonesPage(driver);
		cart = new CartPage(driver);
		address = new AddressFormPage(driver);
		
	}
	@AfterMethod
	public void methodTeardown() {
		home.clickProfileButton();
		home.clickLogout();
		webUtil.closeAllBrowser();
	}
	
	@AfterClass
	public void classTeardown() {
		excel.closeExcel();
		
	}
	
	//@AfterTest
	//@AfterSuite

	}


