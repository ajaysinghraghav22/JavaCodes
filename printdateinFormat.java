import java.util.*;

import java.text.SimpleDateFormat;
public class printdateinFormat {
    public static void main(String[] args) {
       String format ="MM dd yy";
       SimpleDateFormat dateformat = new SimpleDateFormat(format);
       Date date = new Date();// Get current date
       System.out.println(dateformat.format(date));
    }
}