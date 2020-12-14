public class First {
    public static String getFirst(String a){
        String text="";

if (a.length()==2 ){
    switch (Integer.parseInt(String.valueOf(a.charAt(1)))){
        case 1 :
            text = "ເອັດ";
            break;
        case 2 :
            text = "ສອງ";
            break;
        case 3 :
            text =  "ສາມ";
            break;
        case 4 :
            text = "ສີ";
            break;
        case 5 :
            text = "ຫ້າ";
            break;
        case 6 :
            text =  "ຫົກ";
            break;
        case 7 :
            text = "ເຈັດ";
            break;
        case 8 :
            text = "ແປດ";
            break;
        case 9 :
            text =  "ເກົ້າ";
            break;
        case 0:
            text = "";
            break;
    }


}else if (a.length()==1){
    switch (Integer.parseInt(a)){
        case 1 :
            text = "ຫນຶ່ງ";
            break;
        case 2 :
            text = "ສອງ";
            break;
        case 3 :
            text =  "ສາມ";
            break;
        case 4 :
            text = "ສີ";
            break;
        case 5 :
            text = "ຫ້າ";
            break;
        case 6 :
            text =  "ຫົກ";
            break;
        case 7 :
            text = "ເຈັດ";
            break;
        case 8 :
            text = "ແປດ";
            break;
        case 9 :
            text =  "ເກົ້າ";
            break;
        case 0:
            text = "";
            break;
            }
        }
        return text;
}}
