package org.example.model;

import java.util.Objects;

public class Dealer {
    private final String name;
    private final Experience experience;
    public Dealer(String name, Experience experience) {
        this.name = name;
        this.experience = experience;
    }

    public Experience getExperience() {
        return experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dealer dealer = (Dealer) o;
        return Objects.equals(name, dealer.name) && experience == dealer.experience;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, experience);
    }
}
