public class HundredMillion {
    public  static String getHundredMillion(String hundredMillion){
        String result = "";
        if(hundredMillion.length()<=8){
            result = TenMillion.getTenMillion(hundredMillion);
        }else if (Integer.parseInt(String.valueOf(hundredMillion.charAt(0)))== 0) {
            String subSting = hundredMillion.substring(1);
            result =  TenMillion.getTenMillion(subSting);
        }else{
            String subStr = hundredMillion.substring(3);
            result = Hundreds.getHundreds(hundredMillion.substring(0,3))+"ລ້ານ"+HundredThousand.getHundredThousand(subStr);
        }
        return result;
    }
}
