package ru.netology.sqr;

public class SQRService {

    public int calculateNumberOfSquares(int minBorder, int maxBorder) {
        int count = 0;
        for (int i = 10; i <= 99; i++)
            if ( i * i >= minBorder && i * i <= maxBorder) {
                count++;
            }
        return count;
    }
}