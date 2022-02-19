package mianshi;

/**
 * @Author Justifymeaning
 * @Date 2021/3/25 13:12
 * @Version 1.0
 */
//  输出几个整数的所有排列组合
public class oppo_03 {
    public static void main(String[] args) {
        int[] array={0,1,2,3};
        //共三个循环，且循环总次数为24，比前面的方法少
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<4;k++){
                    System.out.print(array[k%4]+" "+array[(k+j%3+1)%4]+" "+array[(k+(j+i%2+1)%3+1)%4]+" "+array[(k+(j+(i+1)%2+1)%3+1)%4]+" ");
                    if(k==3){
                        System.out.println();
                        continue;
                    }
                    System.out.print(", ");
                }
            }
        }
    }
}
