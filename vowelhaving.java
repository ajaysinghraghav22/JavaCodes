public class vowelhaving {

    public static void main(String[] args) {
        String name = "kkkd";
        boolean isvowel =false;
        for (char ch : name.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                isvowel =true;
                break;
            } 
        }
        if(isvowel){
            System.out.println("string is vowel");;
        }
        else{
            System.out.println("not a vowel");
        }
    }
}
