public class Person {
    private String name;
    private String vacancy;
    private String workPlace;
    private int age;
    private double money;

    public Person(){

    }

    public Person(String name, String vacancy, String workPlace, int age, double money) {
        this.name = name;
        this.vacancy = vacancy;
        this.workPlace = workPlace;
        this.age = age;
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVacancy(String vacancy) {
        this.vacancy = vacancy;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public String getVacancy() {
        return vacancy;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }
}
