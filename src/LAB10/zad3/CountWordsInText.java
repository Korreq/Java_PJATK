package LAB10.zad3;

import java.util.*;

public class CountWordsInText {
    private String text;
    CountWordsInText(String text){ this.text = text; }
    public Map<String, Integer> countWordsInText(){
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(text.split(" ")));
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < arrayList.size(); i++){
            map.putIfAbsent(arrayList.get(i), Collections.frequency(arrayList, arrayList.get(i)));
        }
        return map;
    }

}
