package com.db.junit_examples;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Evegeny on 28/08/2017.
 */
@AllArgsConstructor(access =  AccessLevel.PACKAGE)
@NoArgsConstructor
public class TaxCalculator {
    private NDSResolver ndsResolver = new NDSResolverImpl();

    public double withNDS(double price) {
        double nds = ndsResolver.getNDS();
        return price+price * nds;
    }
}
