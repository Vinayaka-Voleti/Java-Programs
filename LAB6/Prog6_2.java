
class Bank {
    public int getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    public int getInterestRate() {
        return 7;
    }
}

class ICICI extends Bank {
    @Override
    public int getInterestRate() {
        return 8;
    }
}
public class Prog6_2 {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        
        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");
    }
}
