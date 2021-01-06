import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeCalculations {

    public static void main (String args[]) throws ParseException {
        String Time1 = "24/12/2018 12:00:00";
        String Time2 = "24/12/2018 18:30:00";

        // date format
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d1 = null;
        Date d2 = null;
        try {
            d1 = format.parse(Time1);
            d2 = format.parse(Time2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long diff = d2.getTime() - d1.getTime();
        long diffSeconds = diff / 1000;
        long diffMinutes = diff / (60 * 1000);
        long diffHours = diff / (60 * 60 * 1000);
//        System.out.println("Time in seconds: " + diffSeconds + " seconds.");
//        System.out.println("Time in minutes: " + diffMinutes + " minutes.");
//        System.out.println("Time in hours: " + diffHours + " hours.");

        System.out.println( diffMinutes/60 + "Hours"+diffMinutes%60+" minutes.");

        String dateStr = "Mon Jun 18 00:00:00 IST 2012";
        DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
        Date date = (Date)formatter.parse(dateStr);
        System.out.println(date);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        String formatedDate = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" +         cal.get(Calendar.YEAR);
        System.out.println("formatedDate : " + formatedDate);


    }
}
