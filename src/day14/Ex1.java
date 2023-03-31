package day14;

public class Ex1 {
    public static void main(String[] args) {


        //*change all consonant letters to c and
//all vowel letters to v in a string which contains only letters.

        String text = "jfnşs aower vmfkou awefaefrfomv";

        String vowels = "aeiouAEOUI";

        String consonants = "";

        String newText = "";

        String ch="";

        for (char i = 'a'; i <= 'z'; i++) {

            if(!vowels.contains(""+i))
            consonants += i;
        }

        for (int i = 0; i < text.length(); i++) {

            ch = "" + text.charAt(i);

            if (vowels.contains(ch))
                newText=newText.replace(ch, "v");


            if (consonants.contains(ch))
               newText=newText.replace(ch, "c");


        }
        System.out.println(newText);

        System.out.println((text.replaceAll("[^aeuıoAEUIO,.!? ]","c")).replaceAll("[aeuıoAEUIO]","v")
                );


    }
}
