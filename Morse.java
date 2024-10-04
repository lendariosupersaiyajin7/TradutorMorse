public class Morse {
    Node raiz;

    public Morse() {
        this.raiz = null;
    }

    

    public void insert(String morse, char letra) {
        raiz = insertRec(raiz, morse, letra, 0);
    }

    public Node insertRec(Node raiz, String morse, char letra, int pos) {
        if(raiz == null) {
            raiz = new Node();
        }

        if(pos == morse.length()){
            raiz.letra = letra;
            return raiz;
        }

        if(morse.charAt(pos) == '.'){
            raiz.esquerda = insertRec(raiz.esquerda, morse, letra, pos + 1);
        } else if(morse.charAt(pos) == '-'){
            raiz.direita = insertRec(raiz.direita, morse, letra, pos + 1);
        }

        return raiz; 
    }



    public char decode(String morse) {
        return decodeRec(raiz, morse, 0);
    }

    public char decodeRec(Node raiz, String morse, int pos) {
        if(raiz == null){
            return '\0';
        }

        if(pos == morse.length()){
            return raiz.letra;
        }

        if(morse.charAt(pos) == '.'){
            return decodeRec(raiz.esquerda, morse, pos + 1);
        } else if(morse.charAt(pos) == '-'){
            return decodeRec(raiz.direita, morse, pos +1);
        }

        return '?';
    }

    public String decodeFrase(String frase) {
        StringBuilder fraseDecodificada = new StringBuilder();
        String[] morse = frase.split(" / ");

        for(String palavra : morse){
            String[] letras = palavra.split(" ");

            for(String letra : letras){
                fraseDecodificada.append(decode(letra));
            }

            fraseDecodificada.append(" ");
        }

        return fraseDecodificada.toString().trim();        
    }
}