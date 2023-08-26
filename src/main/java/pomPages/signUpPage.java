package pomPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v112.css.model.CSSStyleSheetHeader;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signUpPage {
	//Declaration
			@FindBy(id="First Name")
			private WebElement FirstNameTF;
			@FindBy(id="Last Name")
			private WebElement lastNameTF;
			@FindBy(xpath = "//div[@id='Gender']/descendant::label/span[2]")
			private List<WebElement> genderRadioButtons;
			@FindBy(id="Phone Number")
			private WebElement PhoneNumberTF;
			@FindBy(id="Email Address")
			private WebElement emailAddressTF;
			@FindBy(id="Password")
			private WebElement passwordTF;
			@FindBy(id="Confirm Password")
			private WebElement confirmPasswordTF;
			@FindBy(id="T&C")
			private WebElement termsAndConditionsCB;
			@FindBy(id="Register")
			private WebElement rigistarBugtton ;

//Initialization
public signUpPage(WebDriver driver) {
	PageFactory.initElements( driver,this);
	
}
//Utilization
		public void createUserAccount(String FirstName,String lastName,String 
				expectedGender,String phoneNum,String email,String password) {
			FirstNameTF.sendKeys(FirstName);
			lastNameTF.sendKeys(lastName);
			
	
			for(WebElement element:genderRadioButtons) {
				String gender = element.getText();
				if(gender.equals(expectedGender)) {
					element.click();
				break;
			}
			
		}
			PhoneNumberTF.sendKeys(phoneNum);
			emailAddressTF.sendKeys(email);
			passwordTF.sendKeys(password);
			confirmPasswordTF.sendKeys(password);
			termsAndConditionsCB.click();
			try {
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			rigistarBugtton.click();
			
}}