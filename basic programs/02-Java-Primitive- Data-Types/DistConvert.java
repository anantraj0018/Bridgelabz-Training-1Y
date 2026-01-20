import java.util.*;
public class DistConvert {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dist in feet");
        int distinfeet=sc.nextInt();
        int distinyard=distinfeet/3;
        double distinmile=distinfeet/5280;
        System.out.println("The distance in yards is=" +distinyard+ "  while the distance in miles is=" +distinmile);


    }
}