import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class q9 {
//    String[] newArray= {":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::","||:::"};

    public static void main(String[] args) {
        String[] newArray= {":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::","||:::"};
        String[] zipArray;
//        for (int i=0; i< newArray.length;i++){
//            System.out.print(newArray[i]);
//        }
        ArrayList<Integer> ar= new ArrayList<Integer>();
        Scanner input= new Scanner(System.in);
        System.out.print("please enter the zip code :");
        int zip_code=input.nextInt();
        ar.add(zip_code);

        for (int i=0; i<ar.size();i++){
            System.out.println(ar.get(i));
        }
        String letters= Integer.toString(zip_code);
        char[] test = letters.toCharArray();
        String test1=Arrays.toString(test);
        System.out.println(test1);
//        System.out.println(Arrays.toString(test));



    }
}
