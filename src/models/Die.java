package models;

public class Die {
    int faceValue;

    void roll(){
        int max = 6, min = 1;
        faceValue = (int)(Math.random() * (max-min+1) + min);
    }
}
