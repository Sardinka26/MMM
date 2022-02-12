package Encapsulation_04.Elevator_01;

public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor - 1;
    }

    public void moveUp() {
        currentFloor = currentFloor + 1;
    }

    public void move(int floor) {
        if (floor > maxFloor || floor < minFloor) {
            System.out.println(" Error ");
            return;
        }
        System.out.println(" Сейчас вы находитесь на " + currentFloor + " этаже ");
        while (currentFloor != floor) {
            if (currentFloor < floor)
                moveUp();

            if (currentFloor > floor)
                moveDown();
            System.out.println(" Вы находитесь на " + currentFloor + " этаже ");
        }
    }
}




