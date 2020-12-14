public class TenMillion {
    public static String getTenMillion(String tenMillion){
        String result="";
        if(tenMillion.length()<=7){
            result = Million.getMillion(tenMillion);
        }else if (Integer.parseInt(String.valueOf(tenMillion.charAt(0)))== 0) {
            String subSting = tenMillion.substring(1);
            result =  Million.getMillion(subSting);
        }else{
            String subStr = tenMillion.substring(2);
            result = Ten.getTen(tenMillion.substring(0,2))+"ລ້ານ"+HundredThousand.getHundredThousand(subStr);
        }
        return  result;

    }
}
