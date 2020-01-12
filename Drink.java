public class Drink
{
    private String name;
    private int price;
    private int makingTime;

    public Drink(String inputName, int inputPrice, int inputTime)
    {
        this.name = inputName;
        this.price = inputPrice;
        this.makingTime = inputTime;
    }

    public String getName()
    {
        return this.name;
    }

    public int getPrice()
    {
        return this.price;
    }

    public int getMakingTime()
    {
        return this.makingTime;
    }
}
