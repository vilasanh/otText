public class Million {
    public static String getMillion(String million){
        String result="";
        if(million.length()<=6){
            result = HundredThousand.getHundredThousand(million);
        }else if (Integer.parseInt(String.valueOf(million.charAt(0)))== 0) {
        String subSting = million.substring(1);
        result =  HundredThousand.getHundredThousand(subSting);
    }else{
        String subStr = million.substring(1);
        result = First.getFirst(String.valueOf(million.charAt(0)))+"ລ້ານ"+HundredThousand.getHundredThousand(subStr);
    }
        return  result;
    }
}
