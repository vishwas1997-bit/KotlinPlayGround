package datastructure.string;

public class GetLetter {

    public static void main(String[] args) {
        String name = "Vishwas Khanna";
        String[] strArray = name.split(" ");
        String output = "";
        if (strArray.length > 1){
            output  += String.valueOf(strArray[0].charAt(0));
            output  += String.valueOf(strArray[1].charAt(0));
        } else {
            output  += String.valueOf(strArray[0].charAt(0));
        }
        System.out.println(output);
    }
}
