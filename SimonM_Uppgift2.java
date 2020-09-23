public class SimonM_Uppgift2 {

        static void doyouequip1ondW (String K1) {

            System.out.println("CHOOS WEAPON FOR K1 FROM WEAPON LIST");
            System.out.println("WEAPON LIST: \nBroadsword\nDagger\nLongsword\nThrowing Knife");
    
            switch (K1) {
    
            
                default:
                    System.out.print("YOU CAN NOT APPLY A WEAPON FOR K1 THE TOOLSMITH ALL REDY MADE HIM Excalibur ");
                    break;
            }
        }
    
          

            static void doyouequip2ondW (String K2) {
    
            System.out.println("\nCHOOS WEAPON FOR K2 FROM WEAPON LIST");
            System.out.println("WEAPON LIST: \nBroadsword\nDagger\nLongsword\nThrowing Knife");
    
    
            switch (K2){
            
                case "Broadsword":
                System.out.print("THE TOOLSMITH MADE A Broadsword for K2!");
                break;
    
                case "Dagger":
                System.out.print("THE TOOLSMITH MADE A Dagger for K2!");
                break;
    
                case "Longsword":
                System.out.print("THE TOOLSMITH MADE A Longsword for K2!");
                break;
    
                
                case "Throwing Knife":
                System.out.print("THE TOOLSMITH MADE A Throwing Knife for K2!");
                break;
    
                default:
                    System.out.print("THE TOOLSMITH CAN NOT MAKE YOU "+ K2);
                    break;
        }
    
        }
        public static void main(String[] args) {

            doyouequip1ondW("Throwing Knife");
            doyouequip2ondW("Excalibur");
            doyouequip2ondW("Longsword");
        }
    }