public class Main {
    public static void main(String[] args) {
        //Contains zero items.
        Payment payment1 = new Payment();
        System.out.println(payment1);
        //Contains one items.
        Payment payment2 = new Payment();
        payment2.addBuy("pasta",20);
        System.out.println(payment2);
        //Contains second items.
        Payment payment3 = new Payment();
        payment3.addBuy("pasta",20);
        payment3.addBuy("juice",30);
        System.out.println(payment3);
    }
}
