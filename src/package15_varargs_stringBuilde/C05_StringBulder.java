package package15_varargs_stringBuilde;

public class C05_StringBulder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Yasasin Java");

        System.out.println(sb1.indexOf("Java")); // 8

        System.out.println(sb1.lastIndexOf("s")); // 4

        System.out.println(sb1.indexOf("s")); // 2

        System.out.println(sb1.replace(0,7,"Ne guzel"));

        System.out.println(sb1); // Ne guzel Java

        System.out.println(sb1.toString().toUpperCase()); // NE GUZEL JAVA

        System.out.println(sb1); // Ne guzel Java

        System.out.println(sb1.delete(0,3)); // guzel Java

        System.out.println(sb1.deleteCharAt(5)); // guzelJava 22. satirdaki 5. karakter


    }
}

