package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Searchpage {
    public static final Target TXT_SEARCH = Target.the("select search")
            .locatedBy("//a[@class='searchbox']");

      public static final Target TXT_TYPE_SEARCH = Target.the("Enter search")
            .locatedBy("//input[@id='search-field']");

     public static final Target LBL_SEARCH = Target.the("Validate label ")
            .locatedBy("//*[contains(text(),'What not')]");

 public static final Target LBL_SEARCHS = Target.the("Validate label ")
            .locatedBy("//*[contains(text(),'What not')]");



}
