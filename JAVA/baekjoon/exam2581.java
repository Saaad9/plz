import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class exam2581 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int min = 0;
        int sum = 0;

        for(int i = M; i <= N; i++){
            if(isPrime(i)){ // i가 소수일때
                if(sum == 0){
                    min = i;
                }
                sum += i;
            }
        }
        if(sum == 0) {
            System.out.println("-1");
        }
        else{
        System.out.println(sum);
        System.out.println(min);
    }
        
    }

    public static boolean isPrime(int num){ //소수 판별 함수
        if(num == 1 || num == 0) return false;
        
        for ( int i = 2; i < num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
