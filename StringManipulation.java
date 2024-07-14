class StringManipulation {
    public static void main(String args[]){
        String word="Elephant";

        String strlow=word.toLowerCase();
        String strupp=word.toUpperCase();
        String substr=word.substring(1,5);
        int strlen=word.length();

        System.out.println("lower cased : "+strlow);
        System.out.println("upper cased : "+strupp);
        System.out.println("sub string 1 to 5 : "+substr);
        System.out.println("string length : "+strlen);
        

    }
}
