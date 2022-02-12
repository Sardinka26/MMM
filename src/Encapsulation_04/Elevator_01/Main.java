package Encapsulation_04.Elevator_01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Elevator elevator = new Elevator(-3,26);

        while (true){
            System.out.print(" Введите этаж : ");
            int floor = new Scanner(System.in).nextInt();

            elevator.move(floor);
        }
    }
}
