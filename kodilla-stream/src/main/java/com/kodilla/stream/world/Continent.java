package com.kodilla.stream.world;

import java.util.ArrayList;

public final class Continent {
    private final String continentName;
    private final Country country;

    public Continent(final String continentName, final Country country) {
        this.continentName = continentName;
        this.country = country;
    }

    private final ArrayList<Continent> countries = new ArrayList<>();
    public Continent() {
        countries.add(new Continent("Europe", new Country("Italy", "60360000"));
        countries.add(new Continent("Europe", new Country("Great Britain", "66650000")));
    }

}
