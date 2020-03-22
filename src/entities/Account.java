package entities;

public class Account {

        private Integer number;
        private String holder;
        private Double balance;

        public Account() {

        }

        public Account(Integer number, String holder) {
            this.number = number;
            this.holder = holder;
            this.balance = 0d;
        }

        public Account(Integer number, String holder, Double initialDeposit) {
            this.number = number;
            this.holder = holder;
            this.balance = 0d;
            deposit(initialDeposit);
        }


        public void setHolder(String holder) {
            this.holder = holder;
        }


        public Double getBalance() {
            return balance;
        }

        public String getHolder(){
            return holder;
        }

        public Integer getNumber() {
            return number;
        }

        public void deposit(Double amount){
            this.balance = this.balance + amount;
        }
        public void withdraw(Double amount){
            System.out.println("Balance: " + this.balance);
            System.out.println("Qtde:" + amount );
            this.balance = this.balance - amount + 5d;


        }

        @Override
        public String toString() {
            return "entities.Account{" +
                    "number=" + number +
                    ", holder=" + holder +
                    ", balance=" + balance +
                    '}';
        }


}
