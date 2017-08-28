package com.db.home_singleton;

/**
 * Created by Evegeny on 28/08/2017.
 */
public class TaxCalculator {
    public double withNDS(double price) {
        double nds = NDSResolver2.getInstance().getNDS();
        return price+price*nds;
    }
}
