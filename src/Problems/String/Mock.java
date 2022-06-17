package Problems.String;

public class Mock {
    public static void main(String[] args){
        String[][][] data = new String[3][2][2];

        int x = 1;
        int y = 1;
        int z = 2;
        int n = 3;

        for(int i=0;i<x+1;i++){
            for(int j=0;j<y+1;j++){
                for(int k=0;k<z+1;k++){
                    if(i+j+k == n)
                        continue;
                    else
                        System.out.println(i+" "+j+" "+k+" ");
                }
            }
        }

    }
}
