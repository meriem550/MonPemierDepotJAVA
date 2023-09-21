public class Demo{
public static void main (String[] args){
   // System.out.println("salut tout le monde");
   Test t1 = new Test(); //créer un objet
   int resultat = t1 .add(5, 20);
   System.out.println(resultat);
   Test t2 = new Test();
   int resultat1 = t2 .sous(20, 10);
   System.out.println(resultat1);
   Test t3 = new Test();
   int resultat2 = t3 .mult(5, 20);
   System.out.println(resultat2);
}

}