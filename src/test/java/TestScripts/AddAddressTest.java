package TestScripts;

import java.util.Map;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import GenericLibrarys.BaseClass;

public class AddAddressTest extends BaseClass {
	@Test
	public void addAddressTest() throws InterruptedException {
		Map<String, String> map = excel.getData("Sheet1", "Add Address");
		welcome.clickLoginButton();
		login.loginToApp(map.get("Email"), map.get("Password"));
		Thread.sleep(2000);
		home.clickProfileButton();
		Thread.sleep(2000);
		home.selectMyProfile();
		Thread.sleep(2000);
		myprofile.clickMyAddresses();
		myAddress.clickAddAddress();
		address.addAddressDetails(webUtil, map);
		Thread.sleep(2000);
		AssertJUnit.assertEquals(myAddress.getSuccessMessage(),"successfully added");
		Thread.sleep(5000);
	}
}


