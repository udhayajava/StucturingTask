package TestScript;

import com.pages.DashboardPage;
import com.pages.Login;
import com.pages.Verify;
import com.pages.VerifyDashBoard;
import com.seleniumBase.MyBrowser;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TestScriptLogin extends MyBrowser {
    @Test
    public void loginTest() {
        Verify verify = new Verify();
            verify.verifyTitlePage();
            verify.getUserNameBox();
            verify.getPasswordBox();
            verify.getLoginButton();
        Login login = new Login();
            login.enterUserName(properties.getProperty("UserName"));
            login.enterUserPassword(properties.getProperty("PassWord"));
            login.clickLogin();
        DashboardPage dashboardPage = new DashboardPage();
            dashboardPage.isCorrectPage();
        VerifyDashBoard verifyDashBoard = new VerifyDashBoard();
            verifyDashBoard.getLinkCount();
            verifyDashBoard.isChecked();


    }
}
