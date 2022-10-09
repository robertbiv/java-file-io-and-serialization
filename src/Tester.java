//Robert Bennethum IV COMPSCI 221


import java.util.Scanner;
//import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        {
            // For Fraction.java
            int n, d;
            //input
            Scanner s = new Scanner(System.in);
            System.out.println("Enter numerator for Fraction 1: ");
            n = s.nextInt();
            System.out.println("Enter denominator for Fraction 1: ");
            d = s.nextInt();
            Fraction f1 = new Fraction();
            f1.setNumerator(n);
            f1.setDenominator(d);
            System.out.println("Enter numerator for Fraction 2: ");
            n = s.nextInt();
            System.out.println("Enter denominator for Fraction 2: ");
            d = s.nextInt();
            Fraction f2 = new Fraction();
            f2.setNumerator(n);
            f2.setDenominator(d);
            //outputs
            System.out.println("Fraction 1: ");
            f1.display();
            System.out.println("Fraction 2: ");
            f2.display();
            //For Odometer
            double num;
            Odometer o1 = new Odometer();
            System.out.println("Enter Car Efficiency in MPG: ");
            num = s.nextDouble();
            o1.efficiency(num);
            //loop for distance
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter the trip distance");
                num = s.nextDouble();
                o1.milesDriven(num);
            }
            o1.resetOdometer();

            //For Airplane
            Airplane a1 = new Airplane();
            boolean reserveMore = true;
            int row, col;
            char colL;
            String more;

            char[][] seats = new char[7][5];
            Scanner reader = new Scanner(System.in);
            a1.initializeSeats(seats);

//reservation loop
            while (reserveMore == true && a1.isFull(seats) == false) {
                a1.printSeats(seats);
                System.out.print("\n Enter row number: ");
                row = reader.nextInt();
                System.out.print("\n Enter column letter: ");
                colL = reader.next().charAt(0);
                col = a1.getCol(colL); //get col number
//Checking for seat
                if (seats[row - 1][col] == 'X') {
                    System.out.println("\n Seat already reserved!!! Try another seat... \n");
                } else {//Marking seat
                    seats[row - 1][col] = 'X';

                    System.out.println("\n Seat successfully reserved!!! \n");
                }
                //Check to run again
                System.out.print("\n\n Do you want to reserve more? (Yes/No): ");
                more = reader.next();

//Checking if yes
                if (more.equalsIgnoreCase("yes")) {
                    reserveMore = true;
                } else {
                    reserveMore = false;
                }
            }
            a1.printSeats(seats);

            //For Priority Queue

            PriorityQueue q = new PriorityQueue();
            System.out.println('\n');
            q.enqueue("X", 10);
            q.enqueue("Y", 1);
            q.enqueue("Z", 3);
            //print dequeue
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());

            //For Pizza
            Pizza p = new Pizza("large", 1, 1, 2);//object of pizza
            System.out.println(p.calCost());//cost of large pzza
            System.out.println(p.getDescription());//description of pizza

            //object of PizzaOrder class for testing
            PizzaOrder po = new PizzaOrder();
            System.out.println(po.calTotal());

            //For IntList
            int arr[] = {-12, 3, -12, 4, 1, 1, -12, 1, -1, 1, 2, 3, 4, 2, 3, -12};

            // Sorting the original array in descending order
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            int num2 = arr.length;
            int[] resArr = new int[num2];
            resArr = IntList.countOccur(arr, num2);

            //Output
            System.out.println("N\tCount\n");
            for (int i = 0; i < num2; i++) {
                if (i == num2 - 1) {
                    System.out.println(arr[i] + "\t" + resArr[i]);
                } else if (arr[i] != arr[i + 1]) {
                    System.out.println(arr[i] + "\t" + resArr[i]);
                }
            }


            //For Doctor
            Doctor doc = new Doctor();
            doc.setFirstName("Jeff");
            doc.setLastName("Bezos");
            doc.setHireDate("07-05-1994");
            doc.setSalary(34857);
            doc.setSpeciality("Stonks");
            System.out.println("Doctor: " + doc);
        }
    }
}
