public class Ten {

    public static String getTen(String ten) {
        String result = "";


        if (ten.length() <= 1) {
            result = First.getFirst(ten);
//ถ้าหลักสิบเท่า0
        }else if ( Integer.parseInt(String.valueOf(ten.charAt(0)))==0) {
            String subStr = String.valueOf(ten.charAt(1));
            result = First.getFirst(subStr);
//ถ้าหลักสิบเท่า1
        }  else if (Integer.parseInt(String.valueOf(ten.charAt(0))) == 1 && Integer.parseInt(String.valueOf(ten.charAt(1))) != 0 ) {
            result = "ສິບ"+First.getFirst(ten);
//ถ้าเท่า10
        } else if (Integer.parseInt(String.valueOf(ten.charAt(0))) == 1 && Integer.parseInt(String.valueOf(ten.charAt(1))) == 0 ) {
            result = "ສິບ";

//ถ้าหลักสิบเท่า 2-9
        }  else {
            switch (Integer.parseInt(String.valueOf(ten.charAt(ten.length() - 2)))) {
                case 2:
                    result = "ຊາວ";
                    break;
                case 3:
                    result = "ສາມສິບ";
                    break;
                case 4:
                    result = "ສີ່ສິບ";
                    break;
                case 5:
                    result = "ຫ້າສິບ";
                    break;
                case 6:
                    result = "ຫົກສິບ";
                    break;
                case 7:
                    result = "ເຈັດສິບ";
                    break;
                case 8:
                    result = "ແປດສິບ";
                    break;
                case 9:
                    result = "ເກົ້າສິບ";
                    break;

            }
            result = result+First.getFirst(ten);

        }
        return result;
    }}

