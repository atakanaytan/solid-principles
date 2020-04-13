package interfaceSegregation.good;

import interfaceSegregation.good.impl.BoynerGiftCard;
import interfaceSegregation.good.impl.CreditCard;
import interfaceSegregation.good.impl.SodexoCard;

public class Main {

    public static void main(String[] args) {

        ShoppingCard creditCard = new CreditCard();
        ShoppingCard sodexoCard = new SodexoCard();
        ShoppingCard giftCard = new BoynerGiftCard();

        creditCard.loadMoney(10000);
        sodexoCard.loadMoney(750);
        giftCard.loadMoney(1000);

        ((MarketShoppingCard)sodexoCard).makeMarketShopping(100);
        ((OnlineShoppingCard)creditCard).makeOnlineShopping(200);

        giftCard.withDrawMoney(250);

    }
}
