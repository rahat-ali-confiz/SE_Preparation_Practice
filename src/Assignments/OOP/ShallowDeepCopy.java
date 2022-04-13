package Assignments.OOP;


import java.util.Arrays;

class ShallowCopy {
    public int[] data;
    public ShallowCopy(int[] values){
        data=values;
    }

    public void showData(){
        System.out.println(Arrays.toString(data));
    }
}
class DeepCopy {
    public int[] data;
    public DeepCopy(int[] values){
        data = new int[values.length];
        for (int i=0;i<data.length;i++){
            data[i]=values[i];
        }
    }

    public void showData(){
        System.out.println(Arrays.toString(data));
    }
}
public class ShallowDeepCopy {
    public static void main(String[] args){
        int[] values = {3,7,9};
//        ShallowCopy shallowObj = new ShallowCopy(values);
//        shallowObj.showData();
//        values[1]=5;
//        shallowObj.showData();

        DeepCopy deepObj = new DeepCopy(values);
        deepObj.showData();
        values[0]=9;
        deepObj.showData();
    }

}
