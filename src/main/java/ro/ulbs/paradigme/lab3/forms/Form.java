package ro.ulbs.paradigme.lab3.forms;

public class Form {

    public static int counter;
    private String color;

    public Form() {
        color = "white";
    }

    public Form(String color) {
        this.color = color;
        counter++;
    }

    public float getArea() {
        return 0;
    }

    public String toString() {
        return "This form has the color "+color;
    }

    static public int getCounter(){
        return counter;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Form) {
            Form f = (Form) obj;
            if (this.color == null && f.color == null) {
                return true;
            }
            else if (this.color != null && f.color != null && this.color.compareTo(f.color) == 0) {
                return true;
            }
        }
        return false;
    }
}
