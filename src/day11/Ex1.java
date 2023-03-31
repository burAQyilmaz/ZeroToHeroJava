package day11;

public class Ex1 {
    public static void main(String[] args) {

        //*Set a given sentence with writing only unique letters

        String sentence = "kdjacbka lkaffnva kavnaks";

        String result = "";

        for (int j = 0; j < sentence.length(); j++) {

            int counter = 0;

            char ch = sentence.charAt(j);

            for (int i = 0; i < sentence.length(); i++) {

                if (ch == sentence.charAt(i))
                    counter++;
            }
            if (counter == 1)
                result += ch;

        }
        System.out.println(result);

        //second sol:

        for (int i = 0; i < sentence.length(); i++) {

            char ch1 = sentence.charAt(i);

            if (sentence.indexOf(ch1) == sentence.lastIndexOf(ch1)) System.out.print(ch1);
        }
    }
}
