import java.util.HashMap;
import java.util.Map;

public class Encryption {
    private static Map<Character, Integer> k = initializeK();

    public static String encrypt(String input, String key){
        if(input.length() != key.length()){
            System.out.println("Os textos de entrada e a chave, devem ser do mesmo tamanho!!");
            return null;
        } 

        StringBuilder strb = new StringBuilder();

        for(int i=0; i<input.length(); i++){
            int charNumber = k.get(input.charAt(i)) + k.get(key.charAt(i));

            if(charNumber > 25) charNumber -= 26;

            for(Map.Entry<Character, Integer> entry : k.entrySet()){
                if(entry.getValue().equals(charNumber))
                    strb.append(entry.getKey());
            }
        }
        
        return strb.toString();
    }

    public static String decrypt(String input, String key){
        if(input.length() != key.length()){
            System.out.println("Os textos de entrada e a chave, devem ser do mesmo tamanho!!");
            return null;
        } 

        StringBuilder strb = new StringBuilder();

        for(int i=0; i<input.length(); i++){
            int charNumber = k.get(input.charAt(i)) - k.get(key.charAt(i));

            if(charNumber < 0) charNumber += 26;

            for(Map.Entry<Character, Integer> entry : k.entrySet()){
                if(entry.getValue().equals(charNumber))
                    strb.append(entry.getKey());
            }
        }
        
        return strb.toString();
    }

    private static Map<Character, Integer> initializeK(){
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('b', 1);
        map.put('c', 2);
        map.put('d', 3);
        map.put('e', 4);
        map.put('f', 5);
        map.put('g', 6);
        map.put('h', 7);
        map.put('i', 8);
        map.put('j', 9);
        map.put('k', 10);
        map.put('l', 11);
        map.put('m', 12);
        map.put('n', 13);
        map.put('o', 14);
        map.put('p', 15);
        map.put('q', 16);
        map.put('r', 17);
        map.put('s', 18);
        map.put('t', 19);
        map.put('u', 20);
        map.put('v', 21);
        map.put('w', 22);
        map.put('x', 23);
        map.put('y', 24);
        map.put('z', 25);

        return map;
    }
}