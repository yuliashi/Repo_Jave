package HomeWork1;

public class Homework3 {
    public static void main(String[] args) {
        double cT = 19;
        double fT = cT * 9/5 + 32;
        System.out.println("It is " + cT + "°C and " + fT + "°F outside");

        // °F -> °C
        fT = 67;
        cT = (fT - 32) * 5/9;
        System.out.println("It is " + cT + "°C and " + fT + "°F outside");

        // °F -> K
        double kT = (fT + 459.67) * 5/9;
        System.out.println("It is " + fT + "°F and " + kT + "K outside");

        //  K -> °C
        cT = kT - 273.15;
        System.out.println("It is " + cT + "°C and " + kT + "K outside");

        // °C -> K
        kT = cT + 273.15;
        System.out.println("It is " + cT + "°C and " + kT + "K outside");

        // K -> °F
        fT = kT * 9/5 - 459.67;
        System.out.println("It is " + fT + "°F and " + kT + "K outside");

    }
}
