package test2;

//class Animal {
//	int x =2;
//    public void makeSound() {
//        System.out.println(x);
//    }
//}
//
//class Dog extends Animal {
//    int x =1;
//    public void makeSound() {  // This is shadowing, NOT overriding
//        try {
//			System.out.println(x);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        
//    }
//}

public class Main {
    public static void main(String[] args) {
//    	String s = "Java";
//    	String x = s.concat(" Programming");  // This does not change 's'
//    	System.out.println(s.concat(" Programming"));     // Output: Java
////    	System.out.println(str1==str2);
//    	StringBuffer sb = new StringBuffer(s);
//    	sb.append(" World"); 
//    	System.out.println(sb); 
    	
    	
//    	 String s1 = "Java";
//         String s2 = new String("Java");
//         String s3 = "Ja" + "va";
//         
//         System.out.println(s1 == s2); // (A)
//         System.out.println(s1 == s3); // (B)
//         System.out.println(s1.equals(s2)); // (C)
    	
    	 StringBuilder sb1 = new StringBuilder("Hello");
         StringBuilder sb2 = new StringBuilder("Hello");
//         sb1.append(" World");
         
         System.out.println(sb1 == sb2); // (A)
         System.out.println(sb1.equals(sb2)); // (B)
    	
    	
    }
}