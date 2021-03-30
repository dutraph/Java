package OOP3Arrays.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DateCalendar {

    public static void main(String[] args) throws ParseException {

        // Somando unidade de tempo
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2021-02-24T20:58:06Z"));
        System.out.println(sdf.format(d));

        // Add 4 horas na data acima
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY,4);
        d = cal.getTime();
        System.out.println(sdf.format(d));

        // Pegando uma parte da data/hora
        int hour = cal.get(Calendar.HOUR);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
        int day1= cal.get(Calendar.DAY_OF_WEEK);
        int day2 = cal.get(Calendar.DAY_OF_YEAR);
        int day3 = cal.get(Calendar.DAY_OF_MONTH);
        int month = 1 + cal.get(Calendar.MONTH); // add 1 because is like list starts with 0

        System.out.println("Hour: " + hour);
        System.out.println("Minutes: " + min);
        System.out.println("Seconds: " + sec);
        System.out.println("Day week: " + day1);
        System.out.println("Day year: " + day2);
        System.out.println("Day month: " + day3);
        System.out.println("Month: " + month);

    }

}
