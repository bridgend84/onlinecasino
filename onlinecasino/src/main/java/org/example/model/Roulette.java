package org.example.model;

import java.math.BigDecimal;
import java.util.Set;

public class Roulette extends GameNeedDealer{
    private static final int ROULETTE_AMOUNT_OF_PLAYERS = 8;
    private static final BigDecimal ROULETTE_DAILY_REVENUE = BigDecimal.valueOf(2000000);
    private static final Set<Experience> NEEDED_EXPERIENCE_FOR_ROULETTE = Set.of(Experience.PRO);
    public Roulette(Dealer dealer) {
        super(ROULETTE_AMOUNT_OF_PLAYERS, ROULETTE_DAILY_REVENUE, dealer, NEEDED_EXPERIENCE_FOR_ROULETTE);
    }
}
