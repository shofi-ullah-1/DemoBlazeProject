package com.demoblaze.qa;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {
	
	public void minMaxPrice() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.demoblaze.com/");


		
		//Extract prices and convert to integers
		  
		  List<Integer> allPrice = new ArrayList<>();
		  
		  
		  List<WebElement> productPrice =
		  driver.findElements(By.xpath("//*[@class='card-block']//h5"));
		  
		  
		  //Reads text like $360
		  //Removes $
		  //Converts "360" → 360
		  //Stores it as an Integer
		  for(int i =0; i<productPrice.size(); i++) {
		  //System.out.println(productPrice.get(i).getText());
		  allPrice.add(Integer.parseInt(productPrice.get(i).getText().replace("$","")));
		  }
		  

		  // ----------------------------Maximum-------------------------------------------
		  
		  Collections.sort(allPrice);
		  int max = allPrice.get(0);
		  int secondMax = allPrice.get(0);
		  int thirdMax = allPrice.get(0);
		  for(int i =0; i<allPrice.size(); i++) {
		  System.out.println("Price "+allPrice.get(i));
		  
		  if(allPrice.get(i)  > max) {
			  thirdMax=secondMax;
			  secondMax=max;
			  max=allPrice.get(i);
		  }
		  
		  }
		  System.out.println("Maximum number is : "+max);
		  System.out.println("Second Maximum number is : "+secondMax);
		  System.out.println("Third Maximum number is : "+thirdMax);
		//------------------------------------------------  Minimum --------------------------
		  Collections.reverse(allPrice);
		  int min = allPrice.get(0);
		  int secondMin = allPrice.get(0);
		  int thirdMin = allPrice.get(0);
		  for(int i =0; i<allPrice.size(); i++) {
		  System.out.println("Price "+allPrice.get(i));
		  
		  if(allPrice.get(i)  < min) {
			  thirdMin=secondMin;
			  secondMin=min;
			  min=allPrice.get(i);
		  }
		  
		  }
		  System.out.println("Minimum number is : "+min);
		  System.out.println("Second Minimum number is : "+secondMin);
		  System.out.println("Third Minimum number is : "+thirdMin);
		  
//		 
//		 
		driver.quit();
	}
	
	public static void main(String[] args) {
		DemoBlaze obj = new DemoBlaze();
		obj.minMaxPrice();
	}

	
	

}


