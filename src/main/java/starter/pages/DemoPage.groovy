package starter.pages

import net.serenitybdd.core.pages.PageObject
import net.serenitybdd.core.pages.WebElementFacade
import net.thucydides.core.annotations.DefaultUrl
import org.openqa.selenium.By
import org.openqa.selenium.support.FindBy

@DefaultUrl("https://www.surveymonkey.com/r/9MVSPYS")
class DemoPage extends PageObject {

    @FindBy(xpath = "//button[contains(text(),'Next')]")
    WebElementFacade buttonNext

    @FindBy(xpath = "//div[contains(text(),'Have a nice day.')]")
    WebElementFacade getMessage

    WebElementFacade getOptionByName(String option) {
        return find(By.xpath("//span[contains(text(),'$option')]"))
    }

}
