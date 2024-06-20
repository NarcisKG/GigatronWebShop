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

    public HomePage hoverOnSubFilterLaptop(){
        hoverOnElement(Locators.selectLaptopKategorija);
        return this;}

    public HomePage clickOnSubFilterLaptop(){
        clickOnElement(Locators.selectLaptopKategorija);
    return this;}

    public LaptopRacunariPage selectProizvodjac(String proizvodjac){
        clickOnElement(Locators.setFilterValue(proizvodjac));
        return new LaptopRacunariPage();}

    }
