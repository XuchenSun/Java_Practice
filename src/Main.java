/*
* @author: Xuchen
* write a program show the time.
*
*
* */
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

import static java.util.Locale.CHINA;

public class Main {

    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//set the format of time
        Date localTime=new Date();

        System.out.println("St.John's Time: "+df.format(localTime));// print time


        Calendar calendar = Calendar.getInstance(CHINA);
        Date time = calendar.getTime();
        SimpleDateFormat data = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = data.format(time);
        System.out.println(format);

    }
}
