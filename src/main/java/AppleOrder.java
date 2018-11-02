public class AppleOrder implements Order {
    double price;
    double quantity;

    AppleOrder (double p, double q){
        price = p;
        quantity = q;
    };
    public double calculateTotalPrice() {return price*quantity;}
}
