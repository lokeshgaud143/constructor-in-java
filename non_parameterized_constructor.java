class printname{
    String name;
    int age;
    public void name(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    printname(){
        System.out.println("constuctore called");
    }
}

class non_parameterized_constructor{
    public static void main(String[] args) {
        printname p = new printname();
        p.name = "lokesh";
        p.age = 18;
        
        p.name();
    }
}