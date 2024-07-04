package PageMethods;

import Core.BasePage;
import Core.Locators;
import org.junit.jupiter.api.Assertions;

public class LaptopInfoPage extends BasePage {

    public LaptopInfoPage verifyLaptopBrand (String laptopBrand){
    String actualLaptopBrand = getElementText(Locators.getBrandName(laptopBrand));
    Assertions.assertEquals("Brend: "+laptopBrand, actualLaptopBrand,"Laptop brand is not as expected");
    return this;}

    public LaptopInfoPage verifyLaptopInfo (String laptopInfo){
    String actualLaptopInfo = getElementText(Locators.getLaptopInfo(laptopInfo));
    Assertions.assertEquals(laptopInfo +":", actualLaptopInfo,"Laptop info is not as expected");
    return this;}

    public LaptopInfoPage verifyLaptopInfoValue (String laptopInfoValue){
    String actualLaptopInfoValue = getElementText(Locators.getLaptopInfo(laptopInfoValue));
    Assertions.assertEquals(laptopInfoValue,actualLaptopInfoValue,"Laptop info value is not as expected");
    return this;}

}
