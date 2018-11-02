public class PizzaOrder implements Order{
    double price;
    double weight;
    PizzaOrder (double p, double w){
        price = p;
        weight = w;
    }
    public double calculateTotalPrice() {return price*weight;}
}
