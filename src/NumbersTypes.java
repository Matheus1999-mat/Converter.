import java.util.Scanner;

public class NumbersTypes {
    
    
    public String integerToHexadecimal(){
        System.out.println("Write an value:");
        Scanner written = new Scanner(System.in);
        int i = written.nextInt();
        String converted = Integer.toHexString(i);
        System.out.println("Hexadecimal:" + converted);
        return converted;
        
        
        
    }
    
    public int hexadecimalToDecimal(){
        System.out.println("Write an value:");
        Scanner written = new Scanner(System.in);
        String value = written.nextLine();
        int decimal = Integer.parseInt(value);
        System.out.println("Decimal:" + decimal);
        return decimal;
        
    }
    public int binaryToDecimal(){
        System.out.println("Write an value:");
        Scanner written = new Scanner(System.in);
        String binarystring = written.nextLine();
        int decimal = Integer.parseInt(binarystring,2);
        System.out.println("Decimal:" + decimal);
        return decimal;
    }
    public String decimalToBinary(){
        System.out.println("Write an value:");
        Scanner written = new Scanner(System.in);
        int decimal = written.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary" + binary);
        return binary;
    }
    public int octalToDecimal(){
        System.out.println("Write an value:");
        Scanner written = new Scanner(System.in);
        String octal = written.nextLine();
        int decimal = Integer.parseInt(octal,8);
        System.out.println("Decimal:" + decimal);
        return decimal;
    }
    public String decimalToOctal(){
        System.out.println("Write an value:");
        Scanner written = new Scanner(System.in);
        int decimal = written.nextInt();
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal:" + octal);
        return octal;
        
        
    }
}
