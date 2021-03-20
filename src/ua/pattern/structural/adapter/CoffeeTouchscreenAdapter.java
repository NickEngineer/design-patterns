package ua.pattern.structural.adapter;

/**
 * The type Coffee touchscreen adapter.
 */
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    /**
     * The Old coffee machine.
     */
    private final OldCoffeeMachine oldCoffeeMachine;

    /**
     * Instantiates a new Coffee touchscreen adapter.
     */
    public CoffeeTouchscreenAdapter() {
        this.oldCoffeeMachine = new OldCoffeeMachine();
    }

    @Override
    public void chooseFirstSelection() {
        oldCoffeeMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        oldCoffeeMachine.selectB();
    }
}
