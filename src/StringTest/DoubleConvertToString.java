package StringTest;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DoubleConvertToString {

    public static void doubleToString(double d){
        String s = Double.toString(d);
        System.out.println(s);
        if(s.equals("20160101")){
            System.out.println("yes!");
        }else {
            System.out.println("no!");
        }
    }

    public static void doubleToString2(double d){
        BigDecimal bd = new BigDecimal(d);
        String s = bd.toString();
        System.out.println(s);
    }

    public static void doubleToString2(float d){
        BigDecimal bd = new BigDecimal(d);
        String s = bd.toString();
        System.out.println(s);
    }

    public static void doubleToString3(double d){
        NumberFormat nf = NumberFormat.getInstance();
        nf.setGroupingUsed(false);
        String format = nf.format(d);
        System.out.println(format);
    }

    public static void doubleToString4(double d){
        DecimalFormat df = new DecimalFormat();
        df.setGroupingUsed(false);
        String format = df.format(d);
        System.out.println(format);
    }

    public static void main(String[] args) {
        doubleToString(20160101);
        doubleToString2(2016012345678901234567890.0);
        doubleToString2(2016012345678901234567890.0);
        doubleToString3(2016012345678901234567890.01);
        doubleToString4(32446976.33);
    }
}