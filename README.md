@Test(priority=12)
	public void Enterdateofbirth() throws InterruptedException {
		
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
		
			 
			
			
			WebElement dateofbirth=driver.findElement(By.
					 xpath("//input[@class='k-input' and @role= 'spinbutton']"));	
			 
			String value="02/05/1987";
			//js.executeScript("document.getElementByXpath('//input[@class='k-input' and @role= 'spinbutton']').setAttribute('value', '02/05/1987')", dateofbirth);
				
		js.executeScript("arguments[0].value='"+value+"'",dateofbirth);
		Thread.sleep(10000);
		System.out.println(dateofbirth.getAttribute("value"));
		dateofbirth.click();
		Thread.sleep(500);
		//dateofbirth.click();
		//js.executeScript("arguments[0].click()",dateofbirth);
		
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//*[(text()='11')]")));
		//System.out.println(val);
		//dateofbirth.getAttribute("value").
		//dateofbirth.clear();
		//dateofbirth.sendKeys(Keys.TAB);
		//driver.findElement(By.
				 //xpath("//input[@class='k-input' and @role= 'spinbutton']")).sendKeys("02/05/1987");
		
		logger.info("dateofbirth entered");
		ExtentTest test4 =extent.createTest("Smn Test");
		test4.pass("enter date of birth");
		test4.info("dateofbirth entered successfully");
		
		
		
		
		
		
		
	}
	
