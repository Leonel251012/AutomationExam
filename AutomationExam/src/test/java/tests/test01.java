package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test01 {

	ChromeDriver driver;
	public static final String txbBuscarArticulos = "//*[@id='gh-ac']";
	public static final String btnBuscarArticulos = "//*[@id=\'gh-btn\']";
	public static final String chckbrand = "//*[@id='e1-53']/a/span";
	public static final String chcksize = "//*[@id='e1-28']/a/span[1]";
	public static final String lblresultado= "//*[@id='cbelm']/div[3]/h1/span[1]";

	@Test
	public void FirstTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\cldonayre\\Desktop\\webdrivers\\chromedriver.exe");//cambiar path
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl = "https://www.ebay.com/";

		driver.get(baseUrl);
		Thread.sleep(5000);
		
		WebElement txbBArticulo = driver.findElement(By.xpath(txbBuscarArticulos));
		txbBArticulo.sendKeys("shoes");
		
		driver.findElement(By.xpath(btnBuscarArticulos)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(chckbrand)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(chcksize)).click();
		Thread.sleep(5000);
		
		WebElement resultado = driver.findElement(By.xpath(lblresultado));
		System.out.println(resultado.getText());
		
		driver.close();
	}
}
