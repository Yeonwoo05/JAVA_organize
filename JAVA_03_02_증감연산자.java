
public class JAVA_03_02_증감연산자 {
	public static void main(String[] args) {
		// 부호 연산자?
		// 수학에서 양수, 음수를 나타내듯이
		// 자바에서도 +, - 를 통해 양수와 음수를 나타낸다.
		// 변수나 값 앞에 + 나 - 를 붙여 값을 나타낸다.
		int p = +1;
		int m = -4;
		int z = -m;
		// 위의 z 같은 경우
		// -4 인 m을 -를 통해 대입했기 때문에
		// 음수가 아닌 4가 들어가게 된다.
		
		
		// 증감연산자?
		// 변수의 앞 또는 뒤에 +나 - 를 두 개 붙여
		// 사용한다.
		// 변수의 값에 +1, -1 을 증가 또는 감소 시킬 수 있다.
		// 증감연산에는 전위 연산과 후위 연산이 있는데
		// 전위 연산 같은 경우 변수의 앞에 연산자를 붙여 사용한다.
		// 이때, 전위연산자는 계산이 시작되기 전에 먼저 연산 하므로
		// 값이 바뀌고 연산이 진행된다.
		// ex) int a = 10;
		// ex) int sum = ++a;
		// 위와 같은 식일 경우
		// 정수형 변수 a는 10이라는 값을 가지고 있다가
		// sum에 대입되기 전 11로 증가되어 대입된다.
		// 쉽게 생각하면
		// sum ++a 는 
		// a = a + 1;
		// sum = a;
		// 식으로 풀어 쓸 수 있다.
		
		// 후위 연산은 이와 반대인데
		// 전위가 연산이 시작 되기 전 증감 시키고 연산 했다면
		// 후위 연산은 연산이 끝나고 증감시킨다.
		// sum = a++ 를 풀어쓰면
		// sum = a;
		// a = a + 1;
		// 위의 식으로 풀어쓸 수 있다.
		
	}
}
