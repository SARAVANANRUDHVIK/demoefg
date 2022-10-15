package org.test;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class check {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();

		driver.get("https://amazon.com/");
		System.out.println();
		//driver.manage().window().maximize();
		//WebElement findElement = driver.findElement(By.id("email"));
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(4000)).takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(),"PNG",new File(System.getProperty("C:\\Users\\Admin\\eclipse-workspace\\87654321\\screenshot.png")));  
		
//		JavascriptExecutor jk= (JavascriptExecutor)driver;
//		jk.executeScript(arguments[0]., args)
//		
//		System.out.println("BROWSER LAUNCH");

		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		System.out.println("BROWSER LAUNCH");


	
	}}

