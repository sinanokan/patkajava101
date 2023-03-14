public class Main {
    public static void main(String[] args) {
        Fighter ali = new Fighter("Muhammed Ali",20,100,85,50.0);
        Fighter mike = new Fighter("Mike Tyson",25,100,80,1.0);
        Match ring = new Match(ali,mike,75,90);
        ring.fight();
    }
}