public class TenThousand {
    public static String getTenThousand(String tenThousand){
        String result = "";
        if(tenThousand.length()<=4){
            result = Thousand.getThousand(tenThousand);

        }else if (Integer.parseInt(String.valueOf(tenThousand.charAt(0)))== 0) {
            String subSting = tenThousand.substring(1);
            result = Thousand.getThousand(subSting);

        }else{
            String subStr = tenThousand.substring(1);
            result = First.getFirst(String.valueOf(tenThousand.charAt(0)))+"ຫມື່ນ"+Thousand.getThousand(subStr);
        }
        return result;
    }
}
