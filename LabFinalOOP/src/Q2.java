import java.io.*;
import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {
        try{
            File ifl = new File("a.txt");
            File ofl = new File("b.txt");
            FileWriter wfl = new FileWriter(ofl);
            Scanner sc = new Scanner(ifl);

            String data = sc.nextLine();    //sir
            char [] arr = data.toCharArray();   //['s','i','r'];

            String v = "aeiouAEIOU";

            for (int i = 0; i <arr.length ; i++) {
                if (v.contains(Character.toString(arr[i]))){    //["s","i","r"];
                    wfl.write(arr[i]);
                }
            }

            sc.close();
            wfl.close();


        } catch (Exception e){
            e.printStackTrace();
        }









    }

}
