package day10;

public class ex3 {
    public static void main(String[] args) {

        /*
        *String ages="Yunus38,Aysel19,Mahmud32,Elif23";
write a program that outputs above string like example:
"Yunus is 38 years old."
"Aysel is 19 years old."
.
.
.
         */

        String ages = "Yunus38,Aysel19,Mahmud32,Elif23";

        String name = "";
        String age = "";

        for (int i = 0; i < ages.length(); i++) {//(activeChar>='a' && activeChar<='z') || (activeChar>='A' && activeChar<='Z')

            char ch = ages.charAt(i);

            if (Character.isAlphabetic(ch))//(activeChar>='0' && activeChar<='9')
                name += ch;

            else if (Character.isDigit(ch)) {
                age += ch;

            }
            if (ch == ',' || i == ages.length() - 1) {
                System.out.println(name + " is " + age + " years old.");
                name = "";  // name ve age i her isim ve yaştan sonra sıfırlamak için
                age = "";
            }
        }
//Second solution

        String[] persons=ages.split(",");
        for (int i = 0; i <persons.length ; i++) {

            String name1 = persons[i].replaceAll("[^a-zA-Z]", "");
            String age1 = persons[i].replaceAll("[^0-9]", "");
            System.out.println(name1 + " is " + age1 + " years old.");
        }
    }
}
