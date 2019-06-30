package org.data.stack.easy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class ExcelSheetColumnNumber {

    public static void main(String[] args) {
        ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
        System.out.println(excelSheetColumnNumber.titleToNumber("ZY"));
    }

    public int titleToNumber(String s) {

        int num = 0;
        for (int i = 0; i < s.length() ; i++) {
            num = num * 26 + (s.charAt(i) - 'A') + 1;
        }
        return num;
    }

}
