import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("É um curso Java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso PHP");
        curso2.setDescricao("É um curso PHP");
        curso2.setCargaHoraria(6);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Java DIO");
        bootcampJava.setDescricao("Bootcamp de Java da DIO");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria);

        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme");
        devGuilherme.inscreverBootcamp(bootcampJava);
        System.out.println("Conteudos Inscritos de: " +devGuilherme.getNome() +" - " + devGuilherme.getConteudosInscritos());
        devGuilherme.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos de: " +devGuilherme.getNome() +" - " + devGuilherme.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de: " +devGuilherme.getNome() +" - " + devGuilherme.getConteudosConcluidos());
        System.out.println("XP: " +devGuilherme.calcularTotalXp());
        devGuilherme.progredir(); //Progredir significa concluir o curso.
        System.out.println("XP após progredir: " +devGuilherme.calcularTotalXp());

        System.out.println("\n");
        Dev devMariana = new Dev();
        devMariana.setNome("Mariana");
        devMariana.inscreverBootcamp(bootcampJava);
        System.out.println("Conteudos Inscritos: de: " +devMariana.getNome() + " - " +devMariana.getConteudosInscritos());
        devMariana.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos: de: " +devMariana.getNome() + " - " +devMariana.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de: " +devMariana.getNome() +" - " + devMariana.getConteudosConcluidos());
        System.out.println("XP: " +devMariana.calcularTotalXp());
        devMariana.progredir();
        System.out.println("XP após progredir: " +devMariana.calcularTotalXp());






    }
}
