package com.eng.beh.observer.ex2;

/**
 * Created by servicium on 27.09.2015.
 */
public abstract class Kontrol {

    protected String m_Text;
    protected String m_Name;

    //Durum degistiginde calisacak
    public abstract void onAction(String s);

    //binding ve unbinding
    public abstract void add(IObservable o);
    public abstract void remove(IObservable o);


    public String getM_Text() {
        return m_Text;
    }

    public void setM_Text(String m_Text) {
        this.m_Text = m_Text;
    }

    public String getM_Name() {
        return m_Name;
    }

    public void setM_Name(String m_Name) {
        this.m_Name = m_Name;
    }





}
