package View;

import Controller.Interfaces.iGetView;
import Model.Core.Student;

import java.util.List;
/*
Класс ViewClassEng вывод данных на английском языке
 */
public class ViewClassEng implements iGetView {
    /*
    Метод вывода в консоль списка студентов
     */
    @Override
        public void printAllStudent(List<Student> students) {
            System.out.println("----------- LIST OF STUDENTS -----------");
            for (Student s : students) {
                System.out.println(s);
            }
            System.out.println("----------------------------------------");
        }



    @Override
    public String prompt(String msg) {
        return null;
    }
}
