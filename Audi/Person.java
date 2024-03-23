public class Person {
    private String name;
    private int age;
    private String gender;
    private double weight;
    private String nationality;

    // Constructor
    public Person(String name, int age, String gender, double weight, String nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.nationality = nationality;
    }

    // Method to check if the person can talk
    public void canTalk() {
        System.out.println(name + " can talk.");
    }

    // Method to check if the person can walk
    public void canWalk() {
        System.out.println(name + " can walk.");
    }

    // Method to check if the person can vote
    public void canVote() {
        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
            System.out.println(name + " can vote.");
        } else {
            System.out.println(name + " cannot vote.");
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public String getNationality() {
        return nationality;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public static void main(String[] args) {
        // Example usage
        Person person1 = new Person("John", 25, "Male", 70.5, "Indian");
        Person person2 = new Person("Alice", 16, "Female", 55.0, "American");

        person1.canTalk();
        person1.canWalk();
        person1.canVote();

        person2.canTalk();
        person2.canWalk();
        person2.canVote();
    }
}