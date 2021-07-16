package ru.netology;

public class CashbackService {

    public int calculateBonus(int amount) {
        if (amount < 1000) {
            return 0;
        }
        int bonus = (amount - 1000) / 100;
        if (bonus > 100) {
            return 100;
        }

        return bonus;
    }
}
