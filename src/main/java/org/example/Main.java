package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
    private static int objectCount = 0;
    private String fullName;
    private String dateOfBirth;
    private String contactNumber;
    private String city;
    private String country;
    private String homeAddress;

    public Person() {
        objectCount++;
    }
    public Person(String fullName, String dateOfBirth, String contactNumber, String city, String country, String homeAddress) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.contactNumber = contactNumber;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
        objectCount++;
    }
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ПІБ: ");
        fullName = scanner.nextLine();

        System.out.print("Введіть дату народження: ");
        dateOfBirth = scanner.nextLine();

        System.out.print("Введіть контактний телефон: ");
        contactNumber = scanner.nextLine();

        System.out.print("Введіть місто: ");
        city = scanner.nextLine();

        System.out.print("Введіть країну: ");
        country = scanner.nextLine();

        System.out.print("Введіть домашню адресу: ");
        homeAddress = scanner.nextLine();
    }

    public void displayInfo() {
        System.out.println("ПІБ: " + fullName);
        System.out.println("Дата народження: " + dateOfBirth);
        System.out.println("Контактний телефон: " + contactNumber);
        System.out.println("Місто: " + city);
        System.out.println("Країна: " + country);
        System.out.println("Домашня адреса: " + homeAddress);
    }

    public String getFullName() {
        return fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }
    @Override
    public String toString() {
        return "ПІБ: " + fullName + "\nДата народження: " + dateOfBirth + "\nКонтактний телефон: " + contactNumber +
                "\nМісто: " + city + "\nКраїна: " + country + "\nДомашня адреса: " + homeAddress;
    }
    public static int getObjectCount(){
        return objectCount;
    }
}

class GeometryCalculator {
    private static int calculationCount = 0;


    public static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        incrementCalculationCount();
        return area;
    }


    public static double calculateTriangleArea(double base, double height) {
        double area = 0.5 * base * height;
        incrementCalculationCount();
        return area;
    }


    public static double calculateRectangleArea(double length, double width) {
        double area = length * width;
        incrementCalculationCount();
        return area;
    }


    public static double calculateSquareArea(double side) {
        double area = side * side;
        incrementCalculationCount();
        return area;
    }


    public static double calculateRhombusArea(double diagonal1, double diagonal2) {
        double area = (diagonal1 * diagonal2) / 2;
        incrementCalculationCount();
        return area;
    }


    public static int getCalculationCount() {
        return calculationCount;
    }

    private static void incrementCalculationCount() {
        calculationCount++;
    }
}

class MathCalculator {

    public static int findMax(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    public static int findMin(int a, int b, int c, int d) {
        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    public static double calculateAverage(int a, int b, int c, int d) {
        return (a + b + c + d) / 4.0;
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факторіал визначений лише для невід'ємних цілих чисел.");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Мене звуть " + name + " і мені " + age + " років.");
    }

    public void doWork() {
        System.out.println(name + " виконує свою роботу.");
    }
    protected String getName() {
        return name;
    }
}

class Builder extends Human {
    private String specialization;

    public Builder(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public void doWork() {
        System.out.println(getName() + " як будівельник з спеціалізацією " + specialization + " будує будівлі.");
    }
}

class Sailor extends Human {
    private String shipName;

    public Sailor(String name, int age, String shipName) {
        super(name, age);
        this.shipName = shipName;
    }

    @Override
    public void doWork() {
        System.out.println(getName() + " як моряк на кораблі " + shipName + " керує кораблем.");
    }
}

class Pilot extends Human {
    private String aircraftModel;

    public Pilot(String name, int age, String aircraftModel) {
        super(name, age);
        this.aircraftModel = aircraftModel;
    }

    @Override
    public void doWork() {
        System.out.println(getName() + " як пілот летить на літаку моделі " + aircraftModel + ".");
    }

    public void fly() {
        System.out.println(getName() + " виконує польот на літаку.");
    }
}

interface IShow {
    void Print();
    void Print(String info);
}

class Array implements IShow {
    private int[] elements;

    public Array(int[] elements) {
        this.elements = elements;
    }

    @Override
    public void Print() {
        System.out.print("Елементи масиву: ");
        for (int element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    @Override
    public void Print(String info) {
        System.out.print("Елементи масиву: ");
        for (int element : elements) {
            System.out.print(element + " ");
        }
        System.out.println("\nІнформація: " + info);
    }
}
class MaximumFinder {
    public static <T extends Comparable<T>> T findMaximum(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задание:");
        int task = scanner.nextInt();
        switch (task){
            case 1:{
                Person person = new Person();
                Person person1 = new Person();
                Person person2 = new Person();
                Person person3 = new Person();
                Person person4 = new Person();
                Person person5 = new Person();
                System.out.println("Count objects: " + Person.getObjectCount());
            }
            break;
            case 2:{
                double triangleArea1 = GeometryCalculator.calculateTriangleArea(5, 12, 13);
                double triangleArea2 = GeometryCalculator.calculateTriangleArea(6, 8);
                double rectangleArea = GeometryCalculator.calculateRectangleArea(10, 20);
                double squareArea = GeometryCalculator.calculateSquareArea(7);
                double rhombusArea = GeometryCalculator.calculateRhombusArea(8, 10);

                System.out.println("Площа трикутника (за Героном): " + triangleArea1);
                System.out.println("Площа трикутника (за базою і висотою): " + triangleArea2);
                System.out.println("Площа прямокутника: " + rectangleArea);
                System.out.println("Площа квадрата: " + squareArea);
                System.out.println("Площа ромба: " + rhombusArea);

                System.out.println("Загальна кількість підрахунків площ: " + GeometryCalculator.getCalculationCount());
            }
            break;
            case 3:{
                int a = 5;
                int b = 8;
                int c = 2;
                int d = 7;

                int max = MathCalculator.findMax(a, b, c, d);
                System.out.println("Максимум: " + max);

                int min = MathCalculator.findMin(a, b, c, d);
                System.out.println("Мінімум: " + min);

                double average = MathCalculator.calculateAverage(a, b, c, d);
                System.out.println("Середнє арифметичне: " + average);

                int n = 5;
                long factorial = MathCalculator.calculateFactorial(n);
                System.out.println(n + "! = " + factorial);
            }
            break;
            case 4:{
                Builder builder = new Builder("Іван", 30, "будівництво житлових будинків");
                Sailor sailor = new Sailor("Петро", 25, "Морський ведмідь");
                Pilot pilot = new Pilot("Олег", 35, "Boeing 747");

                builder.introduce();
                builder.doWork();

                sailor.introduce();
                sailor.doWork();

                pilot.introduce();
                pilot.doWork();
                pilot.fly();
            }
            break;
            case 5:{
                int[] array = {1, 2, 3, 4, 5};
                Array intArray = new Array(array);

                System.out.println("Виведення масиву без інформаційного повідомлення:");
                intArray.Print();

                System.out.println("\nВиведення масиву з інформаційним повідомленням:");
                intArray.Print("Це масив цілих чисел.");
            }
            break;
            case 6:{
                int intMax = findMaximum(5, 8, 3);
                double doubleMax = findMaximum(4.5, 7.2, 6.1);
                String stringMax = findMaximum("apple", "banana", "cherry");

                System.out.println("Максимум із цілих чисел: " + intMax);
                System.out.println("Максимум із дійсних чисел: " + doubleMax);
                System.out.println("Максимум із рядків: " + stringMax);
            }
            break;
            case 7:{
                Integer[] intArray = {1, 2, 3, 4, 5};
                Double[] doubleArray = {1.5, 2.5, 3.5};
                Long[] longArray = {10L, 20L, 30L, 40L};

                double intAverage = calculateAverage(intArray);
                double doubleAverage = calculateAverage(doubleArray);
                double longAverage = calculateAverage(longArray);

                System.out.println("Середнє арифметичне для масиву цілих чисел: " + intAverage);
                System.out.println("Середнє арифметичне для масиву дійсних чисел: " + doubleAverage);
                System.out.println("Середнє арифметичне для масиву довгих чисел: " + longAverage);
            }
            break;
            default:
                System.out.println("Error!");
        }
    }
    public static <T extends Comparable<T>> T findMaximum(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }
    public static <T extends Number> double calculateAverage(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив не може бути порожнім або нульовим.");
        }

        double sum = 0.0;
        for (T element : array) {
            sum += element.doubleValue();
        }

        return sum / array.length;
    }
}