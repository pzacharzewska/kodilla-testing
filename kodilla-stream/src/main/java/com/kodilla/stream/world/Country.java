package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    BigDecimal peopleQuantity;

    public Country(final String countryName, final BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (!countryName.equals(country.countryName)) return false;
        return peopleQuantity != null ? peopleQuantity.equals(country.peopleQuantity) : country.peopleQuantity == null;
    }

    @Override
    public int hashCode() {
        int result = countryName.hashCode();
        result = 31 * result + (peopleQuantity != null ? peopleQuantity.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }
}
