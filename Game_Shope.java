package ProjectYousef;
import java.util.Scanner;
public class Game_Shope {

           static     Scanner  in= new Scanner(System.in);

    public static void main(String[] args){
   String games[]={"grand","fifa","blackops","residentEvil","spiderman","supermario"};

        System.out.println("How many games you want!");
        int num=in.nextInt();

        TotalCart(games,num);
        }
        public static void TotalCart(String array[],int no)
        {
        int total=0,price=0;

        for(int i=0;i<no;i++)
        {
        System.out.println("Choose one of these types by wite the game's name:");
        //to show the user game's name
    for(int j=0; j< array.length; j++) {
        System.out.println(array [j]);
    }

        String option=in.next();

        if(option.equals(array[0]))
        {
        price=100;
        System.out.println("The price is "+price);
        }
        else if(option.equals(array[1]))
        {
        price=200;
        System.out.println("The price is "+price);
        }
        else if(option.equals(array[2]))
        {
        price=300;
        System.out.println("The price is "+price);
        }
        else if(option.equals(array[3]))
        {
        price=170;
        System.out.println("The price is "+price);
        }
        else if(option.equals(array[4]))
        {
        price=70;
        System.out.println("The price is "+price);
        }
        else if(option.equals(array[5]))
        {
        price=80;
        System.out.println("The price is "+price);
        }
        total=total+price;
        }
        System.out.println("");
        System.out.println("The total price is "+total) ;
                }
}