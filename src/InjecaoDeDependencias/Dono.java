package InjecaoDeDependencias;

public class Dono {

    private Animal animal; //Declarou que a classe Animal vai ser chamada por animal

    public Dono (Animal animal){ //Construiu um construtor recebendo Animal
        this.animal = animal;
    }
    public void animal(){
        animal.acao();
    }
    public static void main(String[] args) {
        Dono dono = new Dono(new Cachorro()); //Passa aqui qual vai ser o Animal, nesse caso Cachorro ou Gato
        dono.animal(); //Chama a função animal que irá na Classe exibir a msg de qual bicho será.
    }
}
