package welcome;
import java.util.*;
public class ifelsepractice{
static Scanner m=new Scanner(System.in);
public static void main(String[] args) {
System.out.println("what is your market value?");
int item=m.nextInt();
if(item>50)
System.out.println("market in stock");
else if(item<50)
System.out.println("out of stock");

else
System.out.println("ready to leave");

}
}
