import java.util.Scanner;
import java.util.Random;
public class rockpaperscissorusingjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        System.out.println("Enter 0 for rock || 1 for paper || 2 for scissors");
        int userinput = sc.nextInt();
        int computerinput = ra.nextInt(3);
        if(computerinput==0 && userinput ==1 || computerinput==1 && userinput==2|| computerinput==2 && userinput==0){
            System.out.println("You Win");
        }
        else if(computerinput==userinput){
            System.out.println("Draw!!");
        }
        else{
            System.out.println("You lose!1");
        }
        System.out.println("Your's choice: "+userinput);
        System.out.println("Computer's choice: "+computerinput);
    }
}
