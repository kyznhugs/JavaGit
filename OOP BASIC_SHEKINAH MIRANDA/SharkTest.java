import java.util.Scanner;
public class SharkTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shark s = new Shark();
        
        for(int i = 0; i < 5;) {
            System.out.print("Choose a shark (1-5): ");
            int c = sc.nextInt();
            sc.nextLine();
        
            
            if (c == 1)  s.setName("Hammerhead Shark");
            else if (c == 2)  s.setName("Lemon Shark");
            else if (c == 3)  s.setName("Nurse Shark");
            else if (c == 4)  s.setName("Great white Shark");
            else if (c == 5)  s.setName("Mako Shark");
            else  s.setName("Unknown (Please choose again from 1-5 only)");

            System.out.println("WOW! You get a : " + s.getName());
            System.out.println();
        }

        sc.close();
    }
}