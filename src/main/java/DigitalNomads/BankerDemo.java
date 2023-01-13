package DigitalNomads;

public class BankerDemo {
    public static void main(String[] args) throws Exception {

        DemirBank MarsDemirAccount = new DemirBank(123456789123L,123456789);
        System.out.println(MarsDemirAccount.getBalance());
        MarsDemirAccount.deposit(100);
        System.out.println(MarsDemirAccount.getBalance());

       DemirBank NursDemirAccount = new DemirBank(987654321987L,123456789);
        NursDemirAccount.deposit(200);
       System.out.println(NursDemirAccount.getBalance());

        Bank.transferFunds(NursDemirAccount,MarsDemirAccount,100);
        System.out.println(MarsDemirAccount.getBalance());
        System.out.println(NursDemirAccount.getBalance());

        KCIB SumiKCIBAccount = new KCIB(234567891234L,123456789L);
        SumiKCIBAccount.deposit(900);
        System.out.println(SumiKCIBAccount.getBalance());
        Bank.transferFunds(SumiKCIBAccount,NursDemirAccount,700);
        System.out.println(NursDemirAccount.getBalance());

        Kyrgyzstan RayaKyrgyzstanAccount = new Kyrgyzstan(345678912345L,987654321);
    }
}
