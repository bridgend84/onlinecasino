package org.example.model;

import java.math.BigDecimal;
import java.util.Set;

public abstract class GameNeedDealer extends Game {
    protected final Dealer dealer;
    protected final Set<Experience> neededExperience;
    public GameNeedDealer(int amountOfPlayers, BigDecimal dailyRevenue, Dealer dealer, Set<Experience> neededExperience) {
        super(amountOfPlayers, dailyRevenue);
        this.dealer = dealer;
        this.neededExperience = neededExperience;
    }
    @Override
    public void run() {
        if (neededExperience.contains(dealer.getExperience())) {
            gameBank = gameBank.add(dailyRevenue).subtract(dealer.getExperience().getSalary());
        }
    }

    @Override
    public BigDecimal getDailyRevenue() {
        return neededExperience.contains(dealer.getExperience()) ?
                dailyRevenue.subtract(dealer.getExperience().getSalary()) :
                BigDecimal.ZERO;
    }
}
