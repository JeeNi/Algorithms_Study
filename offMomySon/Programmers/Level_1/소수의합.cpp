#include<iostream>
#include<vector>
#include<cmath>

// 프로그래머스 특성상 메모리 체크를하여,
// 아래 함수화된 코드를 실행하면, 오류초과남.
using namespace std;

long long solution(int N);
void deletNonePrimeNum(int N, vector<bool>& isPrimeNum);
int sumAllPrimeNum(int N, vector<bool>& isPrimeNum);

int main(void) {
	cout << solution(7) << endl;
}

long long solution(int N){
	long long primeNumSum = 0;
	vector<bool> isPrimeNum(N + 1, true);

	deletNonePrimeNum(N, isPrimeNum);
	//for (int i = 2; i <= square; i++) {
	//	if (isPrimeNum[i] == true) {
	//		for (int j = 2; j * i <= N; j++) {
	//			isPrimeNum[i*j] = false;
	//		}
	//	}
	//}
	primeNumSum = sumAllPrimeNum(N, isPrimeNum);
	//for (int i = 2; i < isPrimeNum.size(); i++) {
	//	if (isPrimeNum[i] == true) {
	//		primeNumSum += i;
	//	}
	//}
	return primeNumSum;
}

//최대수 N 까지의 소수를 구한다.
// 소수란 1과 자기자신의 숫자를 포함하는 숫자이다.
// 소수에 곱을하면 더이상 소수가 아니다.
// 즉, 2,4,6,8 .. 은 소수가 아니다.
// 이러한 원리에 입각하여, 작은숫자의 소수부터 최대수 N/2 의 숫자가 소수인지 검사하고 소수이면 곱을하여
// 소수가 아닌 숫자를 제한다.
void deletNonePrimeNum(int N, vector<bool>& isPrimeNum) {
	int sqrtNum = sqrt(N);
	for (int i = 2; i <= sqrtNum; i++) {
		if ( isPrimeNum[i] == true ) {
			for (int j = 2; j*i <= N ; j++) {
				int num = i * j;
				isPrimeNum[num] = false;
			}
		}
	}
}

int sumAllPrimeNum(int N, vector<bool>& isPrimeNum) {
	int sum = 0;
	for (int i = 2; i < isPrimeNum.size() ; i++) {
		if (isPrimeNum[i] == true) {
			sum += i;
		}
	}
	return sum;
}