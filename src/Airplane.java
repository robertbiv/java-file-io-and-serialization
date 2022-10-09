//Robert Bennethum
class Airplane
{
    //Start seats
    public static void initializeSeats(char[][] seats)
    {
        int i, j;

//Adding row numbers
        for(i=0; i<7; i++)
        {
            seats[i][0] = (char)(i + 48 + 1);
        }

//Adding values
        for(i=0; i<7; i++)
        {
            for(j=1; j<5; j++)
            {
//Adding Seat column letters
                seats[i][j] = (char)(65+j-1);
            }
        }
    }

    //Print Seats
    public static void printSeats(char[][] seats)
    {
        int i, j;

        System.out.println("\n\n The seating arrangement: \n");

        System.out.print("\n |---|---|---|---|---| \n");

//Outer loop for rows
        for(i=0; i<7; i++)
        {
//Inner loop for columns
            for(j=0; j<5; j++)
            {
//Printing character
                System.out.print(" | " + seats[i][j]);
            }

            System.out.print(" |");

//Printing footer
            System.out.print("\n |---|---|---|---|---| \n");
        }
    }

    //Mapping column letter to digit
    public static int getCol(char col)
    {
        if(col == 'A')
            return 1;
        else if(col == 'B')
            return 2;
        else if(col == 'C')
            return 3;
        else
            return 4;
    }

    //Checking for seating full condition
    public static boolean isFull(char[][] seats)
    {
        int i, j;

//Outer loop for rows
        for(i=0; i<7; i++)
        {
//Inner loop for columns
            for(j=1; j<5; j++)
            {
//There is a vacancy
                if(seats[i][j] != 'X')
                {
                    return false;
                }
            }
        }

//All are full
        return true;
    }
}