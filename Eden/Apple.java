package Eden;

public class Apple {
    public int weight;
    public boolean isEmpty;

    public Apple(int weight){
        this.weight = weight;
    }

    public boolean isEmpty(){
        if (weight <= 0){
            return true;
        }
        return false;
    }
}
