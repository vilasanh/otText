public class Thousand {
    public static String getThousand(String thousand){
        String result = "";
        //ກວດຄ່າທີ່ຮັບເຂົ້າມາມີຈຳນວນນ້ອຍກວ່າຫລືເທົ່າກັບ3ບໍ
        if(thousand.length()<=3){
            result = Hundreds.getHundreds(thousand);
        }else if (Integer.parseInt(String.valueOf(thousand.charAt(0)))== 0) {
            String subSting = thousand.substring(1);
            result = Hundreds.getHundreds(subSting);

        }else{
            String subStr = thousand.substring(1);
            result = First.getFirst(String.valueOf(thousand.charAt(0)))+"ພັນ"+Hundreds.getHundreds(subStr);
        }
        return result;
    }
}
