import beans.CadastroCliente;
import beans.Cliente;
import exceptions.ElementoInesistenteException;
import exceptions.ElementoJaExistenteException;
import exceptions.RepositorioException;

/**
 * Created by Bruno on 08/05/2016.
 */
public class Main {
    public static void main(String args[]){
        Cliente cliente1 = new Cliente("Cliente1", "111.111.111-10");
        Cliente cliente2 = new Cliente("Cliente2", "111.111.111-11");
        Cliente cliente3 = new Cliente("Cliente3", "111.111.111-12");
        Cliente cliente4 = new Cliente("Cliente4", "111.111.111-13");
        Cliente cliente5 = new Cliente("Cliente5", "111.111.111-14");
        Cliente cliente6 = new Cliente("Cliente6", "111.111.111-15");
        Cliente cliente7 = new Cliente("Cliente7", "111.111.111-16");
        Cliente cliente8 = new Cliente("Cliente8", "111.111.111-17");
        Cliente cliente9 = new Cliente("Cliente9", "111.111.111-18");
        Cliente cliente10 = new Cliente("Cliente10", "111.111.111-19");
        Cliente cliente11 = new Cliente("Cliente11", "111.111.111-20");

        CadastroCliente cadastro = new CadastroCliente();
        try {
            cadastro.inserir(cliente1);
            cadastro.inserir(cliente2);
            cadastro.inserir(cliente3);
            cadastro.inserir(cliente4);
            cadastro.inserir(cliente5);
            cadastro.inserir(cliente6);
            cadastro.inserir(cliente7);
            cadastro.inserir(cliente8);
            cadastro.inserir(cliente9);
            cadastro.inserir(cliente10);
            cadastro.inserir(cliente11);
        } catch (RepositorioException e) {
            System.out.println(e.getMessage());
        }

        try {
            cadastro.inserir(cliente1);
        } catch (ElementoJaExistenteException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(cadastro.buscar("111.111.111-11").getNome());
            System.out.println(cadastro.buscar("111.111.111-20").getNome());
        } catch (ElementoInesistenteException e) {
            System.out.println(e.getMessage());
        }
    }
}
