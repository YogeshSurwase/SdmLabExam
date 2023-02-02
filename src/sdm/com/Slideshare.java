package sdm.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slideshare {
	
	ChromeDriver  driver;
	
	public void open()
	{
		System.setProperty("webdriver.chrome.driver","F:\\Module\\SDM\\Workspace\\Library\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.slideshare.net/"); //Open link
		driver.manage().window().maximize();  //Maximize the page
	}
	public void signUp() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/header/nav/ul/li[3]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div[1]/div[2]/div[2]/a")).click();
		
		//  /html/body/div[4]/div/div/div[1]/div/div/div[1]/div[3]/form/fieldset/div[1]/div[1]/label/div/input
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div[1]/div[3]/form/fieldset/div[1]/div[1]/label/div/input")).sendKeys("Yogesh Surwase");
		
		//  /html/body/div[4]/div/div/div[1]/div/div/div[1]/div[3]/form/fieldset/div[1]/div[2]/label/div/input
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div[1]/div[3]/form/fieldset/div[1]/div[2]/label/div/input")).sendKeys("surwasey1995@gmail.com");
		
		//  /html/body/div[4]/div/div/div[1]/div/div/div[1]/div[3]/form/fieldset/div[1]/div[3]/div/label/div[1]/input
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div[1]/div[3]/form/fieldset/div[1]/div[3]/div/label/div[1]/input")).sendKeys("YogeshS@99");
		
		//  /html/body/div[4]/div/div/div[1]/div/div/div[1]/div[3]/form/fieldset/div[3]/button
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div[1]/div[3]/form/fieldset/div[3]/button")).click();
		
	}
	public void search() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/header/nav/form/div/input[2]")).sendKeys("datastructure ppt");
		driver.findElement(By.xpath("/html/body/header/nav/form/div/button")).click();
	}
	public void openContent() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[1]/a[1]")).click();
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Slideshare o = new Slideshare();
		o.open();
		
		//Perform Sign up
		//o.signUp();
		
		//Search for datastructure ppt
		o.search();
		
		//Open any one ppt 
		o.openContent();
		

	}

}
