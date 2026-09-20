package zohoProblems;
public class ExcelColumn {
    public static int columnToNumber(String col) {
        int result = 0;
        for (char c : col.toCharArray()) {
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(columnToNumber("AB")); // 28
        System.out.println(columnToNumber("ZY")); // 701
    }
}
