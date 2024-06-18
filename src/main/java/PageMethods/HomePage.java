package PageMethods;

import Core.BasePage;
import Core.Locators;

public class HomePage extends BasePage {

    public HomePage openSearchProizvod(String proizvod) {
        clickOnElement(Locators.setPretragaProizvoda(proizvod));
        return this;}

    public HomePage openFilterLaptop() {
        clickOnElement(Locators.selectFilterLaptop);
        return new PrenosniRacunariPage();}

    }
