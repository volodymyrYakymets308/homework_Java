package Lesson_3;

import java.util.Scanner;

public class YakymetsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму покупки: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: Введите корректное число.");
            return;
        }
        double purchaseAmount = scanner.nextDouble();
        if (purchaseAmount < 0) {
            System.out.println("Ошибка: Сумма покупки не может быть отрицательной.");
            return;
        }
        System.out.print("Клиент VIP (true/false): ");
        if (!scanner.hasNextBoolean()) {
            System.out.println("Ошибка: Введите true или false.");
            return;
        }
        boolean isVip = scanner.nextBoolean();
        double discountPercentage = getDiscountPercentage(purchaseAmount);
        double discountAmount = purchaseAmount * discountPercentage / 100;
        double finalAmount = purchaseAmount - discountAmount;
        double vipDiscountAmount = 0;
        if (isVip) {
            double vipDiscountPercentage = 5; // Дополнительная скидка 5%
            vipDiscountAmount = finalAmount * vipDiscountPercentage / 100;
            finalAmount -= vipDiscountAmount;
        }
        System.out.println("\nYakymets Calculator 💪");
        System.out.println("Сумма покупки до скидки: " + purchaseAmount + " руб.");
        System.out.println("Скидка: " + discountPercentage + "% (" + discountAmount + " руб.)");

        if (isVip) {
            System.out.println("Дополнительная скидка для VIP: 5% (" + vipDiscountAmount + " руб.)");
        }

        System.out.println("Итоговая сумма к оплате: " + finalAmount + " руб.");
    }
    private static double getDiscountPercentage(double amount) {
        if (amount < 1000) {
            return 0;
        } else if (amount <= 5000) {
            return 5;
        } else if (amount <= 10000) {
            return 10;
        } else {
            return 15;
        }
    }
}

