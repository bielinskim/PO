/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad4lab3;

/**
 *
 * @author mateu
 */
public class CardinalityException extends RuntimeException {

    /**
     * Creates a new instance of <code>CardinalityException</code> without
     * detail message.
     */
    public CardinalityException() {
    }

    /**
     * Constructs an instance of <code>CardinalityException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CardinalityException(String msg) {
        super(msg);
    }
}
