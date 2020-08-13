package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Outlook_Onboarding {
    WebDriver driver;

    @Before
    public  void setup() {
        System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver81.exe");
        driver = new ChromeDriver();
    }

    public WebElement waitForPresence(By by){
        WebDriverWait wait=new WebDriverWait(driver,10);
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }


    @And("I click the Create account link for starting my process")
    public void iClickTheCreateAccountLinkForStartingMyProcess() {
        WebElement createAccountLink = driver.findElement(By.xpath("//div[@class='action']//*[contains (span,'Create free account')]"));
        createAccountLink.click();
    }

    @Given("I navigate to Outlook page")
    public void iNavigateToOutlookPage() {
        driver.navigate().to("https://outlook.live.com/owa/");
        driver.manage().window().maximize();
    }

    @When("I type {string} account name")
    public void iTypeAccountName(String arg0) {
        WebElement memberName = driver.findElement(By.id("MemberName"));
        memberName.sendKeys("eee");
    }

    @And("I try to proceed")
    public void iTryToProceed() {
        WebElement iSignupAction = driver.findElement(By.id("iSignupAction"));
        iSignupAction.click();
    }

    @Then("I should get error message - {string}")
    public void iShouldGetErrorMessage(String arg0) {
    }

    @Then("I should be landed on the password screen")
    public void iShouldBeLandedOnThePasswordScreen() {
    }

    @And("I start to create an account with account name: {string}")
    public void iStartToCreateAnAccountWithAccountName(String arg0) {
    }
    @After
    public  void quit() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
