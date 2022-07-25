package ru.netology.sqr.services;

public class SQRService {
    public int calcSqr(int minRange, int maxRange) {
        int amount = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minRange && i * i <= maxRange) {
                amount = amount + 1;
            }

        }
        return amount;
    }
}
