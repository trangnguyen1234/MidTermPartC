
package midtermexam_versiona_extensioncode;
import java.util.*;
public class TestUserprofile {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter user name : ");
        String userName = input.nextLine();
        
        
        System.out.println("Choose one of those genres below ( from 1-4 )");
        for( int i =0; i< UserProfile.getGenres().length; i++){
            System.out.println((i+1)+ "."+UserProfile.getGenres()[i]);                 
    }
        boolean flag = false;
        UserProfile user1 = new UserProfile(userName, " ");
        do{
        System.out.println("You pick : ");
        String userGenre = input.nextLine();
              
        switch(userGenre){
            case ("1"): user1.setGenre("Comedy");
            flag = true;
            break;
            case ("2"): user1.setGenre("Drama");
            flag = true;
            break;
            case ("3"): user1.setGenre("Action");
            flag = true;
            break;
            case ("4"): user1.setGenre("Mystery");
            flag = true;
            break;            
            default : System.out.println("You must pick number from 1-4 only");
                      
        }
        } while (!flag);
        
        System.out.println("Successful created");
        System.out.println(user1.toString());
    }
}
