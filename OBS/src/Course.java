public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbal;
    int verbalEffect;
    double cAvarage;

    Course (String name,String code,String prefix,int verbalEffect){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int verbal = 0;
        this.verbalEffect = verbalEffect;
        System.out.println(this.name +" dersine ait sözlü notunun ortalamaya etkisi %"+ verbalEffect + "'dir");
    }

    void addTeacher(Teacher teacher){
        if(teacher.bolum.equals(this.prefix)){
            this.teacher = teacher;
        }else{
            System.out.println("Öğretmenin bölümü ile dersi uyuşmuyor");
        }

    }

    void printTeacherInfo(){
        this.teacher.print();
    }
}
