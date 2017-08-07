package delegate;

/**
 * Created by troll on 08.08.2017.
 */
public class B {
    A a = new A();
    //класс B делегирует свои полнимочия классу A
    void f(){
        a.f();
    }
}
