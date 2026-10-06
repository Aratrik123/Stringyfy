import java.util.Scanner;
public class Stringy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        char[] charArray = (scanner.nextLine()+' ').toCharArray();
        System.out.println("Inputted String:" + new String(charArray));
        String s = new String();
        int i,j;
        for (i = 0; i < charArray.length; i+=2) {
            j = i + 1;
                s += charArray[i];
            if(charArray[j] == ' ')
                s += ' ';
        }
        System.out.println("String:"+s);
    }
    
}
