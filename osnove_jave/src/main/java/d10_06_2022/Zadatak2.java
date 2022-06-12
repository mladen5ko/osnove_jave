package d10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

//Napisati program koji ucitava stranicu https://geodata.solutions/
//Bira proizvoljan Country, State i City
//Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
//I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
//Izabrerit Country, State i City tako da imate podatke da selektujete!

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        String url = "https://geodata.solutions/";

        driver.get(url);
        driver.manage().window().maximize();

        Select category = new Select(driver.findElement(By.id("countryId")));
        List<WebElement> country = category.getOptions();

        Random random = new Random();
        int low = 2;
        int high = country.size();
        int nxt = random.nextInt(high-low) + low; // iz razloga sto je prvo polje select country u pad. meniju

        category.selectByIndex(nxt);

        Thread.sleep(1000);

        if (elementExist(driver, By.xpath ( "//select[@id='countryId']/option[" + nxt +" ]"))){
            Select category2 = new Select(driver.findElement(By.id("stateId")));
            List<WebElement> state = category2.getOptions();
            Random random2 = new Random();
            int low2 = 2;
            int high2 = state.size();
            int nxt2 = random2.nextInt(high2-low2) + low2;
            category2.selectByIndex(nxt2);
            Thread.sleep(1000);
            if (elementExist(driver, By.xpath("//select[@id='stateId']/option[" + nxt2 + "]"))){
                Select category3 = new Select(driver.findElement(By.id("cityId")));
                List<WebElement> city = category3.getOptions();
                Random random3 = new Random();
                int low3 = 2;
                int high3 = city.size();
                int nxt3 = random3.nextInt(high3-low3) + low3;
                category3.selectByIndex(nxt3);
                Thread.sleep(1000);
                if (elementExist(driver, By.xpath("//select[@id='cityId']/option[" + nxt3 + "]"))){
                    System.out.println("Sve je izabrano!");
                }else {
                    System.out.println("Nije izabrano polje CITY");
                }
            }else {
                System.out.println("Nije izabrano polje STATE");
            }
        }else {
            System.out.println("Nije izabrano polje COUNTRY");
        }
    }

    public static boolean elementExist(WebDriver driver, By by) {
        boolean elementExist = true;
        try {
            driver.findElement(by);
        } catch (Exception e) {
            elementExist = false;
        }
        return  elementExist;
    }
}
