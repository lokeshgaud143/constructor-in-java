class student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    student(String name, int age){
        this.name = name;
        this.age = age;
    }

}
class parameterized_constructor{
    public static void main(String[] args) {
        student s = new student("lokesh", 23);
        s.printinfo();
    }
}