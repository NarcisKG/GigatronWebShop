package Tests;

import PageMethods.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GigatronWebShopTest extends HomePage {

    public static final String PRETRAGA_PROIZVODA = "Proizvodi";
    public static final String PROIZVODJAC = "Dell";
    public static final String FILTER_CPU = "Tip procesora";
    public static final String VREDNOST_CPU = "Intel Core i7";
    public static final String FILTER_RAM = "RAM (memorija)";
    public static final String VREDNOST_RAM = "8GB";
    public static final String SORT_ORDER = "Najnižoj ceni";
    public static final String SEARCH_RESULT = "DELL Vostro 3520 i7/8/512";

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
                selectFilters(FILTER_CPU,VREDNOST_CPU).selectFilters(FILTER_RAM,VREDNOST_RAM).
                selectSortOrderType(SORT_ORDER).
                moveToSearchResult(SEARCH_RESULT).
                clickOnSearchResult();
                //clickOnSearchResult();

    }



    //@AfterEach
    //public void close(){quitDriver();}
}
