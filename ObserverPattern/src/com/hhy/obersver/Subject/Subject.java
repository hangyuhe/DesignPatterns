package com.hhy.obersver.Subject;

import com.hhy.obersver.Obserber.Observer;

/**
 * Created by hhyx5 on 2017/12/19.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
