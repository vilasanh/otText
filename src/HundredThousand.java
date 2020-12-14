public class HundredThousand {
    public static String getHundredThousand(String hundredThousand){
        String result = "";
        if (hundredThousand.length()<=5){
            result = TenThousand.getTenThousand(hundredThousand);
        }else if (Integer.parseInt(String.valueOf(hundredThousand.charAt(0)))== 0) {
            String subSting = hundredThousand.substring(1);
            result =  HundredThousand.getHundredThousand(subSting);
        }else{
            String subStr = hundredThousand.substring(1);
            result = First.getFirst(String.valueOf(hundredThousand.charAt(0)))+"ແສນ"+TenThousand.getTenThousand(subStr);
        }
        return  result;
    }
}
