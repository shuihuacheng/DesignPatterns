package com.leo.patterns.strategy;

/**
 * 策略A
 */
public class StrategyA implements Strategy{
    @Override
    public void algorithm() {
        System.out.println("策略A");
    }
}
