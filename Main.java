import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Drink Milktea = new Drink("밀크티", 3000, 10);
        Drink Americano = new Drink("아메리카노", 2000, 5);
        Drink AppleJuice = new Drink("사과 주스", 4000, 15);
        Drink Cappuchino = new Drink("카푸치노", 2500, 8);
        Drink SparklingWater = new Drink("스파클링 워터", 3000, 3);
        MenuList menu = new MenuList();
        menu.addList(Milktea, Americano, AppleJuice, Cappuchino, SparklingWater);
        Waiter waiter = new Waiter("John", menu);

        System.out.println("신분을 밝혀주십시오. 일반, 고려대생, 청소년 셋 중 하나를 입력해주십시오.");
        String customerType = sc.next();
        if (customerType.equals("일반"))
        {
            Normal customer = new Normal();
            waiter.orderProcess(customer);
        }
        else if (customerType.equals("고려대생"))
        {
            KUStudent customer = new KUStudent();
            waiter.orderProcess(customer);
        }
        else if(customerType.equals("청소년"))
        {
            Teenager customer = new Teenager();
            waiter.orderProcess(customer);
        }
        else
        {
            System.out.println("잘못 기입하였습니다. 프로그램을 다시 실행해주십시오.");
        }
    }
}