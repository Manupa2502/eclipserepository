package package1;
public class Thisforreusability {
    String name;
    String empcode;
    float salary;
    char band;
    Thisforreusability(String name,String empcode,float salary){
        this.name=name;
        this.empcode=empcode;
        this.salary=salary;
        System.out.println(name+ " "+empcode+" "+salary);
    }
    Thisforreusability(String name,String empcode,float salary,char band)
    {
        this(name,empcode,salary);
        this.band=band;
        System.out.println(name+" "+empcode+" "+salary+" "+band );
    }
    public static void main(String[] args) {
        System.out.println("inside main");
        Thisforreusability obj =new Thisforreusability("manu","SOVYOW", 20000.0f, '6');
        Thisforreusability obj1=new Thisforreusability("dp", "abcdef", 40000);
    }
    
}
