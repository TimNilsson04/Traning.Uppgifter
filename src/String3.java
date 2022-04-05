import javax.swing.*;

public class String3 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Vilken text vill du Palindromera?");
        String b = reverse(a);
        String W = pali(a,b);

        System.out.println(W);
    }
    public static String reverse(String a) {

        String c = "";
        for (int i = a.length(); i > 0; i--) {

            c = c + a.charAt(i-1);
        }
        return c;
    }
    public static String pali(String b, String a){

        String W = "";

        if(a.equals(b)){
            W = "This is a Palindrom";
        }
        else{
            W ="";
        }
        return W;
    }

}


