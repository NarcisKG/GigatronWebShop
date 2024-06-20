package Tests;

import PageMethods.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GigatronWebShopTest extends HomePage {

    public static final String PRETRAGA_PROIZVODA = "Proizvodi";
    public static final String PROIZVODJAC = "Dell";
    public static final String FILTER_CPU = "Tip procesora";
    public static final String VREDNOST_CPU = "Intel Core i7";
    public static final String FILTER_RAM = "RAM (memorija)";
    public static final String VREDNOST_RAM = "8GB";
    public static final String SORT_ORDER = "sort";
    public static final String SEARCH_RESULT = "dell-vostro-3520-i78512-583238";

    @BeforeEach
    public void setup(){
        createDriver();
        getDriver().navigate().to("https://gigatron.rs/");}


    @Test
    public void test(){
        HomePage test = new HomePage();

        test.clickOnSearchProizvod(PRETRAGA_PROIZVODA).
                hoverOnFilterLaptop().hoverOnSubFilterLaptop().
                clickOnSubFilterLaptop().selectProizvodjac(PROIZVODJAC).
                selectFilters(FILTER_CPU,VREDNOST_CPU).selectFilters(FILTER_RAM,VREDNOST_RAM).clickOnSearchResult(SEARCH_RESULT);
        //selectSortOrder();
    }



   // @AfterEach
   // public void close(){quitDriver();}
}
