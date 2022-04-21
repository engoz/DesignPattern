package com.eng.beh.mediator;

public class Button {
    private Mediator mediator;

    // constructor, getters and setters
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        mediator.press();
    }
}
