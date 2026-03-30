package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandleExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@href='http://qasummit.org/']")).click();
        Set<String> window =driver.getWindowHandles();
        Iterator<String> it= window.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        System.out.println(window);
    }

}

