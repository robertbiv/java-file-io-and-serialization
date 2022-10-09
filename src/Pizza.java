//Robert Bennethum
class Pizza
{
    //private fields
    private String size;
    private int noOfCheese;
    private int noOfPep;
    private int noOfHam;

    //constructor
    Pizza(String s, int c, int p, int h)
    {
        size=s;
        noOfCheese=c;
        noOfPep=p;
        noOfHam=h;
    }

    //setters
    public void setSize(String s)
    {
        size=s;
    }

    public void setNoOfCheese(int c)
    {
        noOfCheese=c;
    }

    public void setNoOfPep(int p)
    {
        noOfPep=p;
    }

    public void setNoOfHam(int h)
    {
        noOfHam=h;
    }


    //getters
    public String getSize()
    {
        return size;
    }

    public int setNoOfCheese()
    {
        return noOfCheese;
    }

    public int setNoOfPep()
    {
        return noOfPep;
    }

    public int setNoOfHam()
    {
        return noOfHam;
    }


    //calCost methode
    public double calCost()
    {
        int cp=0;
        int ct=2;
        if(size.equals("small"))
            cp=10;
        if(size.equals("medium"))
            cp=12;
        if(size.equals("large"))
            cp=14;

        return cp+ct*(noOfHam+noOfPep+noOfCheese);
    }

    //description methode
    public String getDescription()
    {
        return "Size: "+size+"\nNo of Cheese Topping: "+noOfCheese+"\nNo of Pepperoni Topping: "+noOfPep+"\nNo of Ham Topping: "+noOfHam;
    }
}

//order class
class PizzaOrder
{
    public double calTotal()
    {
        Pizza obj[]=new Pizza[3];//object of 3 orders

        //setting 3 orders
        obj[0]=new Pizza("small",1,1,2);

        obj[1]=new Pizza("medium",1,1,2);

        obj[2]=new Pizza("large",1,1,2);

        double total=0;
        for(int i=0;i<3;i++)
        {
            total+=obj[i].calCost();
        }

        return total;
    }
}
