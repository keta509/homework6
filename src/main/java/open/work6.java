package open;

import Chromme.Chromerun;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.SetValue;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class work6  {
    @Test
    public void mytests6 (){
        open("https://www.google.com/");
        String str = "maven";
        SelenideElement ID =$(byClassName("gLFyf"));
        $(new By.ByClassName("gLFyf")).setValue("str");
        ID.setValue(str);
        sleep(10000);
        Assert.assertEquals(ID.getValue(), "own","check ID");









    }

}
