package LAB10.zad1;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesInList{
    public static <E> void showDuplicates(List<E> list){
        List<E> records = new ArrayList<>();
        for (E record : list ){
            if(list.indexOf(record) != list.lastIndexOf(record)){
                if(!records.contains(record)){ records.add(record); }
            }
        }
        System.out.println(records);
    }
    public static <E> void deleteDuplicates(List<E> list){
        for(int i = 0; i < list.size(); i++){
            while(i != list.lastIndexOf(list.get(i))){
                list.remove(list.lastIndexOf(list.get(i)));
            }
        }
    }
}
