package leetcode.medium.task_2241_design_an_ATM_machine;

public class ATM {

    private final int[] bankNotesCount;

    public ATM() {
        this.bankNotesCount = new int[5];
    }

    public void deposit(int[] banknotesCount) {
        for (int i = 0; i < banknotesCount.length; i++) {
            this.bankNotesCount[i] += banknotesCount[i];
        }
    }

    public int[] withdraw(int amount) {
        int remaining = amount;
        int[] used = new int[5];
        for (int i = bankNotesCount.length - 1; i >= 0; i--) {
            if (remaining == 0){
                break;
            }
            int nominal = getNominal(i);
            if (remaining < nominal) {
                continue;
            }
            int possibleToUse = remaining / nominal;
            int reallyUsed = Math.min(possibleToUse, bankNotesCount[i]);
            remaining -= (reallyUsed * nominal);
            used[i] = reallyUsed;
        }
        if (remaining != 0) {
            return new int[]{-1};
        }
        for (int i = 0; i < bankNotesCount.length; i++) {
            this.bankNotesCount[i] -= used[i];
        }

        return used;
    }

    private int getNominal(int index) {
        return switch (index) {
            case 0 -> 20;
            case 1 -> 50;
            case 2 -> 100;
            case 3 -> 200;
            case 4 -> 500;
            default -> throw new IllegalArgumentException("Unknown index: " + index);
        };
    }
}
