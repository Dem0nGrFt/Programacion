/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author aitor.martinezparente
 */
public class Alumno extends Persona implements interfaces.Speaker{

    private String career, course;

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Alumno(String career, String course, String name, int age) {
        super(name, age);
        this.career = career;
        this.course = course;
    }

    @Override
    public void speak() {
        System.out.println("Hola, soy un " + getClass().getSimpleName() + " y se hablar.");
        System.out.print("Nombre: " + getName() + "  ");
        System.out.println("Edad: " + getAge());
        System.out.print("Carrera: " + getCareer()+ "  ");
        System.out.println("Curso: " + getCourse());
    }

}
