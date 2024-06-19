package PageMethods;

import Core.BasePage;
import Core.Locators;

public class PrenosniRacunariPage extends BasePage {

    public PrenosniRacunariPage selectLaptopProizvode () {
        clickOnElement(Locators.selectLaptopKategorije);
        return this;}
}
