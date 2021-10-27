package com.revature.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		// To start using Selenium WebDriver, we will need to specify the location of
		// the webdriver file
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");

		// Once we specify the location of the webdriver, we can instantiate a WebDriver
		// object
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080"); // the get method will navigate us to the website
		driver.switchTo().defaultContent();

		//addition
		// Locate the 2 input elements and button for adding numbers
		WebElement addInput1 = driver.findElement(By.id("addNum1"));
		WebElement addInput2 = driver.findElement(By.id("addNum2"));
		WebElement addButton = driver.findElement(By.id("addBtn"));

		addInput1.sendKeys("121"); // type 10.5 into the first input element
		addInput2.sendKeys("13"); // type 15.3 into the second input element
		addButton.click(); // Click the button
		
		driver.switchTo().frame("addResult"); // Switch into the inside of the iframe
		WebElement addOutput = driver.findElement(By.tagName("pre")); // find the pre tag that the addition result is embedded into inside of this iframe
		System.out.println("The result of adding 121 and 13 is " + addOutput.getText()); // print out the text of the output element						
		driver.switchTo().defaultContent();
		
		// subtraction
		// Locate the 2 input elements and button for adding numbers
		WebElement subtractInput1 = driver.findElement(By.id("subtractNum1"));
		WebElement subtractInput2 = driver.findElement(By.id("subtractNum2"));
		WebElement subtractButton = driver.findElement(By.id("subtractBtn"));

		subtractInput1.sendKeys("100"); // type 100 into the first input element
		subtractInput2.sendKeys("15"); // type 15 into the second input element
		subtractButton.click(); // Click the button

		driver.switchTo().frame("subtractResult"); // Switch into the inside of the iframe
		WebElement subtractOutput = driver.findElement(By.tagName("pre")); // find the pre tag that the subtraction result is embedded into inside of this iframe
		System.out.println("The result of subtracting 100 and 15 is " + subtractOutput.getText()); // print out the text of the output element
		driver.switchTo().defaultContent();																							

		// multiply
		// Locate the 2 input elements and button for adding numbers
		WebElement multiplyInput1 = driver.findElement(By.id("multiplyNum1"));
		WebElement multiplyInput2 = driver.findElement(By.id("multiplyNum2"));
		WebElement multiplyButton = driver.findElement(By.id("multiplyBtn"));

		multiplyInput1.sendKeys("105"); // type 105 into the first input element
		multiplyInput2.sendKeys("2"); // type 2 into the second input element
		multiplyButton.click(); // Click the button

		driver.switchTo().frame("multiplyResult"); // Switch into the inside of the iframe
		WebElement multiplyOutput = driver.findElement(By.tagName("pre")); // find the pre tag that the multiplication result is embedded into inside of this iframe
		System.out.println("The result of multiplying 105 and 2 is " + multiplyOutput.getText()); // print out the text of the output element
		driver.switchTo().defaultContent();

		// divide
		// Locate the 2 input elements and button for adding numbers
		WebElement divideInput1 = driver.findElement(By.id("divideNum1"));
		WebElement divideInput2 = driver.findElement(By.id("divideNum2"));
		WebElement divideButton = driver.findElement(By.id("divideBtn"));

		divideInput1.sendKeys("120"); // type 120 into the first input element
		divideInput2.sendKeys("5"); // type 5 into the second input element
		divideButton.click(); // Click the button

		driver.switchTo().frame("divideResult"); // Switch into the inside of the iframe
		WebElement divideOutput = driver.findElement(By.tagName("pre")); // find the pre tag that the division result is embedded into inside of this iframe print out the textof the output element
		System.out.println("The result of dividing 120 and 5 is " + divideOutput.getText()); 
		//driver.switchTo().defaultContent();
		Thread.sleep(5000); // Pausing for 5 seconds
		// quit method
		// Whenever you are done with the scripted tasks that you provide to Selenium
		// WebDriver, you should quit the driver
		// This is what will actually close the chromedriver.exe process, and free up
		// the memory allocated to this process
		// So, this is actually an important step
		driver.quit();
	}

}