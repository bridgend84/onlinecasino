package org.example.model;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

public abstract class Game {
    private final UUID id;
    protected BigDecimal gameBank;
    private int amountOfPlayers;
    protected BigDecimal dailyRevenue;

    public Game(int amountOfPlayers, BigDecimal dailyRevenue) {
        this.id = UUID.randomUUID();
        this.gameBank = BigDecimal.ZERO;
        this.amountOfPlayers = amountOfPlayers;
        this.dailyRevenue = dailyRevenue;
    }

    public void run() {
        gameBank = gameBank.add(dailyRevenue);
    }

    public BigDecimal emptyBank() {
        BigDecimal allRevenue = gameBank;
        gameBank = BigDecimal.ZERO;
        return allRevenue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public BigDecimal getGameBank() {
        return gameBank;
    }

    public BigDecimal getDailyRevenue() {
        return dailyRevenue;
    }
}
