# Java File I/O and Serialization

A Java project demonstrating various programming concepts including object-oriented programming, data structures, and basic algorithms.

## Project Overview

This repository contains several Java classes that demonstrate fundamental programming concepts and data structures. The project includes implementations of:

- **Object-Oriented Programming**: Employee and Doctor classes with inheritance
- **Data Structures**: Priority Queue and custom list operations
- **Mathematical Operations**: Fraction class with GCD calculations
- **Simulation**: Airplane seat reservation system
- **Business Logic**: Pizza ordering system with cost calculations
- **Utility Classes**: Odometer for tracking mileage and fuel efficiency

## Classes

### Core Classes

#### `Tester.java`
The main class that demonstrates and tests all other classes in the project. It provides interactive examples of:
- Fraction operations with user input
- Odometer tracking with fuel efficiency calculations
- Airplane seat reservation system
- Priority queue operations
- Pizza ordering and cost calculation
- Array operations with occurrence counting
- Doctor (SalariedEmployee) object creation and manipulation

#### `SalariedEmployee.java`
A base class representing a salaried employee with:
- Properties: firstName, lastName, hireDate, salary
- Getter and setter methods
- `toString()` and `equals()` method implementations

#### `Doctor.java`
Extends `SalariedEmployee` to add medical specialization:
- Additional property: speciality
- Constructor overloading
- Custom `toString()` and `equals()` implementations

#### `Fraction.java`
Represents mathematical fractions with:
- Numerator and denominator
- GCD (Greatest Common Divisor) calculation for simplification
- Display method for printing fractions in simplified form

#### `Pizza.java`
Manages pizza orders with:
- Size options (small, medium, large)
- Topping counts (cheese, pepperoni, ham)
- Cost calculation based on size and toppings
- Description generation

#### `PizzaOrder.java`
Handles multiple pizza orders and calculates the total cost for an order batch.

#### `Airplane.java`
Simulates an airplane seat reservation system:
- 7 rows × 4 columns (A-D) seating arrangement
- Seat initialization and display
- Reservation functionality
- Full capacity checking

#### `PriorityQueue.java`
Custom implementation of a priority queue using ArrayLists:
- `enqueue()`: Adds elements with priority values
- `dequeue()`: Removes and returns the highest priority element
- Elements are maintained in sorted order by priority

#### `Odometer.java`
Tracks vehicle mileage and fuel consumption:
- Miles per gallon (MPG) efficiency setting
- Trip distance tracking
- Fuel usage calculation
- Odometer reset functionality

#### `IntList.java`
Utility class for array operations:
- `countOccur()`: Counts occurrences of each element in an array

## How to Compile and Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line terminal or IDE (IntelliJ IDEA, Eclipse, etc.)

### Compilation
From the project root directory:

```bash
javac src/*.java
```

### Running the Program
```bash
java -cp src Tester
```

### Interactive Input
The program will prompt for various inputs:
1. **Fraction**: Enter numerators and denominators for two fractions
2. **Odometer**: Enter car efficiency (MPG) and trip distances
3. **Airplane**: Enter seat row numbers and column letters for reservations
4. **Other components**: Run automatically with predefined values

## Example Usage

### Fraction Example
```
Enter numerator for Fraction 1: 4
Enter denominator for Fraction 1: 8
Enter numerator for Fraction 2: 3
Enter denominator for Fraction 2: 9
```
Output: Displays fractions in simplified form (e.g., 4/8 becomes 1/2)

### Odometer Example
```
Enter Car Efficiency in MPG: 25.5
Enter the trip distance: 100
Enter the trip distance: 50
Enter the trip distance: 75
```
Output: Displays fuel used after each trip and after reset

### Airplane Reservation Example
```
Enter row number: 3
Enter column letter: B
Do you want to reserve more? (Yes/No): yes
```
Output: Visual representation of seat availability with reserved seats marked as 'X'

## Features

- **Interactive Console Interface**: User-friendly prompts for data entry
- **Object-Oriented Design**: Demonstrates inheritance, encapsulation, and polymorphism
- **Data Validation**: Checks for seat availability in airplane reservations
- **Mathematical Accuracy**: GCD calculations for fraction simplification
- **Priority Management**: Sorted priority queue implementation
- **Cost Calculation**: Dynamic pricing based on pizza size and toppings

## Author

Robert Bennethum IV - COMPSCI 221

## License

This project is part of a computer science course assignment.
