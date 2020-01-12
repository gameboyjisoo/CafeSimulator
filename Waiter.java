import java.util.Scanner;

public class Waiter
{
    Scanner sc = new Scanner(System.in);
    private String name;
    private MenuList menu;
    private Order order;

    public Waiter(String inputName, MenuList tempMenu)
    {
        this.name = inputName;
        this.order = new Order();
        this.menu = tempMenu;
    }

    public void orderProcess(Customer customer)
    {
        showMenu();
        askOrder();
        calculateTime();
        calculatePrice(customer);
    }

    public void showMenu()
    {
        System.out.println("안녕하세요. 웨이터 " + this.name + "입니다. 메뉴판을 보여드리겠습니다.");
        for (int i = 0; i < menu.getSize(); i++)
        {
            System.out.println(menu.getInfo(i));
        }
    }

    public void calculateTime()
    {
        int sum = 0;
        for (int i = 0; i<order.getSize(); i++)
        {
            sum += this.order.getTime(i);
        }
        System.out.println("총 대기시간은 " + sum + "분입니다.");
    }

    public void calculatePrice(Customer customer)
    {
        double sum = 0;
        for (int i = 0; i<order.getSize(); i++)
        {
            sum += this.order.getPrice(i);
        }
        if (customer instanceof Normal)
        {
            int x = (int) sum;
            System.out.println("총 가격은 " + x + "원입니다.");
        }
        else if (customer instanceof KUStudent)
        {
            sum *= 0.8;
            int x = (int) sum;
            System.out.println("총 가격은 " + x + "원입니다.");
        }
        else if (customer instanceof Teenager)
        {
            sum *= 0.7;
            int x = (int) sum;
            System.out.println("총 가격은 " + x + "원입니다.");
        }
    }

    public void askOrder()
    {
        for (int i = 0; i<this.menu.getSize(); i++)
        {
            System.out.println(menu.getName(i)+" 몇 잔 주문하시겠습니까?");
            int temp = sc.nextInt();
            this.order.addOrder(menu.getDrink(i), temp);         //성공적으로 담고 있다
        }
    }
}
