package com.salesforce;

import org.assertj.core.api.ThrowableAssert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class WalletTest {
    //ZOMBIES
    //Zero
    //One
    //Many
    //Boundary
    //Interface
    //Exception
    //(Simple)

    @Test
    public void testWalletIsEmpty() {
        Wallet wallet = new Wallet();
        assertThat(wallet.isEmpty()).isTrue();
    }

    @Test
    public void testAddFundsOf1Dollar() {
        Wallet wallet = new Wallet();
        wallet.addMoney(1);
        assertThat(wallet.isEmpty()).isFalse();
    }

    @Test
    public void testAddMoneyAndThenRemoveTheSameAmountShouldBeEmpty() {
        Wallet wallet = new Wallet();
        wallet.addMoney(1);
        wallet.removeMoney(1);
        assertThat(wallet.isEmpty()).isTrue();
    }

    @Test
    public void testThatICannotAddANegativeAmountToMyWallet() {
        Wallet wallet = new Wallet();
        assertThatThrownBy(() -> wallet.addMoney(-10))
            .isInstanceOf(IllegalArgumentException.class);
    }
}
