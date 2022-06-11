public class Person {
    String name;
    int age;
    int height;
    double weight;

    public Person(String name, int age, int height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    /**
     * get field
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * set field
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get field
     *
     * @return age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * set field
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * get field
     *
     * @return height
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * set field
     *
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * get field
     *
     * @return weight
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * set field
     *
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void growOlder(){
        age++;
        height--;
        weight-=0.5;
    }
}
