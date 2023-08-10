public class IntegerPrinter<T,V> {

Integer thingsToPrint;
T thingstoShout;
V otherThings;

    public IntegerPrinter(Integer thingsToPrint) {
        this.thingsToPrint = thingsToPrint;
    }

    public IntegerPrinter(T thingstoShout, V otherThings) {
        this.thingstoShout = thingstoShout;
        this.otherThings = otherThings;
    }

    public void print(){
       System.out.println(thingsToPrint);
    }

    public static<T, V> T shout(T thingstoShout,V otherThings){
        System.out.println(thingstoShout);
        System.out.println(otherThings);

        return thingstoShout;
    }

}
