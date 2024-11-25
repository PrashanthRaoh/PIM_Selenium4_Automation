package pim_Selenium4_Automation;

import java.io.IOException;
import org.testng.annotations.Test;

import common_functions.BaseTest;
import pages.Login_Page;

public class Login extends BaseTest {

	
	@Test
	public void login() throws IOException {
		Login_Page loginPage = new Login_Page(driver);
		loginPage.LogintoPIM();
	}
	
}
