import java.time.LocalDate;

import br.com.challenge.domain.Courses;
import br.com.challenge.domain.Mentoring;

public class Main {
    public static void main(String[] args) {
        Courses firstCourse = new Courses();

        firstCourse.setTitle("Curso Java");
        firstCourse.setDescription("Curso de Java");
        firstCourse.setWorkload(8);

        Courses secondCourse = new Courses();

        secondCourse.setTitle("Curso Java 2");
        secondCourse.setDescription("Curso de Java 2");
        secondCourse.setWorkload(8);

        System.out.println(firstCourse);
        System.out.println(secondCourse);

        Mentoring firstMentoring = new Mentoring();

        firstMentoring.setTitle("Mentoria Java");
        firstMentoring.setDescription("Mentoria do curso de Java");
        firstMentoring.setDate(LocalDate.now());

        System.out.println(firstMentoring);
    }
}
