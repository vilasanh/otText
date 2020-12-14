public class Hundreds {
    public static String getHundreds(String s){
        String result = "";
        //ถ้าจำนวนข้อความน้อยกว่าหรืเท่า 2 ให้ส่งค่าไปTen
       if (s.length()<=2){
            result = Ten.getTen(s);
            //หลักร้อยเท่า0 ຕັດເອົາແຕ່ເລກ2ຫລັກ
        }else if (Integer.parseInt(String.valueOf(s.charAt(s.length() - 3))) == 0) {
            String subSting = s.substring(1);
            result = Ten.getTen(subSting);

        }else {
            String subStr = s.substring(1);
            result = First.getFirst(String.valueOf(s.charAt(s.length() - 3)))+"ຮ້ອຍ"+Ten.getTen(subStr);
        }
        return result;
    }
}
