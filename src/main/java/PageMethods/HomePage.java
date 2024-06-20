package PageMethods;

import Core.BasePage;
import Core.Locators;

public class HomePage extends BasePage {

    public HomePage clickOnSearchProizvod(String proizvod) {
        clickOnElement(Locators.setPretragaProizvoda(proizvod));
        return this;}

    public HomePage hoverOnFilterLaptop() {
        hoverOnElement(Locators.selectFilterLaptop);
        return this;}

    public PrenosniRacunariPage clickOnLaptopProizvodi(){
        clickOnElement(Locators.selectLaptopKategorije);
        return new PrenosniRacunariPage();}

    }
