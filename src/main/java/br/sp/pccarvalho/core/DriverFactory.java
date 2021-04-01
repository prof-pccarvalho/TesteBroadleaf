package br.sp.pccarvalho.core;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DriverFactory {
	
private static WebDriver driver;
	
	private DriverFactory() {}
	
	public static WebDriver getDriver(){
		if(driver == null) {
			switch (Propriedades.browser) {
				case FIREFOX: driver = new FirefoxDriver(); break;
				case CHROME: driver = new ChromeDriver(); break;
			}
			driver.manage().window().setSize(new Dimension(1200, 765));			
		}
		return driver;
	}
	
	public static void killDriver(){
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}

	public static void obterURL() {
		String site = driver.getWindowHandle();
		String sitio = driver.getCurrentUrl();
		System.out.println(sitio);
		System.out.println(site);
		
	}

	public static void aguardarPagina() {
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='DNS Dinâmico']")));
		
	}

	public static WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void trocarPagina() {
		// Opens a new window and switches to new window
		Set<String> WINDOW = driver.getWindowHandles();
		System.out.println(WINDOW);
		//driver.switchTo().window("WINDOW");
		//System.out.println(getDriver().getWindowHandle());
		//System.out.println(getDriver().getWindowHandles());
	}
	
	public static void scrolldown() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0,250)", "");
	}
	
	public static void scrollup() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0,-250)", "");
	}

	
}
