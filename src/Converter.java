import java.util.Scanner;
public class Converter {

    
    public static void main(String[] args) {
        NumbersTypes nt = new NumbersTypes();
        Scanner written = new Scanner(System.in);
        while (true){
            System.out.println("Choose 1 to convert binary to decimal.");
            System.out.println("Choose 2 to convert decimal to binary.");
            System.out.println("Choose 3 to convert octal to decimal");
            System.out.println("Choose 4 to convert decimal to octal.");
            System.out.println("Choose 5 to convert integer to hexadecimal.");
            System.out.println("Choose 6 to convert hexadecimal to decimal.");
            System.out.println("Choose an option:");
            int option = written.nextInt();
            
            switch(option){
                case 1:
                    nt.binaryToDecimal();
                    break;
                    
                case 2:
                    nt.decimalToBinary();
                    break;
                    
                case 3:
                    nt.octalToDecimal();
                    break;
                
                case 4:
                    nt.decimalToOctal();
                    break;
                    
                case 5:
                    nt.integerToHexadecimal();
                    break;
                    
                case 6:
                    nt.hexadecimalToDecimal();
                    break;
                    
                default:
                    System.out.println("Choose an option.");
                    
            }
                
                
        }
        
        //nt.integerToHexadecimal();
        
        
    }
    
}
