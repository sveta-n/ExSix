import java.util.Scanner;

public class ExSix {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int choice1 = scanner.nextInt();
        if (choice1 == 1) {
            ExSix.weight();
        }
        else if (choice1 == 2) {
            ExSix.distance();
        }
    }


    private static void weight() {
        System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - унция, 3 - фунт, 4 - тонна");
        int choice2 = scanner.nextInt();
        if (choice2 == 1) {
            System.out.println("Введите число");
            double kilogram = scanner.nextDouble();
            ExSix.convertKilogramToDifferentMeasurements(kilogram);
        }
        else if (choice2 == 2) {
            System.out.println("Введите число");
            double ounce = scanner.nextDouble();
            double kilogram = ExSix.convertOunceToDKilogram(ounce);
            ExSix.convertKilogramToDifferentMeasurements(kilogram);
        }
        else if (choice2 == 3) {
            System.out.println("Введите число");
            double lb = scanner.nextDouble();
            double kilogram = ExSix.convertLbToKilogram(lb);
            ExSix.convertKilogramToDifferentMeasurements(kilogram);
        }
        else if (choice2 == 4) {
            System.out.println("Введите число");
            double ton = scanner.nextDouble();
            double kilogram = ExSix.convertTonToKilogram(ton);
            ExSix.convertKilogramToDifferentMeasurements(kilogram);
        }
    }


    private static void convertKilogramToDifferentMeasurements(double kilogram) {
        System.out.println("Результат:");
        System.out.printf("Килограмм: %.2f\n", kilogram);
        double ounce = kilogram * 35.274;
        System.out.printf("Унция: %.2f\n", ounce);
        double lb = kilogram * 2.205;
        System.out.printf("Фунт: %.2f\n", lb);
        double ton = kilogram / 1000;
        System.out.printf("Тонна: %.2f", ton);
    }


    private static double convertTonToKilogram(double ton) {
        double kilogram = ton / 3.281;
        return kilogram;
    }

    private static double convertLbToKilogram(double lb) {
        double kilogram = lb / 3.281;
        return kilogram;
    }

    private static double convertOunceToDKilogram(double ounce) {
        double kilogram = ounce / 3.281;
        return kilogram;
    }


    private static void distance() {
        System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        int choice3 = scanner.nextInt();
        if (choice3 == 1) {
            System.out.println("Введите число");
            double meters = scanner.nextDouble();
            ExSix.convertMetersToDifferentMeasurements(meters);
        }
        else if (choice3 == 2) {
            System.out.println("Введите число");
            double miles = scanner.nextDouble();
            double meters = ExSix.convertMilesToMeters(miles);
            ExSix.convertMetersToDifferentMeasurements(meters);
        }
        else if (choice3 == 3) {
            System.out.println("Введите число");
            double yard = scanner.nextDouble();
            double meters = ExSix.convertYardToMeters(yard);
            ExSix.convertMetersToDifferentMeasurements(meters);
        }
        else if (choice3 == 4) {
            System.out.println("Введите число");
            double foot = scanner.nextDouble();
            double meters = ExSix.convertFootToMeters(foot);
            ExSix.convertMetersToDifferentMeasurements(meters);
        }
    }


    private static double convertFootToMeters(double foot) {
        double meters = foot / 3.281;
        return meters;
    }

    private static double convertYardToMeters(double yard) {
        double meters = yard / 1.094;
        return meters;
    }

    private static double convertMilesToMeters(double miles) {
        double meters = miles * 1609;
        return meters;
    }


    private static void convertMetersToDifferentMeasurements(double meters) {
        System.out.println("Результат:");
        System.out.printf("Метры: %.2f\n", meters);
        double miles = meters / 1609;
        System.out.printf("Мили: %.2f\n", miles);
        double yard = meters * 1.094;
        System.out.printf("Ярды: %.2f\n", yard);
        double foot = meters * 3.281;
        System.out.printf("Футы: %.2f", foot);
    }
}

