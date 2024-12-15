package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on, if it is raining
 * AND car is speeding (>100) OR is dark.
 */
public class LightsOn {

    public static void main(String[] args) {
        final int  MAX_CAR_SPEED = 100;
        boolean isRaining = false;
        boolean isCarSpeeding = false;
        boolean isDark = false;
        boolean areLightsOn = false;
        Scanner in = new Scanner(System.in);
        int speed = 0;

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert the car speed");
        speed = in.nextInt();

        isCarSpeeding = speed > MAX_CAR_SPEED;
        // areLightsOn = isRaining && (isDark || isCarSpeeding);
        areLightsOn = (isRaining && isDark) || (isRaining && isCarSpeeding);

        System.out.println("Turn lights on: " + areLightsOn);

    }
}
