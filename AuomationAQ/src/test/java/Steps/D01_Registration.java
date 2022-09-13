package Steps;
import Pages.Home;
import Pages.Registration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class D01_Registration {
    Home home = new Home(Hooks.driver);
    Registration reg = new Registration(Hooks.driver);

    @Given("User Navigate to the registration page from the home page")
    public void navigateToRegPage()  {
        home.navigateToSignUpPage().click();
    }

    @And("User Enter his email to create an new account")
    public void enterEmail() throws InterruptedException {

        reg.setEmailAddress(reg.randomstring() + "2022@gmail.com");

        reg.createAcc().click();

        Thread.sleep(10000);
    }

    @And("User Select the Gender")
    public void gender() {
        reg.selectGender().click();
    }

    @When("User Enter the mandatory info fields in the registration page")
    public void mandatoryInfo()  {
        //Firstname
        reg.firstname(reg.randomstring());

        //Lastname
        reg.lastname(reg.randomstring());

        //Password
        reg.password(reg.randomstring()+"Aasas12541");

        //AddFirstname
        reg.addFirstname(reg.randomstring()+"kj");

        //AddLastname
        reg.addLastname(reg.randomstring()+"as");

        //Company
        reg.company().sendKeys("Afaqy");

        //Address2
        reg.address2().sendKeys("54 St Naser city");

        //City
        reg.city().sendKeys("Naser City");

        //State
        reg.state();
        Select sselect =new Select(reg.state());
        sselect.selectByValue("4");

        //Post Code
        reg.postCode().sendKeys("19542");

        //Country-
        reg.country();
        Select select1 =new Select(reg.country());
        select1.selectByVisibleText("United States");

        //Mobile Number
        reg.mobileNum().sendKeys("01227796542");

        //FutureRef
        reg.futureRef().clear();
        reg.futureRef().sendKeys("My School");
    }

    @Then("User click on register button")
    public void clickRegister() throws InterruptedException {
        reg.registerBtn().click();
        Thread.sleep(10000);
    }
    @And("User could completed registration process successfully")
    public void complateRegister(){
        String Acc = reg.myAccount().getText();
        Assert.assertEquals(Acc, "MY ACCOUNT\n" +
                "Welcome to your account. Here you can manage all of your personal information and orders.\n" +
                "ORDER HISTORY AND DETAILS\n" +
                "MY CREDIT SLIPS\n" +
                "MY ADDRESSES\n" +
                "MY PERSONAL INFORMATION\n" +
                "MY WISHLISTS\n" +
                "Home");
    }

    @And("User could sign out successfully")
    public void signOut() throws InterruptedException {
        reg.signOut().click();
        Thread.sleep(5000);
    }
}

