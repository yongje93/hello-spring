package tobyspring.hellospring.learningtest;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;

import java.time.ZoneId;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClockTest {

//    @Test
//    void clock() {
//        Clock clock = Clock.systemDefaultZone();
//
//        LocalDateTime dt1 = LocalDateTime.now(clock);
//        LocalDateTime dt2 = LocalDateTime.now(clock);
//
//        Assertions.assertThat(dt2).isAfter(dt1);
//    }

    @Test
    void fixedClock() {
        Clock clock = Clock.fixed(Instant.now(), ZoneId.systemDefault());

        LocalDateTime dt1 = LocalDateTime.now(clock);
        LocalDateTime dt2 = LocalDateTime.now(clock);

        LocalDateTime dt3 = LocalDateTime.now(clock).plusHours(1);

        Assertions.assertThat(dt2).isEqualTo(dt1);
        Assertions.assertThat(dt3).isEqualTo(dt1.plusHours(1));
    }

}
