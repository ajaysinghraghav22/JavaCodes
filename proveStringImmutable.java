public class proveStringImmutable {
    public static void main(String[] args) {
        String name ="ajay";
        String name2=name;
        name="thakur";
       if(name==name2){
System.out.println("true");
       }
       else{
        System.out.println("not");
       }
       System.out.println(name2);
    }
}
