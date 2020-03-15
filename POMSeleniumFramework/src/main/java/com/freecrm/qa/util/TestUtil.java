package com.freecrm.qa.util;

import com.freecrm.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT=40;
	public static long IMPLICIT_WAIT=30;
	
		public void switchToFrame() {
		driver.switchTo().frame(0);
		
	}

}
