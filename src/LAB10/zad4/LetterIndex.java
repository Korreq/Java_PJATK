package LAB10.zad4;

import java.util.*;

public class LetterIndex {
    private String text;
    LetterIndex(String text){ this.text = text; }
    public Map<String, Set<Integer>> letterIndex(){
        String[] splited = text.split("");
        System.out.println(Arrays.toString(splited));
        Map<String, Set<Integer>> setMap = new HashMap<>();
        for(int i = 0; i < splited.length; i++){
            Set<Integer> integerSet = setMap.computeIfAbsent(splited[i], k -> new HashSet<>());
            integerSet.add(i);
        }
        return setMap;
    }


}
