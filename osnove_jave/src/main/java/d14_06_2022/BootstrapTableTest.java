package d14_06_2022;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class BootstrapTableTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private String baseUrl = "https://s.bootsnipp.com";
    private String firstName = "Mladen";
    private String lastName = "Petkovic";
    private String middleName = "Novica";

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @BeforeMethod
    public void beforeMethod(){
        driver.get(this.baseUrl + "/iframe/K5yrx");
        Assert.assertEquals(
                driver.getTitle(),
                "Table with Edit and Update Data - Bootsnipp.com",
                "[ERROR] Page title is not valid");
    }

    @Test(priority = 10)
    public void editRow () throws InterruptedException {

        driver.findElement(By.xpath(
                        "//tr[@id='d1']//button[contains(@class,'update')]"))
                .click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
                "//div[@style='display: block;']")));
        WebElement firstName = driver.findElement(By.id("fn"));
        firstName.clear();
        firstName.sendKeys(this.firstName);
        Thread.sleep(1000);
        WebElement lastName = driver.findElement(By.id("ln"));
        lastName.clear();
        lastName.sendKeys(this.lastName);
        Thread.sleep(1000);
        WebElement middleName = driver.findElement(By.id("mn"));
        middleName.clear();
        middleName.sendKeys(this.middleName);
        Thread.sleep(1000);
        driver.findElement(By.id("up")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
                "//div[@style='display: none;']")));

        Assert.assertEquals(driver.findElement(By.xpath(
                "//tr[@id='d1']/td[@id='f1']")).getAttribute("innerText"),
                this.firstName,
                "[ERROR] First name is not 'Mladen'");
        Assert.assertEquals(driver.findElement(By.xpath(
                        "//tr[@id='d1']/td[@id='l1']")).getAttribute("innerText"),
                this.lastName,
                "[ERROR] Last name is not 'Petkovic'");
        Assert.assertEquals(driver.findElement(By.xpath(
                        "//tr[@id='d1']/td[@id='m1']")).getAttribute("innerText"),
                this.middleName,
                "[ERROR] Middle name is not 'Novica'");
        Thread.sleep(2000);
    }

    @Test(priority = 20)
    public void deleteRow(){
        driver.findElement(By.xpath(
                        "//tr[@id='d1']//button[contains(@class,'delete')]"))
                .click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
                "//div[@style='display: block;']")));
        driver.findElement(By.id("del")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
                "//div[@style='display: none;']")));

        List<WebElement> deletedRows = driver.findElements(By.xpath("//tbody/tr[0]"));
        Assert.assertTrue(deletedRows.isEmpty(),
                "[ERROR] First row is not deleted");
    }

    @Test(priority = 30)
    public void takeAScreenshot() throws IOException {
        takeSnapShot(driver, "src/main/resources/Screenshoot.png") ;
    }

    public static void takeSnapShot(WebDriver driver, String filePath) throws IOException {
        TakesScreenshot takesScreenshot =((TakesScreenshot)driver);
        File SrcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("src/main/resources/Screenshoot.png");
        FileHandler.copy(SrcFile, DestFile);
    }


}
