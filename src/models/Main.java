package models;

public class Main {
    public static void main(String[] args) {
        Die dice = new Die();
        dice.roll();

        System.out.println(dice.faceValue);

    }
}
