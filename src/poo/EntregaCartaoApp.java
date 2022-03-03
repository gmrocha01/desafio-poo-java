package poo;

public class EntregaCartaoApp {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        //endereco.setCep("92030-170");


        Cliente cliente = new Cliente();

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso");

        }catch (Exception e){
            System.err.println("Houve um erro ao adicionar endereço: " +e.getMessage());
        }

    }
}
