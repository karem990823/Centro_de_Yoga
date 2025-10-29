# ACTIVIDAD 3
public class YogaClass {
    // Atributos
    String className;
    String instructor;
    int capacity;
    
    // Constructor
    public YogaClass(String className, String instructor, int capacity) {
        this.className = className;
        this.instructor = instructor;
        this.capacity = capacity;
    }
    
    // Método para mostrar información
    public void showInfo() {
        System.out.println("Clase: " + className);
        System.out.println("Instructor: " + instructor);
        System.out.println("Cupo: " + capacity + " personas");
    }
}
