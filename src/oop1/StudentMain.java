package oop1;

public class StudentMain {

    public static void main(String[] args) {

       //Student telebe = new Student(101,"Rafael","Mammadov", 75,true);
       //Student telebe1 = new Student(102,"Amin", "Mensimov", 51,true);
       /*  telebe.id = 100;
        telebe.name = "Nihad";
        telebe.surname = "Azizov";
        telebe.avg = 72;
        telebe.isActive = true;*/

//        telebe.printData();
//        telebe1.printData();

        Student student = new Student();
        //set
        student.setId(102);
        student.setName("Rafael");
        student.setSurname("MaMmadov");
        student.setAvg(77);
        student.setActive(true);

        //System.out.println(student);

        //get
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getAvg());
        System.out.println(student.isActive());

    }
}
