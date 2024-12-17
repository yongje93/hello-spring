package tobyspring.hellospring.exrate;

import java.math.BigDecimal;
import tobyspring.hellospring.payment.ExRateProvider;

public class SimpleExRateProvider implements ExRateProvider {

    @Override
    public BigDecimal getExRate(String currency) {
        if (currency.equals("USD")) {
            return new BigDecimal("1000");
        }

        throw new IllegalArgumentException("지원되지 않는 통화입니다.");
    }
}
