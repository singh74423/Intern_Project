import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    // Method to convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Method to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter Program");
        System.out.println("Choose the input unit:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Enter choice (1/2/3): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        switch (choice) {
            case 1: // Celsius
                System.out.printf("%.2f Celsius = %.2f Fahrenheit\n", temperature, celsiusToFahrenheit(temperature));
                System.out.printf("%.2f Celsius = %.2f Kelvin\n", temperature, celsiusToKelvin(temperature));
                break;
            case 2: // Fahrenheit
                System.out.printf("%.2f Fahrenheit = %.2f Celsius\n", temperature, fahrenheitToCelsius(temperature));
                System.out.printf("%.2f Fahrenheit = %.2f Kelvin\n", temperature, fahrenheitToKelvin(temperature));
                break;
            case 3: // Kelvin
                System.out.printf("%.2f Kelvin = %.2f Celsius\n", temperature, kelvinToCelsius(temperature));
                System.out.printf("%.2f Kelvin = %.2f Fahrenheit\n", temperature, kelvinToFahrenheit(temperature));
                break;
            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                break;
        }

        scanner.close();
    }
}
