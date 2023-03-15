package pl.javastart.task;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("checkstyle:RightCurly")
    public static void main(String[] args) {

        Room room = new Room();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę pokoju: ");
        double temperature = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Czy jest klimatyzator w pokoju? : ");
        boolean airConditionair = scanner.nextBoolean();
        scanner.nextLine();
        if (temperature > 20) {
            if (airConditionair) {
                room.currentTemperature(temperature, room.x);
                System.out.println("Temperatura pokoju to: " + room.currentTemperature(temperature, room.x));
            } else {
                System.out.println("Brak klimatyzacji. " +
                        "Temperatura pokoju to: " + room.noAirConditionairTemperature(temperature, room.y));
            }
        } else if (temperature <= 20) {
            System.out.println("Próg chłodzenia osiągnięty. Jest " + temperature + " stopni.");
        }
        System.out.println("Koniec programu.");
        scanner.close();
    }
}
