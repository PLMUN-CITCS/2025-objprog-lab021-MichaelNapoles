import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args){
        String sentence = getSentenceInput();
        System.out.println("The sentence has " + countWords(sentence) + " words.");
    }

    public static String getSentenceInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String sentence = input.nextLine();

        input.close();

        return sentence;
    }

    public static int countWords(String sentence){
        String[] myArray = sentence.split("\\s+");
        return myArray.length;
    }
}
