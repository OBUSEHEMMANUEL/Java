package StringBuilder;

public class StringBuilder {
   private final StringBuilder stringBuilder = new StringBuilder();
    public StringBuilder append(String str){

      return   stringBuilder.append(str);
    }
    public StringBuilder delete(int start, int end){
       return stringBuilder.delete(start,end);
    }
    public StringBuilder insert(int offset, String str){
       return stringBuilder.insert(offset,str);
    }
    public StringBuilder replace(int start,int end, String str){
        return stringBuilder.replace(start,end,str);
    }
    public StringBuilder reverse(){
        return stringBuilder.reverse();
    }


}
