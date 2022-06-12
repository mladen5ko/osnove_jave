package d10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

//Napisati program koji:
//Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
//Klikce na svaki iks da ugasi obavestenje i proverava da li se nakon klika element obrisao sa stranice
// i ispisuje odgovarajuce poruke (OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
//POMOC: Brisite elemente odozdo.
//(ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo
public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        String url = "https://s.bootsnipp.com/iframe/Dq2X";

        driver.get(url);
        driver.manage().window().maximize();

        List<WebElement> xButons =
                driver.findElements(By.xpath("//div/button[@type='button']"));

        for (int i = xButons.size(); i > 0; i--) {
            if (elementExist(driver, By.xpath("//div[last()]/button[@type='button']"))) {
                Thread.sleep(2000);
                driver.findElement(By.xpath("//div[last()]/button[@type='button']")).click();
                System.out.println("Element " + (i) + " je obrisan");
            }else {
                System.out.println("Element " + (i+1) + " nije obrisan");
            }
        }

        //Za vezbanje brisanje odozgo
//        for (int i = 0; i < xButons.size(); i++) {
//            if (elementExist(driver, By.xpath("//div[" + 1 + "]/button[@type='button']"))) {
//                driver.findElement(By.xpath("//div[" + 1 + "]/button[@type='button']")).click();
//                System.out.println("Element " + (i+1) + " je obrisan");
//                Thread.sleep(2000);
//            }else {
//                System.out.println("Element " + (i+1) + " nije obrisan");
//            }
//        }
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
