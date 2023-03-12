public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }
    void addBulkExamNote(int note1, int note2, int note3){
        if(note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
        }
        if(note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }
        if(note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }
    }
    void addBulkVerbalNote(int verbal1, int verbal2, int verbal3){
        if(verbal1 >= 0 && verbal1 <= 100){
            this.c1.verbal = verbal1;
        }
        if(verbal2 >= 0 && verbal1 <= 100){
            this.c2.verbal = verbal2;
        }
        if(verbal3 >= 0 && verbal3 <= 100){
            this.c3.verbal = verbal3;
        }
    }
    double calcAvarage(){
        this.c1.cAvarage = (this.c1.note *((100 - this.c1.verbalEffect)/100.0)) + (this.c1.verbal * (this.c1.verbalEffect/100.0));
        this.c2.cAvarage = (this.c2.note *((100 - this.c2.verbalEffect)/100.0)) + (this.c2.verbal * (this.c2.verbalEffect/100.0));
        this.c3.cAvarage = (this.c3.note *((100 - this.c3.verbalEffect)/100.0)) + (this.c3.verbal * (this.c3.verbalEffect/100.0));
        this.avarage = (this.c1.cAvarage + this.c2.cAvarage + this.c3.cAvarage)/3.0;
        return this.avarage;
    }
    void isPass(){
        if(this.avarage > 55){
            this.isPass = true;
        }
        if(isPass){
            System.out.println("Başarıyla geçtiniz..");
        }else {
            System.out.println("Kaldınız...");
        }
    }
    void printNote(){
        System.out.println(this.c1.name + "Notu\t:" + this.c1.note);
        System.out.println(this.c2.name + "Notu\t:" + this.c2.note);
        System.out.println(this.c3.name + "Notu\t:" + this.c3.note);
        System.out.println("Notunuz: " + calcAvarage());
    }
}
