package ru.netology;

public class Main {

    public static void main(String[] args) {
        CashbackService service = new CashbackService();

        {
            System.out.println("It should return 0 for 1000, buy more goods to get more bonuses");
            int result = service.calculateBonus(1000);
            System.out.println(0 == result);
        }

        {
            System.out.println("It should return 9 for 1900");
            int result = service.calculateBonus(1900);
            System.out.println(9 == result);
        }

        {
            System.out.println("It should return 10 for 2000");
            int result = service.calculateBonus(2000);
            System.out.println(10 == result);
        }
    }
}
