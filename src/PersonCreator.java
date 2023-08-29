public class PersonCreator {
    public static void main(String[] args) {
        Person Person01 = new Person("James Peterson", 34, 180,73.5f);
        Person Person02 = new Person("Bob Thornley", 25, 171, 68.2f);

        System.out.println(Person01.getDetails());
        System.out.println(Person02.getDetails());
        Person01.growOlder();
        System.out.println(Person01.getDetails());
    }
}

class Person {
    private String name;
    private int age;
    private int height;
    private float weight;

    public Person (String name, int age, int height, float weight){
        setName(name);
        setAge(age);
        setWeight(weight);
        setHeight(height);
    }

    //Getters
    public String getName() {return name;}
    public int getAge() {return age;}
    public int getHeight() {return height;}
    public float getWeight() {return weight;}
    public String getDetails() {return (getName() + ", " + getAge() + ", " + getHeight() + "cm, " + getWeight() + "lbs.");
    }

    //Setters
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public void setHeight(int height) {this.height = height;}
    public void setWeight(float weight) {this.weight = weight;}

    public void growOlder(){
        this.age++;
        this.height--;
        this.weight -= 0.5f;
    }


}