package beans;

import exceptions.ElementoInesistenteException;
import exceptions.ElementoJaExistenteException;
import exceptions.RepositorioException;

/**
 * Created by Bruno on 08/05/2016.
 */
public class CadastroCliente {
    private final int MAX = 10;
    private int qtd = 0;
    private Cliente[] clientes = new Cliente[MAX];

    public void inserir(Cliente _cliente){
        for (Cliente cliente: clientes) {
            if (cliente != null)
                if (cliente.getCPF().equals(_cliente.getCPF()))
                    throw new ElementoJaExistenteException("CPF já cadastrado");
        }

        if (this.qtd == this.MAX)
            throw new RepositorioException("Limite de cadastros atingido");

        this.clientes[this.qtd] = _cliente;
        this.qtd++;
    }

    public Cliente buscar(String _CPF){
        for (Cliente cliente: clientes) {
            if (cliente != null)
                if (cliente.getCPF().equals(_CPF))
                    return cliente;
        }

        throw new ElementoInesistenteException("Cliente não cadastrado");
    }
}
