import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2= new Curso();

        curso1.setDescricao("Descrição curso java");
        curso1.setTitulo("Java");
        curso1.setCargaHoraria(8);

        curso2.setDescricao("Descrição curso js");
        curso2.setTitulo("Java Script");
        curso2.setCargaHoraria(40);

        Conteudo conteudo = new Curso();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescrição("Bootcamp voltado para java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDenis = new Dev();
        devDenis.setNome("Denis");
        devDenis.increverBootcamp(bootcamp);
        devDenis.progredir();
        System.out.println("Conteudo Incritos" + devDenis.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devDenis.getConteudosConcluidos());
        System.out.println("Xp:" + devDenis.calcularTotalXp());


        System.out.println("-----------------------------------------");
        Dev devMaysa = new Dev();
        devMaysa.setNome("Maysa");
        devMaysa.increverBootcamp(bootcamp);
        devMaysa.progredir();
        devMaysa.progredir();
        devMaysa.progredir();
        System.out.println("Conteudo Incritos" + devMaysa.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devMaysa.getConteudosConcluidos());
        System.out.println("Xp:" + devMaysa.calcularTotalXp());
    }
}