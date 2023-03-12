public class Teacher {
    String name;
    String bolum;
    String phone;

    Teacher(String name,String bolum,String phone){
        this.name = name;
        this.bolum = bolum;
        this.phone = phone;
    }

    void print(){
        System.out.println("Adı: " + this.name);
        System.out.println("Bolümü: " + this.bolum);
        System.out.println("Telefonu: " + this.phone);
    }
}
