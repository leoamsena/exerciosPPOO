/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo
 */
public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException(int id) {
        super("Saldo da conta número "+id+" insuficiente!");
    }
    
}
