package static1;

public class Data3 {
    public String name;
    public static int count; // static 공용변수

    public Data3(String name) {
        this.name = name;
        count++; // Data3.count++;
    }
}
