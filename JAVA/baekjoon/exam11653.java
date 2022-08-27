import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class exam11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); //N 입력


        if(N == 2){
            System.out.println("2");
        }
        else if(N == 3){
            System.out.println("3");
        }
        else if(isPrime(N)){
            System.out.println(N);
        }
        else{
            for(int i = 2; i < N - 1;){ //2 ~ N-1 수로 N을 나눔
                
                if(N % i == 0) { //N이 i로 나누어지면

                    N = N / i; //N 값 갱신(나눈 몫)
                
                    System.out.println(i); //나눈 수 출력
                
                    if(isPrime(N)) { //마지막 수가 소수라면
                        System.out.println(N);
                    }
                }
                else i++; //i증가
            }
        }       
    }
    public static boolean isPrime(int num){
        if(num == 1 || num == 0) return false;
        
        for ( int i = 2; i < num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}