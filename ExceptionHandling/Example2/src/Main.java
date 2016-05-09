/**
 * Created by Bruno on 08/05/2016.
 */
public class Main {
    public static void main(String args[]){
        ContaCorrente cc = new ContaCorrente(2000);

        try {
            cc.setValorLimite(-2500);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            cc.depositar(2000);
            cc.sacar(2000);
            cc.sacar(2001);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            cc.depositar(-1000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
