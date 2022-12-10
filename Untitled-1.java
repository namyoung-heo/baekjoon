import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int A[] = new int[N];
        int temp;
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(bf.readLine());
        }
        for(int i = 0; i < N-1; i++){
            for(int j = 0; j < N-1-i; j++){
                if(A[j]>A[j+1]){
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        for(int i=0 ; i < N; i++){
            System.out.println(A[i]);
        }
    }
}
