import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SortingText {

        public static void main(String[] args) throws FileNotFoundException {

            File file = new File("C:\\Users\\Asus\\Documents\\HeadJava\\src\\main\\java\\RandomText.txt");
            Scanner scan = new Scanner(file);

            String textFromFile = scan.nextLine();
            String textFromFileLowChars = textFromFile.toLowerCase();


            String[] word = textFromFileLowChars.split("\\s+");
            Arrays.sort(word);

            int count = 0;

            for(int i = 0; i< word.length; i++){
                count = 1;
                for(int j=i+1;j< word.length;j++){
                    if(word[i].equals(word[j])){
                        count = count + 1;
                        word[j]="0";
                    }
                }
                if(word[i]!="0"){
                    System.out.println(word[i]+"' repeated "+count+ " time(s)");
                }
            }


        }
    }


