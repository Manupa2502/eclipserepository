package package1;
public class classandobject {
    String name;
    int sal;
    String empcode;
    classandobject(String name,int sal,String empcode){
        this.name=name;
        this.sal=sal;
        this.empcode=empcode;
    
    }
    public void display()
    {
        System.out.println("name: "+name+" slary: "+sal+" empcode: "+empcode);
    }

}
