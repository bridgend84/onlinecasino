package org.example.logic;

import org.example.model.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CasinoTest {
    Casino casino = new Casino(Set.of(
            new SlotMachine(),
            new BlackJack(new Dealer("John", Experience.MID_LEVEL)),
            new Roulette(new Dealer("Jack", Experience.MID_LEVEL))
    ));

    @Test
    void calculateTotalProfitOfADay() {
        assertEquals(BigDecimal.valueOf(1420000), casino.calculateTotalProfitOfADay());
    }

    @Test
    void getTotalBalance() {
        casino.runCasino();
        casino.runCasino();
        casino.emptyGameBanks();
        casino.runCasino();
        assertEquals(BigDecimal.valueOf(1420000).multiply(BigDecimal.valueOf(3)), casino.getTotalBalance());
    }
}