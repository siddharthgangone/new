
		JavascriptExecutor jsec = (JavascriptExecutor)driver;
		jsec.executeScript("scroll(0, 250);");
		List<WebElement> Objlist = driver.findElements(By.xpath("//*[@class='grid-calendar']/div//*[@class='row calendar-week']"));
        
		System.out.println("Rows are extratcted as --- "+ Objlist.size());
		
		
		for (int intcounter=0;intcounter<Objlist.size()-4;intcounter++ ) {
			
			System.out.println("entered the loop " +Objlist.size()    );
			//List<WebElement> Objlist1 = driver.findElements(By.xpath("//*[@class='grid-calendar']/div//*[@class='row calendar-week']"));
			List<WebElement> ObCol	=Objlist.get(intcounter).findElements(By.className("showtime"));
			
			
			System.out.println("ObCol are extratcted as --- "+ ObCol.size());
			for(int intcolcounter=0;intcolcounter<ObCol.size();intcolcounter++)
			
			{
				
				String Hours=ObCol.get(intcolcounter).getText();
				
				System.out.println("we are getting details" +Hours);
				
				
			}
			
			
			
		}
