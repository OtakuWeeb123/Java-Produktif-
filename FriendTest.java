public class FriendTest {

    public static void main(String[] args) {
        Friend Elang = new Friend("Elang", 15, "Watching Anime", "Kerja Di Google");
        Friend Alfonso = new Friend("Alfonso", 16, "Playing Football", "Kerja Di Microsoft");
        Friend Adriel = new Friend("Adriel", 17, "Reading Books", "Kerja Di Google");
        Friend Raphael = new Friend("Raphael", 18, "Coding", "Kerja Di Facebook");
        Friend Jane = new Friend("Jane", 19, "Berenang", "Pianis");
    }
}

// Example Friend class (add this in a separate file named Friend.java or as a static inner class)
class Friend {
    String name;
    int age;
    String hobby;
    String career;

    public Friend(String name, int age, String hobby, String career) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.career = career;
    }
}
