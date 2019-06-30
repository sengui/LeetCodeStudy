package org.data.stack.easy;

import java.util.Stack;

public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
        System.out.println(excelSheetColumnTitle.convertToTitle(27));
    }

    private static final String[] sheetNameStrs = new String[]{ "A", "B", "C", "D", "E", "F", "G", "H", "I", "J","K", "L", "M", "N", "O", "P", "Q",
                                                        "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public String convertToTitle(int n) {
        Stack<Integer> nameNumStack = new Stack<>();

        while (n > 26){
            if(n%26 == 0){
                nameNumStack.push(26);
                n = n / 26 - 1;

            }else{
                nameNumStack.push(n%26);
                n /= 26;
            }
        }
        nameNumStack.push(n);

        StringBuilder result = new StringBuilder();
        while (!nameNumStack.empty()) {
            result.append(sheetNameStrs[nameNumStack.pop()-1]);
        }
        return result.toString();
    }


}
