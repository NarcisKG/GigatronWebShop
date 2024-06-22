package PageMethods;

import Core.BasePage;
import Core.Locators;
import org.openqa.selenium.By;

public class LaptopRacunariPage extends BasePage {

    public LaptopRacunariPage selectFilters(String filterVrsta, String filterVrednost){
        clickOnElement(Locators.setFilterKategorija(filterVrsta));
        clickOnElement(Locators.setFilterValue(filterVrednost));
        return this;}

    public LaptopRacunariPage clickOnSortOrder(){
        clickOnElement(Locators.selectSortOrder);
        return this;}
    public LaptopRacunariPage selectSortOrderType (String sortOrderType){
        clickOnElement(Locators.setSortOrder(sortOrderType));
        return this;}

    public LaptopRacunariPage clickOnSearchResult(String searchResult) {
        clickOnElement(Locators.setSelectSearchResult(searchResult));
        return this;}
}
