package day7;

public class ex2 {
    public static void main(String[] args) {

// *Remove all vowels from a given sentences. and

        String text= "fvbjf fjfsşg fsgsı oıfjgoşs";

            System.out.println(text.toUpperCase().replaceAll("[aeıioöuü]",""));

        //SECOND solution
        String sentence2="Hello world";

        String newSentences=sentence2;

        String dizi="aeıioöuü";

        for (int i = 0; i <sentence2.length() ; i++) {

           for (int j = 0; j <dizi.length(); j++) {

                if(sentence2.charAt(i)==dizi.charAt(j)) {

                    newSentences= newSentences.replaceFirst((""+sentence2.charAt(i)),"");

                }
            }
        }
        System.out.println("newSentences = " + newSentences);



    }
}
