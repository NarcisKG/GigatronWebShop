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

    public LaptopRacunariPage moveToSearchResult(String searchResult) {
        moveToElement(Locators.setSelectSearchResult(searchResult));

        return this;}

    public LaptopInfoPage clickOnSearchResult() {
        clickOnElement(By.xpath("//a[@class='item__name']//h4[text()='DELL Vostro 3520 i7/8/512']"));
        return new LaptopInfoPage();}
}
