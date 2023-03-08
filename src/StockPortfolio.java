import java.util.ArrayList;
import java.util.Scanner;
public class StockPortfolio {
    StockPortfolio st = new StockPortfolio();
    Account account = new Account(140000);
    Scanner scanner = new Scanner(System.in);

    boolean exit = true;
        while(exit) {
        System.out.println("Enter \n1)To add stock\n2)to display stock\n3)debit from account\n4)exit");
        int Choice = scanner.nextInt();
        switch (Choice) {
            case 1:
                st.stockPortfolio();
                break;
            case 2:
                st.display();
                break;
            case 3:
                account.debit(st.totalValue);
                break;
            case 4:
                exit = false;
                break;
            default:
                break;
        }
    }
}
}