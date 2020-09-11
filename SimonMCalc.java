import java.util.Scanner;

public class LLcopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPlaying = true;

  
        while(isPlaying){

        double num1, num2, answer;
  

        System.out.println("Choos type (+ - x / ):    !  for EXIT ");
        String operator = sc.next();


      
        num1 = 0;
        num2 = 0;
        
try {
    System.out.print("Input first integer: ");
    num1 = sc.nextDouble();
    
} catch (Exception e) {
    System.out.println("You did somthing wrong");
}
try {
    System.out.print("Input secound integer: ");
    num2 = sc.nextDouble();
    
} catch (Exception e) {
    System.out.println("You did somthing wrong");
}



        switch (operator){
        case "+":
        answer = num1 + num2;
        System.out.println(answer);
            break;
        case "-":
        answer = num1 - num2;
        System.out.println(answer);
            break;
        case "x":
        answer = num1 * num2;
        System.out.println(answer);
            break;
        case "/":
        answer = num1 / num2;
        System.out.println(answer);
            break;
        case "!":
        isPlaying = false;
        System.out.print("For EXIT");
       break;
       default:
       System.out.println("Bad input!");
        break;
 
    
        }
    
        }
        sc.close();
    }        
    }

