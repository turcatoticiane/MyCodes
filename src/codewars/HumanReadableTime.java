package codewars;

public class HumanReadableTime {

    /*
    Write a function, which takes a non-negative integer (seconds) as input
    and returns the time in a human-readable format (HH:MM:SS)
    HH = hours, padded to 2 digits, range: 00 - 99
    MM = minutes, padded to 2 digits, range: 00 - 59
    SS = seconds, padded to 2 digits, range: 00 - 59
    The maximum time never exceeds 359999 (99:59:59)
    You can find some examples in the test fixtures.
     */

    public static void main(String[] args) {

        System.out.println(makeReadable(0)); // 00:00:00
        System.out.println(makeReadable(5)); // 00:00:05
        System.out.println(makeReadable(60)); // 00:01:00
        System.out.println(makeReadable(86399)); // 23:59:59
        System.out.println(makeReadable(359999)); // 99:59:59

    }

    public static String makeReadable(int seconds) {

        //dividir todos os segundos por minutos. O que sobrar, são os segundos que serão apresentados.
        int totalMin = Math.abs(seconds/60);
        int secAns = seconds%60;

        int hoursAns = Math.abs(totalMin/60);
        int minAns = totalMin%60;

        return String.format("%02d", hoursAns) + ":" + String.format("%02d", minAns) + ":" + String.format("%02d",secAns);
    }

    //podemos usar ou o "Strinf.format" ou terário:
    //return String.format("%02d:%02d:%02d", hours, minutes, seconds)
    //return ((hh<10)?"0":"") + hh + ":" + ((mm<10)?"0":"") + mm + ":" + ((ss<10)?"0":"") + ss;

}
