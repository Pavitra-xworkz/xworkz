package com.xworkz.browser;

import com.xworkz.browser.Browser;


public class BrowserTester {

	public static void main(String[] args) {

		// data-type ref-var=new Constrctor();
		Browser browser = new Browser();

		browser.setName("IE");

		System.out.println(browser.getName());

		// class-name/parent-class-name ref=new Constrctor();

		Object genericBrowser = new Browser();

		Browser childRef = (Browser) genericBrowser;
		childRef.setName("IE-8");
		System.out.println(childRef.getName());

		Object day = new String("TUESDAY");

		String string = (String) day; // type-casting

		// day=new Browser();
		Browser notGoodRef = (Browser) day;

	}

}
