
public class JAVA_01_03_기본형타입변환 {

	public static void main(String[] args) {
		// 타입이 다른 변수끼리의 대입
		// 타입이 다른 변수의 경우
		// 사용하는 btye의 크기가 다르기 때문에
		// 표현 할 수 있는 범위도 다르다.
		// 이와 같은 경우
		// 묵시적 형변환과 명시적 형변환을 사용하여 대입할 수 있다.
		
		// 묵시적 형변환
		// 크기가 작은 타입을 크기가 더 큰 타입으로 바꿀때에는 묵시적으로
		// 형을 변환에 준다.
		int x = 10000;
		long y = x;
		// int는 4btye, long은 8btye이므로
		// 묵시적 변환이 일어난다.
		// 이를 암묵적 형변환이라고도 한다.
		// 묵시적변환은 알아서 해주므로 
		// 이게 있구나 정도만 알고 있으면 된다.
		
		// 명시적 형변환
		// 크기가 더 큰 타입을 작은 타입으로 바꿀 때에는 
		// 명시적으로 변환 해주어야 한다.
		long z = 10000;
		int k = (int)z;
		// 위와 같이 크기가 더 큰 타입을 작은 타입으로 바꿀때는
		// (타입)을 적어주면서 명시적변환을 해준다.
		// 이를 강제 형변환이라고 한다.
	}

}