package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void validateEmptyConstructor() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void validateConstructorWithAmount() {
        Account account = new Account(1234);
        assertThat(account.balance()).isEqualTo(1234);
    }

    @Test
    public void newAccountShouldHaveZeroBalance() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void depositAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(10);
        assertThat(account.balance()).isEqualTo(10);
    }

    @Test
    public void depositMultipleAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(10);
        account.deposit(20);
        assertThat(account.balance()).isEqualTo(30);
    }

    @Test
    public void withdrawAmountToDecreaseTheBalance() {
        Account account = new Account();
        account.withdraw(20);
        assertThat(account.balance()).isEqualTo(-20);
    }

    @Test
    public void withdrawMultipleAmountToDecreaseTheBalance() {
        Account account = new Account();
        account.withdraw(10);
        account.withdraw(20);
        assertThat(account.balance()).isEqualTo(-30);
    }

    @Test
    public void transferMoneyBetweenAccounts() {
        Account account_deposit = new Account(200);
        Account account_withdraw = new Account(500);

        account_withdraw.transfer(account_deposit, 50);

        assertThat(account_deposit.balance()).isEqualTo(250);
        assertThat(account_withdraw.balance()).isEqualTo(450);
    }
}
