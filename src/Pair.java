
public class Pair<T1,T2> {
    private T1 left;
    private T2 right;

    Pair(  T1 left,T2 right)
    {
        if(left==null && right==null)
            throw new RuntimeException("Cannot be null");
        this.left=left;
        this.right=right;

    }
    public <T1,T2> void  setMethod(T1 x,T2 y)
    {
        //this.left=x;
        //this.right=y;
    }
    public T1 getLeft() {
        return left;
    }

    public  T2 getRight() {
        return right;
    }

}
