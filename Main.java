public class Main {
    public static void main(String[] args) {
        // write your code here
        int var1=5;
        int var2=2;
        double var3=var1/var2;
        int var4=(int)(var3*var2);
        System.out.println(var4);
//var3 값을 출력해보면 2.5가 아니라 2.0로 출력된다. 자바가 자체적으로 소수점은 힘들기때문에
//버리고 정수값인 2.0만 표기해주는것 같다.
        int x=10;
        int y=20;
        int z = (++x) + (y--);
        System.out.println(z);
//x는 선행 증감 연산자라 변수값은 먼저 증가 시키고 변수값을 이용하지만
//y는 후행 증감 연사자라 변수값은 먼저 '이용'하고 감소시켜서 11+20=31 값이 나온다


//3번 문제는 제가 과제 있는걸 늦게 봐서 math.random빠르게 배우고나면 답변하겠습니다.
    }
}



