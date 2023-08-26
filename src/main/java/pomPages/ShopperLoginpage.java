package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopperLoginpage {
	//Declaration
			@FindBy(id="Email")
			private WebElement emailTF;
			//Declaration
			@FindBy(id="Password")
			private WebElement passwordTF;
			//Declaration
			@FindBy(id="Login")
			private WebElement loginButton;
			//Declaration
			@FindBy(name ="Create Account")
			private WebElement createAccountButton;
			
			//Initialization
			public ShopperLoginpage(WebDriver driver) {
				PageFactory.initElements( driver,this);
			}
			
			//Utilization
			public void loginToApp(String email,String password) {
				emailTF.sendKeys(email);
				passwordTF.sendKeys(password);
				loginButton.sendKeys();
			}
			public void clickreateAccountButton() {
				createAccountButton.click();
			}
			
			
			

}
