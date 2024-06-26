package PageMethods;

import Core.BasePage;
import Core.Locators;
import org.openqa.selenium.By;

public class LaptopRacunariPage extends BasePage {

    public LaptopRacunariPage selectFilters(String filterVrsta, String filterVrednost){
        clickOnElement(Locators.setFilterKategorija(filterVrsta));
        clickOnElement(Locators.setFilterValue(filterVrednost));
        return this;}


    public LaptopRacunariPage selectSortOrderType (String sortOrderType){
        clickOnElement(Locators.setSortOrder(sortOrderType));
        return this;}

    public LaptopRacunariPage clickOnCookiesOption(){
        clickOnElement(Locators.selectCookieOption);
    return this;}

    public LaptopRacunariPage moveToSearchResult(String searchResult) {
        moveToElement(Locators.setSelectSearchResult(searchResult));

        return this;}

    public LaptopInfoPage clickOnSearchResult(String searchResult) {
        clickOnElementTop(Locators.setSelectSearchResult(searchResult));
        return new LaptopInfoPage();}
}
