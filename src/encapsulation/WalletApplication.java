package encapsulation;

public class WalletApplication {

    public static void main(String[] args) {
        Wallet wallet = new Wallet("Example Owner");
        wallet.deposit(50000);
        wallet.withdraw(1500);

        System.out.println();
        wallet.freezeWallet();

        System.out.println();
        wallet.withdraw(300);
        wallet.activateWallet();
        wallet.withdraw(500);
    }
}
