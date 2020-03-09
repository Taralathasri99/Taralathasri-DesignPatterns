package epam.designPatterns;

interface IProduct
{
    String GetName();
    double SetPrice(double price);
}

public class Phone implements IProduct 
{
    private double price;

    public String GetName()
    {
        return "Apple TouchPad";
    }

    public double SetPrice(double price)
    {
        this.price = price;
        return this.price;
    }
}

