package edu.pingpong.pigcoin;

import java.security.PrivateKey;
import java.security.PublicKey;

public class Transaction {


    private String hash = "";
    private String prev_hash = "";
    private PublicKey pKey_sender = null;
    private PublicKey pKey_recipient = null;
    private double pigcoins = 0d;
    private String message = "";

    public Transaction() {
    }

    public Transaction(String hash, String prev_hash, PublicKey pKey_sender,
                       PublicKey pKey_recipient, double pigcoins, String message) {
        this.hash = hash;
        this.prev_hash = prev_hash;
        this.pKey_sender = pKey_sender;
        this.pKey_recipient = pKey_recipient;
        this.pigcoins = pigcoins;
        this.message = message;
    }

    private PublicKey get_PK_sender() {
        return this.pKey_sender;
    }

    private PublicKey get_PK_recipient() {
        return this.pKey_recipient;
    }

    public double getPigCoins() {
        return this.pigcoins;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return "Hash: "+ this.hash + "\n" +
                "Prev_hash: " + this.prev_hash + "\n" +
                "pKey_sender: " + get_PK_sender().hashCode() + "\n" +
                "pKey_recipient: " + get_PK_recipient().hashCode() + "\n" +
                "Pigcoins: " + getPigCoins() + "\n" +
                "Message: " + getMessage() +  "\n";
    }




}
