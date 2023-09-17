class student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    student(student s2){
        this.name = s2.name;
        this.age = s2.age;

    }
    student(){
        
    }

}

class parameterized_constructor{
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "lokesh";
        s1.age = 23;

        student s2 = new student(s1);
        s2.printinfo();
    }
}