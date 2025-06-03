public class Main {

    // Base BonusCalculator class
    static class BonusCalculator {
        public double calculateBonus(double salary) {
            return 0.0; // default no bonus
        }
    }

    // Regular employee: 10% bonus
    static class RegularEmployeeBonus extends BonusCalculator {
        public double calculateBonus(double salary) {
            return salary * 0.10;
        }
    }

    // Senior employee: 20% bonus
    static class SeniorEmployeeBonus extends BonusCalculator {
        public double calculateBonus(double salary) {
            return salary * 0.20;
        }
    }

    // Employee class
    static class Employee {
        String name;
        double salary;
        BonusCalculator bonusCalculator;

        public Employee(String name, double salary, BonusCalculator bonusCalculator) {
            this.name = name;
            this.salary = salary;
            this.bonusCalculator = bonusCalculator;
        }

        public double getBonus() {
            return bonusCalculator.calculateBonus(salary);
        }

        public String getName() {
            return name;
        }
    }

    // Main method
    public static void main(String[] args) {
        Employee john = new Employee("John", 50000, new RegularEmployeeBonus());
        Employee alice = new Employee("Alice", 80000, new SeniorEmployeeBonus());
        Employee tom = new Employee("Tom", 20000, new BonusCalculator()); // Intern (default)

        System.out.println(john.getName() + " gets bonus: $" + john.getBonus());
        System.out.println(alice.getName() + " gets bonus: $" + alice.getBonus());
        System.out.println(tom.getName() + " gets bonus: $" + tom.getBonus());
    }
}
