public class Printer<T>{

    T print;

    public Printer(T print) {
        this.print = print;
    }

    public void print(){
        System.out.println(print);
    }
}
