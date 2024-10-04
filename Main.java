import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Morse morse = new Morse();
        Scanner sc = new Scanner(System.in);

        morse.insert(".-", 'A');
        morse.insert("-...", 'B');
        morse.insert("-.-.", 'C');
        morse.insert("-..", 'D');
        morse.insert(".", 'E');
        morse.insert("..-.", 'F');
        morse.insert("--.", 'G');
        morse.insert("....", 'H');
        morse.insert("..", 'I');
        morse.insert(".---", 'J');
        morse.insert("-.-", 'K');
        morse.insert(".-..", 'L');
        morse.insert("--", 'M');
        morse.insert("-.", 'N');
        morse.insert("---", 'O');
        morse.insert(".--.", 'P');
        morse.insert("--.-", 'Q');
        morse.insert(".-.", 'R');
        morse.insert("...", 'S');
        morse.insert("-", 'T');
        morse.insert("..-", 'U');
        morse.insert("...-", 'V');
        morse.insert(".--", 'W');
        morse.insert("-..-", 'X');
        morse.insert("-.--", 'Y');
        morse.insert("--..", 'Z');

        morse.insert(".----", '1');
        morse.insert("..---", '2');
        morse.insert("...--", '3');
        morse.insert("....-", '4');
        morse.insert(".....", '5');
        morse.insert("-....", '6');
        morse.insert("--...", '7');
        morse.insert("---..", '8');
        morse.insert("----.", '9');
        morse.insert("-----", '0');

        while(true){
            System.out.println("digite uma frase usando CODIGO MORSE (digite FIM para encerrar): ");
            String frase = sc.nextLine();

            if(frase.equals("FIM")){
                break;
            }

            String fraseNormal = morse.decodeFrase(frase);
            System.out.println("Traducao: " + fraseNormal);
        }
    }
    
}