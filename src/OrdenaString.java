import java.util.*;
import java.util.stream.Collectors;

public class OrdenaString {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

        cursos.forEach(c-> System.out.println(c.getNome()));
        int a = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .sum();

       cursos.parallelStream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos() ))
                .forEach((nome, qde) -> System.out.println(nome + " tem " + qde));
       // System.out.println(cursos.));
        

    }

}
