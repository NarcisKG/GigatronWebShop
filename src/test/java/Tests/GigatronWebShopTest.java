package Tests;

import PageMethods.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GigatronWebShopTest extends HomePage {

    public static final String PRETRAGA_PROIZVODA = "Proizvodi";
    public static final String PRETRAGA_LAPTOP = "";

    @BeforeEach
    public void setup(){
        createDriver();
        getDriver().navigate().to("https://gigatron.rs/");}


    @Test
    public void test(){
        HomePage test = new HomePage();

        test.clickOnSearchProizvod(PRETRAGA_PROIZVODA).
                clickOnFilterLaptop().clickOnLaptopProizvodi();
    }



    //@AfterEach
    //public void close(){quitDriver();}
}
