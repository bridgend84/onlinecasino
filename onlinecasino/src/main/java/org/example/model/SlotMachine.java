package org.example.model;


import java.math.BigDecimal;

public class SlotMachine extends Game{
    private static final int SLOT_MACHINE_AMOUNT_OF_PLAYERS = 1;
    private static final BigDecimal SLOT_MACHINE_DAILY_REVENUE = BigDecimal.valueOf(500000);
    private int amountOfRolls;
    public SlotMachine() {
        super(SLOT_MACHINE_AMOUNT_OF_PLAYERS, SLOT_MACHINE_DAILY_REVENUE);
        this.amountOfRolls = 0;
    }
    public void rollTheMachine() {
        amountOfRolls++;
    }
}
