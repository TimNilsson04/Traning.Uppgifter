import javax.swing.*;

import static jdk.nashorn.internal.objects.NativeString.length;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class String2 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Vilken text vill du CamelCasa?");
        String c = Camel(a);

        System.out.println(c);
    }
    public static String Camel(String a){

        String c = "";

        for (int i = 0; i < a.length(); i++){


            if(a.charAt(i) == ' ') {
                c = c + toUpperCase(a.charAt(i+1));
                i++;
            }
                else{
                    c = c + a.charAt(i);
                }

                }

        return c;
        }

    }


