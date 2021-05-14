/*
 * @author: Xuchen
 * @Class Name: Time_Walker
 * @Class function: Display Time
 */

import java.text.SimpleDateFormat;

import java.util.Date;


// Create A Time


public class Time_Walker {
    String name;
    public Time_Walker(String name){
        this.name=name;
        System.out.println(this.name+ " Is Created");
    }
    public void print_time(){
        SimpleDateFormat data_format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//set the format of time

        Date local_time=new Date();

        System.out.println("St.John's Time: "+data_format.format(local_time));// print time
    }}






