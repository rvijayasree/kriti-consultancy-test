package com.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Administrator on 8/05/2016.
 */
public class Homepage {

    @FindBy(id="txtSearch")
    private WebElement _searchTab;
    @FindBy(css=".go.replace>span")
    private WebElement _searchclick;
    public void searchProduct(String pdt){


    }

}
