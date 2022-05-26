package com.eng.beh.observer.ex2;

/**
 * Created by servicium on 27.09.2015.
 */
public class Label extends Kontrol {
    @Override
    public void onAction(String s) {
        m_Text = s;
    }

    @Override
    public void add(IObservable o) {
        o.Register(this);
    }

    @Override
    public void remove(IObservable o) {
        o.UnRegister(this);
    }
}
