public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Okan","MAT","55622");
        Teacher t2 = new Teacher("Cafer","FZK","054343");
        Teacher t3 = new Teacher("Erhan","TRH","0532323");

        Course tarih = new Course("Tarih","101","TRH",50);
        tarih.addTeacher(t3);

        Course fizik = new Course("Fizik","102","FZK",50);
        fizik.addTeacher(t2);

        Course matematik = new Course("Matematik","103","MAT",50);
        matematik.addTeacher(t1);

        Student s1 = new Student("Bektaş","107","3",tarih,fizik,matematik);
        s1.addBulkExamNote(50,50,50);
        s1.addBulkVerbalNote(100,100,100);

        s1.calcAvarage();
        s1.printNote();
        s1.isPass();



    }
}