import java.util.*;
class day {
    
public static void main(String args[])

{
    Scanner s =new Scanner(System.in);
    int day=s.nextInt();
    int month=s.nextInt();
    int year=s.nextInt();
    
    String dayarr[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THRUSDAY","FRIDAY","SATURDAY"};
    Calendar c=Calendar.getInstance();
    c.set(Calendar.YEAR,year);
    c.set(Calendar.MONTH,month-1);
    c.set(Calendar.DATE,day);
    int h= c.get(Calendar.DAY_OF_WEEK);
   
    System.out.println(h+" \n"+ dayarr[h-1] +"  \n"+c.getTime());
}

}
