package Chromme;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Chromerun {
    @Test
    public void assertTest() throws InterruptedException {
        open("https://www.google.com/");
        String str = "maven";
        SelenideElement ID =$(byClassName("gLFyf"));
        SoftAssert soft = new SoftAssert();
        ID.setValue(str);
        soft.assertEquals(ID.getValue(),"own");
        ID.setValue("maven");
        Thread.sleep(5000);
        soft.assertAll();









    }


}
