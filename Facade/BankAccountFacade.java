public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    AccountNumberCheck acctChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundCheker;

    WelcomeToBank bankWelcome;

    public BankAccountFacade(int newAcctNum, int newSecCode) {

        accountNumber = newAcctNum;
        securityCode = newSecCode;

        bankWelcome = new WelcomeToBank();
        acctChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundCheker = new FundsCheck();

    }

    public int getAccountNumber() { return accountNumber; }

    public int getSecurityCode() { return securityCode; }

    public void withdrawCash(double cashToGet) {

        if(acctChecker.accountActive(getAccountNumber()) &&
        codeChecker.isCodeCorrect(getSecurityCode()) &&
                fundCheker.haveEnoughMoney(cashToGet)) {

            System.out.println("Transaction Complete\n");

        } else {

            System.out.println("Transaction Failed\n");

        }
    }

    public void depositCash(double cashToDeposit) {

        if(acctChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode())) {

            fundCheker.makeDeposit(cashToDeposit);

            System.out.println("Transaction Complete\n");

        } else {

            System.out.println("Transaction Failed\n");

        }
    }

}
