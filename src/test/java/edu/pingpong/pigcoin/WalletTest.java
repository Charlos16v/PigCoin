package edu.pingpong.pigcoin;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class WalletTest {


    Wallet wallet = null;

    @Before
    public void setupWallet() {
        wallet = new Wallet();
        wallet.generateKeyPair();
    }

    @Test
    public void constructorTest() {
        assertNotNull(wallet);
    }

    @Test
    public void generateKeyPairTest() {
        assertNotNull(wallet.getSKey());
        assertNotNull(wallet.getAddress());
    }
}
