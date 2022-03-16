package com.example.Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GreatingPage {

    @FindBy(how = How.XPATH, using = "//input")
    private SelenideElement nameInput;

    @FindBy(how = How.XPATH, using = "//button")
    private SelenideElement enterButton;

    @FindBy(how = How.XPATH, using = "//div[@class = 'n2o-alerts-container']")
    private SelenideElement alertContainer;

    public GreatingPage enterName(String name){
        nameInput.sendKeys(name);
        return this;
    }

    public GreatingPage enterButtonClick(){
        enterButton.click();
        return this;
    }

    public String getGreatingName(){
        return alertContainer.find(By.xpath(".//*[starts-with(text(), 'Привет')]"))
                .shouldBe(Condition.visible).getText();
    }
}
