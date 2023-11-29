package package1;
public class dataencapsulation2 {
    public static void main(String[] args) {
        dataencapsulation ob1=new dataencapsulation();
        System.out.println("ob1.geta() "+ob1.geta());
        System.out.print("ob1.seta(200) ");
        ob1.seta(200);
        ob1.display();
        System.out.println("ob1.getb() "+ob1.getb());
        System.out.print("ob1.setb(300) ");
        ob1.setb(300);
        ob1.display();
    }
}
