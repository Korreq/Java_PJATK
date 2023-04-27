package LAB8.zad8;

public class Student implements Comparable<Student>{
    private String name, surname, index = "s00000", firstCharIndex;
    private int numberedIndex;
    Student(String name, String surname, String index){
        this.name = name; this.surname = surname; this.index = index;
        numberedIndex =  Integer.valueOf(index.substring(1));
        firstCharIndex = String.valueOf(index.charAt(0));
    }
    public int compareTo(Student student){
        if( this.firstCharIndex.compareTo(student.firstCharIndex) != 0 ){
            return this.firstCharIndex.compareTo(student.firstCharIndex);
        }
        else{ return this.numberedIndex - student.numberedIndex; }
    }
    @Override
    public String toString(){
        return index+" "+name+" "+surname;
    }
}
