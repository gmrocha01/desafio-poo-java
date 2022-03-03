package poo;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{ //Extends é usar coisas de outra classe
    private List<Endereco> enderecos;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private List<Endereco> getEnderecos() {
        if(enderecos == null){
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }

    public void adicionaEndereco(Endereco endereco){
        if (endereco == null){
            throw new NullPointerException("Endereço não pode ser nulo");
        }
        if (endereco.getCep() == null){
            throw new NullPointerException("Cep não pode ser nulo");
        }
        getEnderecos().add(endereco);
    }
}
