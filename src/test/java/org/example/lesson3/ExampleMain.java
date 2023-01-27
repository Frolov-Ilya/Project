package org.example.lesson3;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.sound.midi.Soundbank;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExampleMain {
    public static void main (String[] arks) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com/");

        //Авторизация пользователя

        WebElement entry = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/header/div[1]/nav[2]/ul/li[2]/a"));
        WebElement username = driver.findElement(By.xpath("//*[@id=\"user\"]"));
        WebElement useremail = driver.findElement(By.xpath("//*[@id=\"lj_loginwidget_password\"]"));
        WebElement authorization = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div/div[2]/form[1]/button"));
        List<WebElement> WebElements = driver.findElements(By.name("error"));

        entry.click();
        username.click();
        username.sendKeys("Ilya_Frolov_123");
        useremail.click();
        useremail.sendKeys("Ilya7702045");
        authorization.click();

        //Серфинг по сайту
        WebElement newface = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[1]/a"));
        newface.click();
        WebElement medias = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[2]/a"));
        medias.click();
        WebElement wintertogether = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[3]/a"));
        wintertogether.click();
        WebElement briefly = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[4]/a"));
        briefly.click();
        WebElement video = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[5]/a"));
        video.click();
        WebElement startpage = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/header/div/div/a[1]/span"));
        startpage.click();


        //Написание и удаление комментария

        WebElement food = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[8]/a"));
        food.click();
        WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/section[1]/div/div/div[1]/div[1]/div/div/article/a"));
        webElement1.click();
        WebElement comment1 = driver.findElement(By.xpath("//*[@id=\"multiform\"]/div[4]/div/a"));
        comment1.click();
        WebElement fieldComment1 = driver.findElement(By.xpath("//*[@id=\"new-comment-form-58064\"]/div"));
        fieldComment1.click();
        fieldComment1.sendKeys("Test test");
        WebElement toabbComment1 = driver.findElement(By.xpath("//*[@id=\"comment_submit\"]"));
        toabbComment1.click();


        // Написать блог
        WebElement write = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[3]/header/div[1]/nav[2]/ul/li[4]/a"));
        write.click();
        WebElement title = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/textarea"));
        title.click();
        title.sendKeys("Тест тест");
        WebElement text = driver.findElement(By.xpath("//*[@id=\"editorWrapper\"]/div[1]/div[2]/div/div/div[2]/div"));
        text.click();
        text.sendKeys("Тест тест");
        WebElement webElement2 = driver.findElement(By.xpath("/html/body/div[6]/footer/div/div/div[2]/div[2]/button/span"));
        webElement2.click();
        WebElement initial = driver.findElement(By.xpath("//*[@id=\"content\"]/div/header/section/div/div[1]/a/svg/path[2]"));
        initial.click();



    }
}
