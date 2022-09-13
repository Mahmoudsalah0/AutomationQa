package Pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class Registration {
    WebDriver driver;


    public Registration(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String randomstring() {
        return (RandomStringUtils.randomAlphabetic(5));
    }

    public void setEmailAddress(String email) {
        driver.findElement(By.cssSelector("[name='email_create']")).sendKeys(email);
    }


    public WebElement createAcc()  {
        return driver.findElement(By.xpath("//button[@name=\"SubmitCreate\"]"));
    }

    public WebElement selectGender() {
        return driver.findElement(By.xpath("//input[@id=\"id_gender1\"]"));
    }

    public void firstname(String firstname) {
          driver.findElement(By.name("customer_firstname")).sendKeys(firstname);
    }

    public void lastname(String lastname) {
         driver.findElement(By.name("customer_lastname")).sendKeys(lastname);
    }

    public void password(String password) {
         driver.findElement(By.id("passwd")).sendKeys(password);
    }

    public void addFirstname(String addFname) {
         driver.findElement(By.id("firstname")).sendKeys(addFname);
    }

    public void addLastname(String AddLname) {
          driver.findElement(By.id("lastname")).sendKeys(AddLname);
    }

    public WebElement company() {
        return driver.findElement(By.id("company"));
    }

    public WebElement address2() {
        return driver.findElement(By.id("address1"));
    }

    public WebElement city() {
        return driver.findElement(By.id("city"));
    }

    public WebElement state() {
        return driver.findElement(By.name("id_state"));
    }

    public WebElement postCode() {
        return driver.findElement(By.name("postcode"));
    }

    public WebElement country() {
        return driver.findElement(By.name("id_country"));
    }

    public WebElement mobileNum() {
        return driver.findElement(By.id("phone_mobile"));
    }

    public WebElement futureRef() {
        return driver.findElement(By.xpath("//input[@name=\"alias\"]"));
    }

    public WebElement registerBtn() {
        return driver.findElement(By.name("submitAccount"));
    }

    public WebElement myAccount() {
        return driver.findElement(By.id("center_column"));
      //  return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
    }

    public WebElement signOut() {
        return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));

    }


}
