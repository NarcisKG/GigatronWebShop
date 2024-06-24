package Core;

import org.openqa.selenium.By;

public class Locators {

public static By pretragaProizvoda = By.xpath("//button[@class='megabtn ']//span[text()='Proizvodi']");
public static By setPretragaProizvoda(String vrstaProizvoda){
    String proizvodLocator = "//button[@class='megabtn ']//span[text()='*****']";
    return By.xpath(proizvodLocator.replace("*****",vrstaProizvoda));}

public static By selectFilterLaptop = By.xpath("//a[@href='/prenosni-racunari'][text()='Laptop računari']");
public static By selectLaptopKategorija = By.xpath("//li[@class='item-nav3 item-b']//a[@href='/prenosni-racunari/laptop-racunari']");

public static By setFilterKategorija(String filterKategorija){
    String filterKategorijaLocator = "(//span[@class='Collapsible__trigger is-closed'][text()='*****'])[2]";
    return By.xpath(filterKategorijaLocator.replace("*****",filterKategorija));}

public static By setFilterValue(String filterValue){
    String filterValueLocator = "(//div[@class='filter']//span[text()='*****'])[2]";
    return By.xpath(filterValueLocator.replace("*****", filterValue));}


public static By selectSortOrder = By.xpath("//select[@name='sort']//option[text()='Najnižoj ceni']");
public static By setSortOrder(String sortOrder){
    String sortOrderLocator = "//select[@name='sort']//option[text()='*****']";
    return By.xpath(sortOrderLocator.replace("*****",sortOrder));}

public static By setSelectSearchResult (String setSearchResult){
    String searchResultLocator = "//a[@class='item__image']//img[@alt='*****']";
    return By.xpath(searchResultLocator.replace("*****", setSearchResult));}
}

