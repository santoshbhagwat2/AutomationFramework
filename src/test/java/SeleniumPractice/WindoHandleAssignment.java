package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindoHandleAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Set<String> windows = driver.getWindowHandles();
      Iterator<String> it = windows.iterator();
      String parantid= it.next();
      String childwinid= it.next();
      driver.switchTo().window(childwinid);
        String childWindowMsg = driver.findElement(By.cssSelector(".example")).getText();
        System.out.println(childWindowMsg);
        driver.switchTo().window(parantid);
        String parantwindwMsg = driver.findElement(By.xpath("//h3")).getText();
        System.out.println(parantwindwMsg);




    }
}
