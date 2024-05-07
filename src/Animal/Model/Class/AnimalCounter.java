package Animal.Model.Class;

public class AnimalCounter implements AutoCloseable{
    private static int sum=0;
    public void add() {
        sum++;
    }
    public int getCount(){
        return  sum;
    }

    @Override
    public void close() throws Exception {

    }
}
