package PageMethods;

import Core.BasePage;
import Core.Locators;
import org.junit.jupiter.api.Assertions;

public class LaptopInfoPage extends BasePage {

    public LaptopInfoPage verifyLaptopBrand (String laptopBrand){
    String actualLaptopBrand = getElementText(Locators.getBrandName("Dell"));
    Assertions.assertEquals(laptopBrand, actualLaptopBrand,"Laptop brand is not as expected");
    return this;}

    public LaptopInfoPage verifyLaptopCpuInfo (String laptopCpuInfo){
    String actualLaptopCpuInfo = getElementText(Locators.getLapTopInfo(""));
    return this;}

    public LaptopInfoPage verifyLaptopRamInfo (String laptopRamInfo){
    String actualLaptopRamInfo = getElementText(Locators.getLapTopInfo(""));
    return this;}

}
