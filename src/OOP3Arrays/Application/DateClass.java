package OOP3Arrays.Application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.TimeZone;

public class DateClass {

    public static void main(String[] args) throws ParseException {

        /* in Java Date is a number in milliseconds since:
         * 00:00 of 01/01/1970 GMT(UTC)
         *  - GMT: Greenwich Mean Time (Time Zone)
         *  - UTC: Coordinated Universal Time (time standard)
         *
         * Padrao ISO 8601 e classe Instant
         * formato: yyyy-MM-ddTHH:mm:ssZ
         * Ex: "2020-03-29T15:36:28Z"
         * Date y3 = Date.from(Instant.parse("2020-03-29T15:36:28Z"));
         */

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date y1 = sdf1.parse("29/03/2021");
        Date y2 = sdf2.parse("29/03/2021 16:26:00");
        Date x1 = new Date(); //Data exata no momento da execuçao
        Date x2 = new Date(System.currentTimeMillis()); //Data exata no momento da execuçao em milisegundos
        Date x3 = new Date(0L); //Data em milisegundos no caso 0 ms (00:00 of 01/01/1970 GMT(UTC) - como estamos no BR 21:00 of 31/12/1969)
        Date x4 = Date.from(Instant.parse("2021-06-29T20:58:06Z")); //29/06/2021 17:58:06 pois esse padrao esta no UTC -3hrs para mudar olhar sdf3

        System.out.println(y1);
        System.out.println(y2);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);

        System.out.println("--------------------------------------------");
        System.out.println(sdf1.format(y1));
        System.out.println(sdf2.format(y2));
        System.out.println(sdf2.format(x1));
        System.out.println(sdf2.format(x2));
        System.out.println(sdf2.format(x3));
        System.out.println(sdf2.format(x4));

        System.out.println("--------------------------------------------");
        System.out.println(sdf3.format(y1));
        System.out.println(sdf3.format(y2));
        System.out.println(sdf3.format(x1));
        System.out.println(sdf3.format(x2));
        System.out.println(sdf3.format(x3));
        System.out.println(sdf3.format(x4));

    }
}
