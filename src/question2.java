////find the question script at CSE110 Spring-24 Questions.pdf file of this repository
public class question2 {
    public static void main(String[] args) {
        String word = "SaharaDesert";
        String new_Word = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int ascii = (int)ch;
            int convert = 0;
            char ch2 ='-';
            if(ascii>=97 && ascii<=99){
                convert = ascii+23;
                ch2=(char)convert;
                new_Word+=ch2;
            }
            else if (ascii>=100 && ascii<=122) {
                convert = ascii-3;
                ch2=(char)convert;
                new_Word+=ch2;
            }
            else {
                new_Word+=ch;
            }
        }
        System.out.println(new_Word);   //output : SxexoxDbpboq
    }
}

