package poo;

public class Pessoa{
    public enum TipoPessoa {FISICA, JURIDICA}
    public int codigo;
    public String nome, cpf;
    public TipoPessoa tipo;
    private String documento;
    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

    public void setDocumento(String documento) {
        if(documento == null || documento.isEmpty()){
            throw new RuntimeException("Documento não pode ser nulo ou vazio");
        }
        if (documento.length() == TAMANHO_CPF) {
            setDocumento(documento, tipo = TipoPessoa.FISICA);
        }
        else if (documento.length() == TAMANHO_CNPJ) {
            setDocumento(documento, tipo = TipoPessoa.JURIDICA);
        }
        else {
            throw new RuntimeException("Documento inválido para PJ ou PF");
        }
        this.documento = documento;
    }

    private void setDocumento(String documento, TipoPessoa tipo) {
        this.documento = documento;
        this.tipo = tipo;
    }

    public TipoPessoa getTipo() {
        return tipo;
    }
}
