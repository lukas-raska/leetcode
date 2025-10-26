package leetcode.medium.task_2043_simple_bank_system;

public class Bank {

    private final long[] accounts;

    public Bank(long[] balance) {
        this.accounts = balance;
    }

    public boolean transfer(int account1,
                            int account2,
                            long money) {
        if (!isValidAccount(account1) || !isValidAccount(account2)) {
            return false;
        }
        if (money > accounts[account1 - 1]) {
            return false;
        }
        accounts[account1 - 1] -= money;
        accounts[account2 - 1] += money;

        return true;
    }

    public boolean deposit(int account,
                           long money) {
        if (!isValidAccount(account)) {
            return false;
        }
        accounts[account - 1] += money;
        return true;
    }

    public boolean withdraw(int account,
                            long money) {
        if (!isValidAccount(account)) {
            return false;
        }
        if (money > accounts[account - 1]) {
            return false;
        }
        accounts[account - 1] -= money;
        return true;
    }



    private boolean isValidAccount(int account) {
        return account > 0 && account <= accounts.length;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */