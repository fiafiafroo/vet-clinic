package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Test;

import org.junit.Assert;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class WhenCalculatingTotalPrices {

    @Test
    public void total_consultation_price_should_include_20_percent_tax() {
        // GIVEN
        int netPrice = 100;

        // WHEN
        int totalPrice = TotalConsultationPrice.includingTax().forANetPriceOf(netPrice);

        // THEN
        assertThat(totalPrice, equalTo(120));
    }
}
