package arrayPractise;

public class ArrayCompare {
    public static void main(String[] args) {

    }
    public static boolean arrays(String[] capacity,String [] capacity2){
        if (capacity.length != capacity2.length){
            return false;
        }
        for (int i = 0; i < capacity.length; i++) {
if (capacity[i] != capacity2[i]){
    return false;
}
        }
        return true;
    }
}
