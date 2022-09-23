package Deitel.chapter_14;

public class StringBuilderAppend {


    public static void main(String[] args) {
        Object objectRef = "hello";
         String string = "goodbye";
         char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
         boolean booleanValue = true;
         char characterValue = 'Z';
         int integerValue = 7;
         long longValue = 10000000000L;
         float floatValue = 2.5f;
         double doubleValue = 33.333;
       StringBuilder lastBuffer = new StringBuilder("last buffer");

         StringBuilder buffer = new StringBuilder();
         buffer.append(objectRef);
         buffer.append(System.getProperty("line.separator"));
         buffer.append(string);
         buffer.append(System.getProperty("line.separator"));
        buffer.append(charArray);
       buffer.append(System.getProperty("line.separator"));
        buffer.append(booleanValue);
       buffer.append(System.getProperty("line.separator"));
        buffer.append(characterValue);
        buffer.append(System.getProperty("line.separator"));
        buffer.append(integerValue);
        buffer.append(System.getProperty("line.separator"));
        buffer.append(longValue);
        buffer.append(System.getProperty("line.separator"));
        buffer.append(floatValue);
        buffer.append(System.getProperty("line.separator"));
        buffer.append(doubleValue);
        buffer.append(System.getProperty("line.separator"));
        buffer.append(lastBuffer);
        buffer.append(System.getProperty("line.separator"));
        System.out.println(buffer.toString());
    }


}
