import com.sun.deploy.util.StringUtils;

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


            char[] characters = textFromFileLowChars.toCharArray();
            Arrays.sort(characters);

            int count = 0;

            for(int i = 0; i< characters.length; i++){
                count = 1;
                for(int j=i+1;j< characters.length;j++){
                    if(characters[i] == (characters[j])){
                        count = count + 1;
                        characters[j]='0';
                    }
                }
                if(characters[i]!='0'){
                    System.out.println(characters[i]+"' repeated "+count+ " time(s)");
                }
            }


        }
    }


