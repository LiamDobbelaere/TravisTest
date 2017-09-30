package be.howest.tomdobbelaere;

/**
 * Created by tomdo on 30/09/2017.
 */
public class AddOperation {
    private int opA;
    private int opB;

    public AddOperation(int opA, int opB) {
        this.opA = opA;
        this.opB = opB;
    }

    public int evaluate() {
        return this.opA + this.opB;
    }
}
