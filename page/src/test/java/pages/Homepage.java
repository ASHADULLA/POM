package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Homepage {
public WebDriver driver;
public By uid=By.name("identifier");
public By uiderr=By.xpath("(//*[contains(text(),'Enter an email') or contains(text(),'Sorry, Google')])[1]");

public Homepage(WebDriver driver)
{
this.driver=driver;	
}
public void filluid(String u)
{
driver.findElement(uid).sendKeys(u, Keys.ENTER);
}
}
