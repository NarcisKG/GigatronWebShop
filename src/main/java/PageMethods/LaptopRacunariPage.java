package PageMethods;

import Core.BasePage;
import Core.Locators;

public class LaptopRacunariPage extends BasePage {

    public LaptopRacunariPage selectProizvodjac(String proizvodjac){
        clickOnElement(Locators.setFilterValue(proizvodjac));
        return this;}

    public LaptopRacunariPage selectFilters(String filterVrsta, String filterVrednost){
        clickOnElement(Locators.setFilterKategorija(filterVrsta));
        clickOnElement(Locators.setFilterValue(filterVrednost));
        return this;}

    public LaptopRacunariPage selectRamMemorija(){
        clickOnElement(Locators.setFilterKategorija("RAM (memorija)"));
        clickOnElement(Locators.setFilterValue("8GB"));
        return this;}
}
