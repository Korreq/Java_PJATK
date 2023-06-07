package Project;

import java.util.ArrayList;
import java.util.Comparator;

public class SearchEngine {
    ArrayList<ArrayList<String>> dimensionalList;
    SearchEngine(ArrayList<ArrayList<String>> dimensionalList){ this.dimensionalList = dimensionalList; }
    public ArrayList<ArrayList<String>> search(String keyword){
        ArrayList<ArrayList<String>> resultList = new ArrayList<>(); boolean match;
        for(ArrayList<String> strings : dimensionalList){
            match = false;
            for(String line : strings){ if(line.toLowerCase().contains(keyword.toLowerCase())){ match = true; break; } }
            if(match){ resultList.add( strings ); }
            if(resultList.size() > 9){ break; }
        }
        resultList.sort(Comparator.comparing(o -> o.get(0)));
        return resultList;
    }
}