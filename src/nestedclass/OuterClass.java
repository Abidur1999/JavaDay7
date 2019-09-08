package nestedclass;

public class OuterClass {
    public  String name;
    InnerClassA inner = new InnerClassA();

    public void outerClassMethodA(){
        System.out.println("Outer meathod A");
    }
    public class InnerClassA{
        private String id;

        public void innerMethodA(){
            System.out.println("Inner method A");
        }

    }
}
