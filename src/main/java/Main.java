import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
      
      int size = 4;
      Scanner scanner = new Scanner(System.in);
      System.out.print("Podaj swój znak: ");
      char name = scanner.next().charAt(0);
       for (int i = 0; i < size; i++) {
         for (int j = size; j>=i; j--) {
            System.out.print(" ");
         }
         for(int j=0;j<=i;j++){
         
            if (i == 2 && j == 1) {
                System.out.print(" "); 
            } else {
                System.out.print(name);
            }
         }
          System.out.println();
          }
  }
}
