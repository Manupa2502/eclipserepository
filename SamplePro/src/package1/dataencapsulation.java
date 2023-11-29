package package1;
public class dataencapsulation {
    //data encapsulation is the process of giving access to private members of class indirectly
    //direct access may effect all child class if made chnages like name of variable in parent class
    private int a=10;
    private int b=20;
    public int geta()
    {
        return a;
    }
    public void seta(int a){
        this.a=a;
    }
    public int getb(){
        return b;
    }
    public void setb(int b){
        this.b=b;
    }
    public void display()
    {
        System.out.println("a= "+a+" b= "+b);
    }
}
