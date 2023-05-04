import java.time.LocalDate;

import br.com.challenge.domain.Bootcamp;
import br.com.challenge.domain.Courses;
import br.com.challenge.domain.Mentoring;
import br.com.challenge.domain.User;

public class Main {
    public static void main(String[] args) {
        Courses firstCourse = new Courses();
        Courses secondCourse = new Courses();
        Mentoring firstMentoring = new Mentoring();
        Bootcamp bootcamp = new Bootcamp();
        User userDev = new User();

        firstCourse.setTitle("Curso Java");
        firstCourse.setDescription("Curso de Java");
        firstCourse.setWorkload(8);

        secondCourse.setTitle("Curso Java 2");
        secondCourse.setDescription("Curso de Java 2");
        secondCourse.setWorkload(8);

        firstMentoring.setTitle("Mentoria Java");
        firstMentoring.setDescription("Mentoria do curso de Java");
        firstMentoring.setDate(LocalDate.now());

        System.out.println(firstCourse);
        System.out.println(secondCourse);
        System.out.println(firstMentoring);

        bootcamp.setTitle("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");
        bootcamp.getContent().add(firstCourse);
        bootcamp.getContent().add(secondCourse);
        bootcamp.getContent().add(firstMentoring);


        userDev.setName("William");
        userDev.registerBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos William: " + userDev.getContentSignedUp());
        userDev.progression();
        userDev.progression();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos William: " + userDev.getContentSignedUp());
        System.out.println("Conteúdos Concluídos William: " + userDev.getContentConcluded());
        System.out.println("XP: " + userDev.calculatetotalXp());
    }
}
