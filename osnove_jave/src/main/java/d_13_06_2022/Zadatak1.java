package d_13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
//Napisati program koji ima:
//Podesava:
//implicitno cekanje za trazenje elemenata od 10s
//implicitno cekanje za ucitavanje stranice od 10s
//eksplicitno cekanje podeseno na 10s
//Podaci:
//Potrebno je u projektu ukljuciti 4 slike.
//Imenovanje slika neka bude po pravilu pozicija_ime_prezime_polaznika.ekstenzija
//Npr: front_milan_jovanovic.jpg, left_milan_jovanovic.jpg …
//Koraci:
//Ucitava stranicu https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you
//Maksimizuje prozor
//Selektuje Image - Front klikom na tu karticu u dnu ekrana
//Klik na add photo iz levog navigacionog menia
//Upload slike. Upload preko File objekta koristeci getAbsolutePath
//Sacekati da broj prikazanih slika u donjem uglu navigacije bude za 1 veca
//Kliknuti na poslednje dodatu sliku kako bi bila izabrana za postavljenje
//Ceka da dijalog bude vidljiv
//Klik na Use One Side Only dugme
//Ponoviti proces za Left, Right i Back
//Zatim iz desnog gornjeg ugla izabrati random jedan od ponudjenih konfeta
//Kliknuti na Add To Cart dugme
//Verifikovati postojanje greske Oops! It looks like you`ve not added an text to this field, please add one before continuing.
//Xpath: //*[@action='error']
//Zatvorite pretrazivac
public class Zadatak1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        File slikaFront = new File("src/main/java/d_13_06_2022/Slike/front_mladen_petkovic.jpg");
        File slikaBack = new File("src/main/java/d_13_06_2022/Slike/back_mladen_petkovic.jpg");
        File slikaLeft = new File("src/main/java/d_13_06_2022/Slike/left_mladen_petkovic.jpg");
        File slikaRight = new File("src/main/java/d_13_06_2022/Slike/right_mladen_petkovic.jpg");

        String url = "https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you";
        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@alt='image 1']")).click();

        driver.findElement(By.xpath("//*[@alt='+ Add photo']")).click();

        driver.findElement(By.id("imageUpload")).sendKeys(slikaFront.getAbsolutePath());

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(
                "//div[contains(@class,'sc-ftvSup kAzmBp')]/div/div/img"),
                1));

        driver.findElement(By.id("imageUpload")).sendKeys(slikaBack.getAbsolutePath());

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(
                        "//div[contains(@class,'sc-ftvSup kAzmBp')]/div/div/img"),
                2));

        driver.findElement(By.id("imageUpload")).sendKeys(slikaLeft.getAbsolutePath());

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(
                        "//div[contains(@class,'sc-ftvSup kAzmBp')]/div/div/img"),
                3));

        driver.findElement(By.id("imageUpload")).sendKeys(slikaRight.getAbsolutePath());

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(
                        "//div[contains(@class,'sc-ftvSup kAzmBp')]/div/div/img"),
                4));

        driver.findElement(By.xpath("//div[contains(@class,'sc-ftvSup kAzmBp')]/div[4]/div/img")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("sc-iXxrte")));  //?????? postojanje dialoga

        driver.findElement(By.xpath("//button[text()='Use One Side Only']")).click();

        driver.findElement(By.xpath("//*[@alt='image 2']")).click();

        driver.findElement(By.xpath("//*[@alt='+ Add photo']")).click();

        driver.findElement(By.xpath("//div[contains(@class,'sc-ftvSup kAzmBp')]/div[3]/div/img"))
                .click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("sc-iXxrte")));

        driver.findElement(By.xpath("//button[text()='Use One Side Only']")).click();

        driver.findElement(By.xpath("//*[@alt='image 3']")).click();

        driver.findElement(By.xpath("//*[@alt='+ Add photo']")).click();

        driver.findElement(By.xpath("//div[contains(@class,'sc-ftvSup kAzmBp')]/div[2]/div/img"))
                .click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("sc-iXxrte")));

        driver.findElement(By.xpath("//button[text()='Use One Side Only']")).click();

        driver.findElement(By.xpath("//*[@alt='image 4']")).click();

        driver.findElement(By.xpath("//*[@alt='+ Add photo']")).click();

        driver.findElement(By.xpath("//div[contains(@class,'sc-ftvSup kAzmBp')]/div[1]/div/img")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("sc-iXxrte")));

        driver.findElement(By.xpath("//button[text()='Use One Side Only']")).click();

        driver.findElement(By.name("1")).click();

        driver.findElement(By.xpath("//button[text()='Add to cart ']")).click();

        WebElement error = driver.findElement(By.xpath("//*[@action='error']"));
        if (elementExist(driver,By.xpath("//*[@action='error']"))){
            System.out.println("ERROR: " + error.getAttribute("innerText"));
        }else {
            System.out.println("sve ok");
        }

        driver.quit();

    }
    public static boolean elementExist (WebDriver driver, By by){
        boolean elementExist = true;
        try {
            driver.findElement(by);
        }catch (Exception e){
            elementExist = false;
        }
        return elementExist;
    }
}
