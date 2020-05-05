package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test

    public void testGetPeopleQuantity() {
        Country country1 = new Country("Italy", new BigDecimal("1000000000"));
        Country country2 = new Country("Great Britain", new BigDecimal("2000000000"));
        Country country3 = new Country("Croatia", new BigDecimal("3000000000"));
        Country country4 = new Country("China", new BigDecimal("4000000000"));
        Country country5 = new Country("Thailand", new BigDecimal("5000000000"));
        Country country6 = new Country("India", new BigDecimal("6000000000"));
        Country country7 = new Country("USA", new BigDecimal("7000000000"));
        Country country8 = new Country("Canada", new BigDecimal("8000000000"));
        Country country9 = new Country("Nigeria", new BigDecimal("9000000000"));
        Country country10 = new Country("Kenya", new BigDecimal("10000000000"));

        Continent europe = new Continent("Europe");
            europe.addCountry(country1);
            europe.addCountry(country2);
            europe.addCountry(country3);

        Continent asia = new Continent("Asia");
            asia.addCountry(country4);
            asia.addCountry(country5);
            asia.addCountry(country6);

        Continent america = new Continent("America");
            america.addCountry(country7);
            america.addCountry(country8);

        Continent africa = new Continent("Africa");
            africa.addCountry(country9);
            africa.addCountry(country10);

        World world = new World();
            world.addContinent(europe);
            world.addContinent(asia);
            world.addContinent(america);
            world.addContinent(africa);

        Assert.assertEquals(new BigDecimal ("55000000000"), world.getPeopleQuantity());
    }
}
