/**
 * Created by Bruno on 08/05/2016.
 */

public class Main {
    public static void main(String args[]){
        //IllegalArgumentException - é causada com a passagem de um parâmetro que foge às regras de um determinado método
        //NumberFormatException - tentativa de converter uma string em um tipo numérico, mas a string não contém o tipo apropriado

        try {
            System.out.println(getNumber("5.5"));
        } catch (NumberFormatException e) {
            System.out.println(e.getLocalizedMessage());
        }

        try {
            System.out.println(getPercentage(1.1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static int getNumber(String number){
        return Integer.parseInt(number);
    }

    public static String getPercentage(double percentage){
        if(percentage < 0 || percentage > 1)
            throw new IllegalArgumentException("The argument must be between 0 and 1");

        return Long.toString(Math.round(percentage * 100)) + "%";
    }
}
