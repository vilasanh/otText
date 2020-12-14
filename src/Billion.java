public class Billion {
    public static String getBillion(String billion) {
        String result = "";

            if(billion.length()>10){
                result = "Don't insert number more then ten digits !";

            }else if(billion.length()<=9){
                result = HundredMillion.getHundredMillion(billion);
            }else if (Integer.parseInt(String.valueOf(billion.charAt(0)))== 0) {
                String subSting = billion.substring(1);
                result =  HundredMillion.getHundredMillion(subSting);
            }else{
                String subStr = billion.substring(1);
                result = First.getFirst(String.valueOf(billion.charAt(0)))+"ຕື້"+HundredMillion.getHundredMillion(subStr);
            }
            return result;
    }
}
