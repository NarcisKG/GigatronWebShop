package PageMethods;

import Core.BasePage;
import Core.Locators;

public class HomePage extends BasePage {

    public HomePage openSearchProizvod() {
        clickOnElement(Locators.setPretragaProizvoda("Proizvodi");
        return this;}

    public HomePage openFilterLaptop() {
        clickOnElement(Locators.selectFilterLaptop);
        return this;}

    public HomePage selectLaptopProizvode () {
        clickOnElement(Locators.selectLaptopKategorije);
        return this;}

    }
