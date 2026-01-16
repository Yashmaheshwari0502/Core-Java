

class Data<T>{
    private T obj;

    public void setData(T o){
        obj=o;
    }
    public T getData(){
        return obj;
    }

}

public class java_02_data_generics {
    public static void main(String[] args) {
        Data<Integer> d=new Data<>();
        d.setData(10);
        System.out.println(d.getData());

    }

}
