package Core;

import org.openqa.selenium.By;

public class Locators {

public static By pretragaProizvoda = By.xpath("//button[@class='megabtn ']//span[text()='Proizvodi']");
public static By setPretragaProizvoda(String vrstaProizvoda){
    String proizvodLocator = "//button[@class='megabtn ']//span[text()='*****']";
    return By.xpath(proizvodLocator.replace("*****",vrstaProizvoda));}

public static By pretragaLaptopKategorije = By.xpath("//a[@href='/prenosni-racunari'][text()='Laptop računari']");
public static By odabirLaptopKategorije = By.xpath("//a[@href='/prenosni-racunari/laptop-racunari'][text()='Laptop računari']");

public static By setFilterValue(String filterValue){
    String filterValueLocator = "(//div[@class='filter']//span[text()='*****'])[1]";
    return By.xpath(filterValueLocator.replace("*****", filterValue));}



public static By filterTipProcesora = By.xpath("//span[@id='collapsible-trigger-1718632811832']");
public static By odabirTipProcesora = By.xpath();

public static By filterRamMemorije = By.xpath();
public static By setFilterTipRamDdrVga (String filterRamDdrVga){
    String ramDDRVgaLokator = "//span[@id='collapsible-trigger-1718632811833'][text()='*****']";
    return By.xpath(ramDDRVgaLokator.replace("*****",filterRamDdrVga));}

public static By setSortOrder(String sortOrder){

return this;}
public static By searchResult = By.xpath();




}
