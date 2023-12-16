import java.util.ArrayList;
import java.util.Arrays;

public class Function {

    public static String Title1(String str){
        StringBuilder formatada = new StringBuilder();
        str = str.toLowerCase();
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(str.split(" ")));
       for (String frase: arrayList) {
            formatada.append(frase.toUpperCase().substring(0,1) + frase.substring(1));
            formatada.append(" ");
        return formatada.toString();
    }
    public static String Title2(String str){
        String formatada = "";
        String[] array = str.split(" ");
        for (int i = 0; i < array.length; i++) {
            formatada += array[i].toUpperCase().substring(0,1)+array[i].substring(1);
            formatada += " ";
        }
        return formatada;
    }
}
