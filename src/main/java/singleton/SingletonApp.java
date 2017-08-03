package singleton;

/**
 * Created by troll on 03.08.2017.
 */
public class SingletonApp {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        //Во всех случаях true, так как все ссылки указывают на один и тот же объект в памяти
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s3);

        SingletonEnum se = SingletonEnum.INSTANCE;
        LazySingleton lazySingleton = LazySingleton.getInstance();//инициалиазация объекта и возврат ссылки
        LazySingleton lazySingleton1 = LazySingleton.getInstance();//возврат ссылки на уже имееющийся объект

    }
}
