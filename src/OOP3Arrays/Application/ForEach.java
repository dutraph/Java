package OOP3Arrays.Application;

public class ForEach {

    public static void main(String[] args) {

        String[] names = new String[6];
        names[0] = "Paulo";
        names[1] = "Neide";
        names[2] = "Maria";
        names[3] = "Anete";
        names[4] = "Mark";
        names[5] = "Barbara";

        for (String i:names){
            System.out.println(i);
        }
    }
}
