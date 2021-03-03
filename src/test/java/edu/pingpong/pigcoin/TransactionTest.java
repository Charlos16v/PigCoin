package edu.pingpong.pigcoin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TransactionTest {

    Transaction transaction = null;
    Wallet wallet_1 = null;
    Wallet wallet_2 = null;

    @Before
    public void setupTransaction() {
        wallet_1 = new Wallet();
        wallet_2 = new Wallet();
        transaction = new Transaction();
        transaction = new Transaction("hash_1", "0", wallet_1.getAddress()
                , wallet_2.getAddress(), 20, "a flying pig!");
    }

    @Test
    public void constructorTest() {
        assertNotNull(transaction);
    }
}
