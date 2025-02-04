package com.Exceptions.customExceptions;
// sabse pehle to custOmException ko Extends karao Exception clas me
public class InsufficientFundsException extends Exception{
//    public InsufficientFundsException(){
//        super("You don't have enough Money.");
//    }


    public String toString(){ //  ye code likhne se hume constructor banake msg dalvane ki jarurrat nahi padi.
        return "not enough money";  // but constructor way is recommended.
    }
}
