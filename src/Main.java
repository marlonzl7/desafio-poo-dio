import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso(
                "Lógica de programação com Java",
                "Curso de lógica de programação com a linguagem Java. Aqui você aprenderá do básico desde variáveis até arrays",
                60);

        Curso cursoLinguagemC = new Curso(
                "Curso completo de programação com linguagem C",
                "Aqui você aprenderá desde o básico até o avançado de algoritmos e estruturas de dados",
                180);

        Mentoria mentoriaJava = new Mentoria("Mentoria Java", "Descrição mentoria Java", LocalDate.of(2025, 2, 25));

        Bootcamp bootcampJavaBackend = new Bootcamp("Bootcamp Java Backend Developer", "Aqui você aprenderá a fazer aplicações backend com Java e projetos práticos");
        bootcampJavaBackend.getConteudos().add(cursoJava);
        bootcampJavaBackend.getConteudos().add(mentoriaJava);

        Dev devMarlon = new Dev("Marlon");
        devMarlon.inscreverBootcamp(bootcampJavaBackend);
        devMarlon.progredir();
        devMarlon.progredir();
        System.out.println("Aluno: " + devMarlon.getNome());
        System.out.println("Conteúdos Inscritos: " + devMarlon.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devMarlon.getConteudosConcluidos());
        System.out.println("XP: " + devMarlon.calcularTotalXp());

        System.out.println("-----------------");

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcampJavaBackend);
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
    }
}
