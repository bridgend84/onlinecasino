package org.example.logic;

import org.example.model.Game;

import java.math.BigDecimal;
import java.util.Set;

public class Casino {
    private final Set<Game> games;

    private BigDecimal bank;

    public Casino(Set<Game> games) {
        this.games = games;
        this.bank = BigDecimal.ZERO;
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public void runCasino() {
        games.forEach(Game::run);
    }

    public void emptyGameBanks() {
        bank = bank.add(games.stream().map(Game::emptyBank).reduce(BigDecimal::add).orElse(BigDecimal.ZERO));
    }

    public BigDecimal calculateTotalProfitOfADay() {
        return games.stream().map(Game::getDailyRevenue).reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
    }

    public BigDecimal getTotalBalance() {
        return games.stream().map(Game::getGameBank).reduce(BigDecimal::add).orElse(BigDecimal.ZERO).add(bank);
    }
}
