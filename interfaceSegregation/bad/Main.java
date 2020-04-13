package interfaceSegregation.bad;

public class Main {

    public static void main(String[] args) {

        ShoppingCard crediCard = new CreditCard();
        ShoppingCard sodexoCard = new SodexoCard();
        ShoppingCard giftCard = new BoynerGiftCard();

        crediCard.loadMoney(200000);
        sodexoCard.loadMoney(1550);
        giftCard.loadMoney(2250);

        crediCard.makeMarketShopping(200);
        crediCard.makeOnlineShopping(440);
        crediCard.withDrawMoney(250);

        sodexoCard.makeMarketShopping(400);
        sodexoCard.withDrawMoney(300);
        // Throws Exception!! Bad Software Design!
        // sodexoCard.makeOnlineShopping(300);

        giftCard.withDrawMoney(300);
        // Throws Exception!! Bad Software Design
        // giftCard.makeOnlineShopping(550);
        // giftCard.makeMarketShopping(300);
    }
}
