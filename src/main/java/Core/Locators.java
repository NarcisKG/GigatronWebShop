package Core;

import org.openqa.selenium.By;

public class Locators {

public static By pretragaProizvoda = By.xpath("//button[@class='megabtn ']//span[text()='Proizvodi']");
public static By setPretragaProizvoda(String vrstaProizvoda){
    String proizvodLocator = "//button[@class='megabtn ']//span[text()='*****']";
    return By.xpath(proizvodLocator.replace("*****",vrstaProizvoda));}

public static By pretragaLaptopKategorije = By.xpath("//a[@href='/prenosni-racunari'][text()='Laptop računari']");
public static By odabirLaptopKategorije = By.xpath("//a[@href='/prenosni-racunari/laptop-racunari'][text()='Laptop računari']");




}
