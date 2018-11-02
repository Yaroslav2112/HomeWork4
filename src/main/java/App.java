public class App {
    public static void main(String[] args) {
    AppleOrder ao = new AppleOrder(9, 2.5);
        System.out.println("ціна яблука ao: " + ao.price);
        System.out.println("кількість яблук ao: " +ao.quantity);
       System.out.println("вартість яблук ao: " + ao.calculateTotalPrice());
        System.out.println("======================");
       PizzaOrder po = new PizzaOrder(120.5,0.7);
        System.out.println("ціна піци po: " + po.price);
        System.out.println("вага піци po: " + po.weight);
        System.out.println("вартість піци po: " + po.calculateTotalPrice());

    }
}
