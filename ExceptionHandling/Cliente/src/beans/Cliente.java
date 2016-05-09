package beans;

import exceptions.DadoInvalidoException;
import java.util.regex.Pattern;

/**
 * Created by Bruno on 08/05/2016.
 */

public class Cliente {
    private String nome;
    private String CPF;

    public Cliente(String nome, String CPF){
        setNome(nome);
        setCPF(CPF);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.isEmpty())
            throw new DadoInvalidoException("Nome não pode ser vazio");

        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        if(!Pattern.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}", CPF))
            throw new DadoInvalidoException("CPF inválido");

        this.CPF = CPF;
    }
}
