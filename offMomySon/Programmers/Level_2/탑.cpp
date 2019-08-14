#include <string>
#include <vector>
#include <stack>
#include<iostream>

using namespace std;

typedef struct {
	int height;
	int index;
}TopInfo;

// 1) 이전 탑의 높이를 넣은 stack 에서 현재의 값보다 큰 값이 있을때 까지 pop 한다.
// 2) 만약 자신보다 높은 값이 없다면 모두 뺴고, 신호를 수신하는 탑 배열에 0을 넣는다.
// 3) 만약 있다면 해당 index의 값을 , 신호를 수신하는 탑 배열에 넣는다.
// 4) 현재 탑의 높이를 stack 에 넣는다.
// 계속 반복한다.
vector<int> solution(vector<int> heights) {
	vector<int> answer;
	answer.push_back(0);

	stack<TopInfo> topStack;
	topStack.push({heights[0], 1});

	for (int i = 1; i < heights.size(); i++) {
		while (!topStack.empty()) {
			TopInfo nowTopInfo = topStack.top();
			
			if (nowTopInfo.height > heights[i]) {
				answer.push_back(nowTopInfo.index);
				break;
			}
			else {
				topStack.pop();
			}

			if (nowTopInfo.height <= heights[i] &&
				topStack.empty() ) {
				answer.push_back(0);
				break;
			}
		}
		topStack.push({ heights[i], i + 1 });
	}

	return answer;
}

//Test main
int main() {
	vector<int> res = solution({});
	for (int i = 0; i < res.size(); i++) {
		cout << res[i];
	}
}



