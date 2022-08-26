package Array;

public class ArrayCompare {
    public static void main(String[] args) {
        String[] string1 = {"peace","mercy","grace"};
        String[] string2 = {"peace","mercy","grace"};

        boolean result = arrays(string1,string2);
        System.out.println(result);
    }
    public static boolean arrays(String[] capacity, String[] capacity2) {
//                boolean flag = true;
//        while (flag) {
//            flag = false;
//        }
//            for (String value : capacity) {
//                for (String s : capacity2) {
//                    if (value == s && capacity.length == capacity2.length) {
//                        flag = true;
//                    }else {
//                        return false;
//                    }
//                }
//            }
//            return flag;
//        }
//        return flag;
        int count = 0;
        if (capacity.length == capacity2.length){
            for (int i = 0; i < capacity.length; i++){
                if (capacity[i] == capacity2[i]){
                    count++;
                }else{
                    break;
                }
            }
        }else {
            return false;
        }
        if (count == capacity.length){
            return true;
        }
        else{
            return false;
        }
    }

}
