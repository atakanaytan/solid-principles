package interfaceSegregation.good.impl;

import interfaceSegregation.good.MarketShoppingCard;
import interfaceSegregation.good.ShoppingCard;

public class SodexoCard implements ShoppingCard, MarketShoppingCard {

    private double currentMoneyValue = 0;


    @Override
    public double loadMoney(double value) {
        this.currentMoneyValue += value;
        return this.currentMoneyValue;
    }

    @Override
    public double withDrawMoney(double value) {
        this.currentMoneyValue -= value;
        return this.currentMoneyValue;
    }

    @Override
    public double makeMarketShopping(double value) {
        this.currentMoneyValue -= value;
        return this.currentMoneyValue;
    }

}
