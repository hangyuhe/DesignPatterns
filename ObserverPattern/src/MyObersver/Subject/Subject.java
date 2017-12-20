package MyObersver.Subject;

import MyObersver.Observer.Observer;

/**
 * Created by hhyx5 on 2017/12/19.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
