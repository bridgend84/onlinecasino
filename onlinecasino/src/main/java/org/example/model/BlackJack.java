package org.example.model;

import java.math.BigDecimal;
import java.util.Set;

public class BlackJack extends GameNeedDealer{
    private static final int BLACK_JACK_AMOUNT_OF_PLAYERS = 6;
    private static final BigDecimal BLACKJACK_DAILY_REVENUE = BigDecimal.valueOf(1000000);
    private static final Set<Experience> NEEDED_EXPERIENCE_FOR_BLACKJACK = Set.of(Experience.NEWBIE, Experience.MID_LEVEL, Experience.PRO);
    public BlackJack(Dealer dealer) {
        super(BLACK_JACK_AMOUNT_OF_PLAYERS, BLACKJACK_DAILY_REVENUE, dealer, NEEDED_EXPERIENCE_FOR_BLACKJACK);
    }
}
