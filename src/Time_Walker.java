/*
 * @author: Xuchen
 * @Class Name: Time_Walker
 * @
 */

import java.text.SimpleDateFormat;

import java.util.Date;



public class Time_Walker {
    public static void print_time(){
        SimpleDateFormat data_format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//set the format of time

        Date local_time=new Date();

        System.out.println("St.John's Time: "+data_format.format(local_time));// print time
    }}






