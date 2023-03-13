package gt.edu.umg.progra3.parcial1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DinamicStructuresManager <T> {

    List<T> values = new ArrayList<>();

    public DinamicStructuresManager(List<T> values) {
        this.values = values;
    }

    public List<T> ordenar(){

        // Define a custom comparator that compares the objects based on multiple criteria
        Comparator<T> comparator = new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                // First, compare the objects by alphabetical order in descending order
                if (o1 instanceof String && o2 instanceof String) {
                    String s2 = (String) o1;
                    String s1 = (String) o2;
                    return s2.compareTo(s1);
                }
                // If the objects are not strings, compare them by numerical order in ascending order
                else if (o1 instanceof Integer && o2 instanceof Integer) {
                    Integer i1 = (Integer) o1;
                    Integer i2 = (Integer) o2;
                    return i1.compareTo(i2);
                }
                // If the objects are not strings or integers, compare them based on their string representation
                else {
                    String s1 = o1.toString();
                    String s2 = o2.toString();
                    return s1.compareTo(s2);
                }
            }
        };

        // Sort the list of objects using the custom comparator
        Collections.sort(values, comparator);

        // Return the sorted list
        return values;
    }

    public List<T> ordenarInversa(){
        //inserte codigo aqui
        Collections.sort(values, Collections.reverseOrder());
        return values;
    }
}
