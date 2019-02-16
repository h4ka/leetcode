public class TimeConversion {


    static String timeConversion(String s) {

        String time24 = "";

        if (s.endsWith("AM")){
            time24 = s.startsWith("12") ? "00" : s.substring(0,2);
        } else {
            int hour24 = s.startsWith("12") ? 12 : Integer.valueOf(s.substring(0,2)) + 12;
            time24 = String.valueOf(hour24);
        }

        return time24.concat(s.substring(2,8));

    }


}
