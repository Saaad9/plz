import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam2839 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); //배달해야하는 N킬로그램 입력
        int x = 0, y = 0;
        if(N < 3 || N == 4) {
            System.out.println("-1"); //(1,2,4)의 경우 N키로그램 못만듦
            System.exit(0);
        }
        
        else{

            while(true){ //5kg짜리 비닐 개수를 계속 늘림
                
                if(N == 3) { //3kg라면 1봉지만 옮기면 됨
                    System.out.println("1"); System.exit(0);
                }
                
                else if( (5 * y) < N){ //vynle5 합이 N보다 작으면 y++ 
                        y++; 
                    if( (3 * x) + (5 * y) == N){ // 3kg비닐+5kg비닐의 무게가 N과 같을때
                        System.out.println(x + y); break;
                    }
                }
            
                else{   
                    while(true){
                        if( (3 * x) + (5 * y) == N){ // 3kg비닐+5kg비닐의 무게가 N과 같을때
                            System.out.println(x + y); System.exit(0);
                        }
                        x++; //3kg비닐의 개수 증가
                           
                        if( (3 * x) + (5 * y) > N){
                            if(y>0){ //y는 양수 범위임
                                y--; //5kg봉지 개수 감소
                            }
                        }   
                        if(y == 0 && (3 * x) > N){ //3kg 비닐의 총합이 N을 넘으면서 y=0일때
                            System.out.println("-1"); System.exit(0);
                        }
                    }
                }
            }
        }
    }//메인문
}//class 선언