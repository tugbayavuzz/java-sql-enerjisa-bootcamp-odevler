package odev.tugbayavuz.soru3;

public class MainPair {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>();
        pair.setFirst(10);
        pair.setSecond("kodluyoruz");
     //  pair.setFirst(10,"Hello Generics");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
