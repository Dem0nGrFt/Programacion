package teacher;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author aitor.martinezparente
 */
public class HighSchool {

    private String name;

    private ArrayList<Teacher> teachers = new ArrayList<>();

    /**
     * consigue el valor del nombre
     *
     * @return valor del nombre
     */
    public String getName() {
        return name;
    }

    /**
     * cambia el valor del nombre
     *
     * @param name valor del nombre
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * consigue los valores de la lista de profesores
     *
     * @return valores de la lista de profesores
     */
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * cambia los valores de la lista de profesores
     *
     * @param teachers valores de la lista de profesores
     */
    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    /**
     * crea un nuevo instituto
     *
     * @param name valor para el nombre
     */
    public HighSchool(String name) {
        this.name = name;
    }

    /**
     * consigue el profesor mas pagado
     *
     * @return el profesor mas pagado
     */
    public Teacher mostPaid() {
        double mostPaid = Double.MIN_VALUE;
        Teacher teacher1 = null;

        for (Teacher teacher : teachers) {
            if (teacher.getSalary() >= mostPaid) {
                mostPaid = teacher.getSalary();
                teacher1 = teacher;
            }

        }
        return teacher1;
    }

    /**
     * consigue el profesor menos pagado
     *
     * @return el profesor menos pagado
     */
    public Teacher leastPaid() {

        double mostPaid = Double.MAX_VALUE;
        Teacher teacher1 = null;

        for (Teacher teacher : teachers) {
            if (teacher.getSalary() <= mostPaid) {
                mostPaid = teacher.getSalary();
                teacher1 = teacher;
            }

        }
        return teacher1;
    }

    /**
     * consigue la suma de los salarios
     *
     * @return la suma de los salarios
     */
    public double salaryCosts() {

        double sum = 0;

        for (Teacher teacher : teachers) {
            sum += teacher.getSalary();
        }
        return sum;
    }

    /**
     * consigue la media de los salarios
     *
     * @return la media de los salarios
     */
    public double salaryAverage() {

        double average = 0;

        for (Teacher teacher : teachers) {
            average += teacher.getSalary();
        }
        return average / teachers.size();
    }

    /**
     * inicia la ejecucion
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HighSchool highschool = new HighSchool("neves");

        Teacher careerOfficer = new CareerOfficer(500, 4, "cangas", "patica", "suerez", "montepinar", 1200);

        Teacher interim = new Interim(1000.50, "republica dominicana", "aitor", "martinez", "ponteareas", 5000);

        Teacher substitute = new Substitute(5, Date.from(Instant.now()), "hector", "de sousa", "lugo", 2000);

        careerOfficer.generatePayroll();

        interim.generatePayroll();

        substitute.generatePayroll();

        highschool.getTeachers().add(careerOfficer);

        highschool.getTeachers().add(interim);

        highschool.getTeachers().add(substitute);

        System.out.println(highschool.mostPaid().getName());

        System.out.println(highschool.leastPaid().getName());

        System.out.println(highschool.salaryCosts());

        System.out.println(highschool.salaryAverage());

    }
}
