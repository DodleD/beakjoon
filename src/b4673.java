public class b4673 {
    public static void main(String[] args){
        int result = 0;

        int t1=0; //1의 자리
        int t10=0; //10의 자리
        int t100=0; //100의 자리
        int t1000=0; //1000의 자리

        boolean[] bArr = new boolean[10000]; //true,false로 출력을 구분

        for(int i = 1; i<=10000; i ++){
            if(i<100){
                t1 = i % 10;
                t10 = (i / 10) %10;
                result = i + t1 + t10;
            }else if(i<1000){
                t1 = i % 10;
                t10 = (i / 10) %10;
                t100 = i / 100;
                result = i + t1 + t10 + t100;
            }else if(i<10000){
                t1 = i % 10;
                t10 = (i / 10) %10;
                t100 = (i / 100)%10;
                t1000 = i / 1000;
                result = i + t1 + t10 + t100 + t1000;
            }
            if(result<10000) {
                bArr[result] = true; //위에서 만들어진 수는 모두 true로 변경
            }
        }
        for(int i = 1 ; i<10000; i++){
            if(!bArr[i]){ //위에서 true 바꾸지 않은 생성자가 없는 친구들만 출력asd
                System.out.println(i);
            }


        }
    }
}
