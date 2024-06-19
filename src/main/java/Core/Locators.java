package Core;

import org.openqa.selenium.By;

public class Locators {

public static By pretragaProizvoda = By.xpath("//button[@class='megabtn ']//span[text()='Proizvodi']");
public static By setPretragaProizvoda(String vrstaProizvoda){
    String proizvodLocator = "//button[@class='megabtn ']//span[text()='*****']";
    return By.xpath(proizvodLocator.replace("*****",vrstaProizvoda));}

public static By selectFilterLaptop = By.xpath("//a[@href='/prenosni-racunari'][text()='Laptop računari']");
public static By selectLaptopKategorije = By.xpath("//div[@class='catmenu-main']//a[@href='/prenosni-racunari/laptop-racunari']");

public static By setFilterKategorija(String filterKategorija){
    String filterKategorijaLocator = "(//span[@class='Collapsible__trigger is-closed'][text()='*****'])[2]";
    return By.xpath(filterKategorijaLocator.replace("*****",filterKategorija));}

public static By setFilterValue(String filterValue){
    String filterValueLocator = "(//div[@class='filter']//span[text()='*****'])[2]";
    return By.xpath(filterValueLocator.replace("*****", filterValue));}


public static By setSortOrder(String sortOrder){
    String sortOrderLocator = "//select[@name='*****']";
    return By.xpath(sortOrderLocator.replace("*****",sortOrder));}

public static By setSelectSearchResult (String searchResult){
    String searchResultLocator = "(//a[@href='/laptop-racunari/*****'])[1]";
    return By.xpath(searchResultLocator.replace("*****", searchResult));}
}
//public static By filterTipProcesora = By.xpath("//span[@id='collapsible-trigger-1718632811832']");
//public static By odabirTipProcesora = By.xpath();

//public static By filterRamMemorije = By.xpath();
//public static By sortMenu = By.xpath("");
