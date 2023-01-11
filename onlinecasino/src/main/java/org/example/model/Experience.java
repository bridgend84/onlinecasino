package org.example.model;

import java.math.BigDecimal;

public enum Experience {
    NEWBIE(BigDecimal.valueOf(50000)),
    MID_LEVEL(BigDecimal.valueOf(80000)),
    PRO(BigDecimal.valueOf(120000));

    private final BigDecimal salary;

    Experience(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
