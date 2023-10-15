public class Subject implements Comparable<Subject>{
    private String code, name, examForm;

    public Subject(String code, String name, String examForm){
        this.code = code;
        this.name = name;
        this.examForm = examForm;
    }

    @Override
    public String toString(){
        return code + " " + name + " " + examForm;
    }
    
    @Override
    public int compareTo(Subject other){
        return this.code.compareTo(other.code);
    }
}