
import java.util.*;
class Result {

    public static String findDay(int month, int day, int year) {
         String str="";
        
        String[] arr={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
      Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1,day);        
        return arr[calendar.getTime().getDay()];
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.print("Eneter month: ");
        int month = sc.nextInt();
        System.out.print("Eneter day in numbers 0-6 : ");
        int day = sc.nextInt();
        System.out.print("Eneter yaer: ");
        int year = sc.nextInt();
        String res = Result.findDay(month, day, year);
        System.out.print(res);

    }
}
