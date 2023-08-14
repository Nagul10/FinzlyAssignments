public class NullResult {
    void show(Object str)
    {
        System.out.println("Object");
    }
    void show(String str)
    {
        System.out.println("String");
    }


    public static void main(String[] args) {
        //Object obj = new Object();
        NullResult obj=new NullResult();
        obj.show(null);
    }
}
