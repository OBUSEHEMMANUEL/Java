package Deitel.chapter_17;

import java.math.BigDecimal;
import java.math.BigInteger;

public class InstrumentMain {
    public static void main(String[] args) {
      call();
//        BigInteger soup = BigInteger.valueOf(500);
    }
    public static void  call(){
        Instrument instrument = (i)->{ System.out.println("playing a "+ i);
        };
        instrument.play("piano");
    }
}
