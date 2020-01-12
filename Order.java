import java.util.ArrayList;
import java.util.List;

public class Order
{
    private List<Drink> orderList;

    public Order(List<Drink> menuList)
    {
        this.orderList = menuList;
    }

    public Order()
    {
        this.orderList = new ArrayList<Drink>();
    }

    public void addOrder(Drink index, int num)
    {
        for (int i = 0; i<num; i++)
        {
            this.orderList.add(index);
        }
    }

    public int getTime(int i)
    {
        return this.orderList.get(i).getMakingTime();
    }

    public int getPrice(int i)
    {
        return this.orderList.get(i).getPrice();
    }

    public int getSize()
    {
        return this.orderList.size();
    }

}
