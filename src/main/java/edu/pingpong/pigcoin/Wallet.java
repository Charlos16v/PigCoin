package edu.pingpong.pigcoin;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Wallet {


    private PublicKey address = null;
    private PrivateKey sKey = null;
    private final double total_input = 0d;
    private final double total_output = 0d;
    private final double balance = 0d;

    public Wallet() {
    }

    public void setSK(PrivateKey sKey) {
        this.sKey = sKey;
    }

    public void setAddress(PublicKey address) {
        this.address = address;
    }

    public PublicKey getAddress() {
        return this.address;
    }

    public PrivateKey getSKey() {
        return this.sKey;
    }

    public void generateKeyPair() {
        KeyPair pair = GenSig.generateKeyPair();
        assert pair != null;
        setSK(pair.getPrivate());
        setAddress(pair.getPublic());
    }

    @Override
    public String toString() {
        return "Wallet: " + getAddress().hashCode() + '\n' +
                "Total input: " + this.total_input + '\n' +
                "Total output: " + this.total_output + '\n' +
                "Balance: " + this.balance + '\n';
    }
}
