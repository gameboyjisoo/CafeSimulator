import java.util.*;

public class MenuList
{
    private List<Drink> menuList;

    public MenuList(List<Drink> menuList)
    {
        this.menuList = menuList;
    }

    public MenuList()
    {
        this.menuList = new ArrayList<Drink>();
    }

    public void addList(Drink a, Drink b, Drink c, Drink d, Drink e)
    {
        this.menuList.add(a);
        this.menuList.add(b);
        this.menuList.add(c);
        this.menuList.add(d);
        this.menuList.add(e);
    }

    public String getName(int i)
    {
        return this.menuList.get(i).getName();
    }

    public int getPrice(int i)
    {
        return this.menuList.get(i).getPrice();
    }

    public int getMakingTime(int i)
    {
        return this.menuList.get(i).getMakingTime();
    }

    public int getSize()
    {
        return this.menuList.size();
    }

    public String getInfo(int i)
    {
        return (this.menuList.get(i).getName() + ": " + this.menuList.get(i).getPrice() + "원. 만드는 시간 " + this.menuList.get(i).getMakingTime() + "분");
    }

    public Drink getDrink(int i)
    {
        return menuList.get(i);
    }


}
