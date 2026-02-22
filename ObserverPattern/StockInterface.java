import java.util.ArrayList;

public interface StockInterface
{
    public void register(Investor investor);
    public void deregister(Investor investor);
    public void notifyChange();
}

public interface Investor
{
    public void update(Stock stock);
}


public class Investor_A implements Investor
{
    @Override
    public void update(Stock stock) {
        System.out.println(stock.name + "" + stock.price);
    }
}

public class Stock implements StockInterface
{
    private double  price;
    String name;
    private ArrayList<Investor> observer;

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
        observer = new ArrayList<>();
    }

    public void setPrice(double price) {    
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public void register(Investor investor) {
        if(observer.contains(investor) == false) {
            observer.add(investor);
        }else {

            System.out.println("Investor is already registered");
        }
    }

    @Override
    public void deregister(Investor investor) {
        if(observer.contains(investor) == true) {
            observer.remove(investor);
        }else {
            System.out.println("Investor is not Present");
        }
    }


    @Override
    public void notifyChange() {
        for(Investor investor: observer) {
            investor.update(this);
        }
    }
}


public class Investor_B implements Investor
{
    @Override
    public void update(Stock stock) {
        System.out.println(stock.name + " : " + stock.price);
    }
}

public class StockMarket
{
    public static void main(String args[]) {
        Stock stock = new Stock("AAPL", 100.0);

        Investor_A investorA = new Investor_A();
        Investor_B investorB = new Investor_B();
        
        stock.register(investorA);
        stock.register(investorB);
        stock.setPrice(150.0);
        stock.notifyChange();
    }
}