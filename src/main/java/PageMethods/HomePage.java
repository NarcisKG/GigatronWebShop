package PageMethods;

import Core.BasePage;
import Core.Locators;

public class HomePage extends BasePage {

    public HomePage clickOnSearchProizvod(String proizvod) {
        clickOnElement(Locators.setPretragaProizvoda(proizvod));
        return this;}

    public HomePage clickOnFilterLaptop() {
        clickOnElement(Locators.selectFilterLaptop);
        return this;}

    }
