package hackerrank;

import java.text.DateFormat;

public class DayOfProgrammer {
    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1800));

    }

    public static String dayOfProgrammer(int year) {
        // Write your code here

        //leap year greg = div 400 and 4 -> starts in 1919
        //leap year jul = div 4 -> starts in 1700 until 1917
        //transition jul to greg was in 1918 - that year, jan 31 go to feb 14. minus 13 days.

        //sum of days in normal year until 256 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 = 243 -->
        //                                      jan   feb  mar  apr  may  jun  jul  ago
        // --> 256 - 243 = 13 --> 13.09.xxxx

        // in leap years -> normal year + 1 = 12.09

        //in 1918, we have minus 13 day. So, 13 + 13 =  26.09 or 25.09 if is leap

        // 1918
        if (year == 1918) {
            return "26.09.1918";
        }

        // julian
        if (year < 1918) {
            if (year % 4 == 0) { //isLeap?
                return "12.09." + year;
            } else {
                return "13.09." + year;
            }
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { //isLeap?
                return "12.09." + year;
            } else {
                return "13.09." + year;
            }
        }
    }
}
