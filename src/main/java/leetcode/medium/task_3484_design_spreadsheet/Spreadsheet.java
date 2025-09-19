package leetcode.medium.task_3484_design_spreadsheet;

public class Spreadsheet {
    private static final char FIRST_COL = 'A';
    private static final char LAST_COL = 'Z';
    private final int[][] table;

    public Spreadsheet(int rows) {
        int cols = LAST_COL - FIRST_COL + 1;
        this.table = new int[rows][cols];
    }

    public void setCell(String cell,
                        int value) {
        int col = cell.charAt(0) - FIRST_COL;
        int row = Integer.parseInt(cell.substring(1)) - 1;
        this.table[row][col] = value;
    }

    public void resetCell(String cell) {
        setCell(cell, 0);
    }

    public int getValue(String formula) {
        String[] elements = formula.substring(1).split("\\+");
        int value = 0;
        for (String e : elements) {
            int eVal = 0;
            if (Character.isLetter(e.charAt(0))) {
                int row = Integer.parseInt(e.substring(1)) - 1;
                int col = e.charAt(0) - FIRST_COL;
                eVal = this.table[row][col];
            } else {
                eVal = Integer.parseInt(e);
            }
            value += eVal;
        }
        return value;
    }

}
