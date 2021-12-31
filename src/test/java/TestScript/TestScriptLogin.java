package TestScript;

import com.pages.Login;
import com.pages.Verify;
import com.seleniumBase.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScriptLogin extends Browser {
    @Test
    public void loginTest(){
        Verify verify = new Verify();
        verify.verifyTitlePage();
        verify.getUserNameBox();
        verify.getPasswordBox();
        verify.getLoginButton();


     Login login = new Login();
        login.enterUserName("Admin");
        login.enterUserPassword("admin123");
        login.clickLogin();


    }
}
