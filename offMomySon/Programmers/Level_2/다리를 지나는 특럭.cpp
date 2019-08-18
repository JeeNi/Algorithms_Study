#include <string>
#include <vector>
#include <queue>
#include <iostream>

using namespace std;

typedef struct {
	int weight;
	int time;
}TruckInfo;

// 다리에 차를 올림.
bool pushBridge(int limitBridgeWeight, int& nowBridgeWeight, queue<TruckInfo>& q, TruckInfo truck) {
	if (nowBridgeWeight + truck.weight > limitBridgeWeight) {
		return false;
	}
	q.push(truck);
	nowBridgeWeight += truck.weight;
	return true;
}
// 다리에 차를 뺌.
void popBridge(int nowTime, int bridge_length, int& nowBridgeWeight, queue<TruckInfo>& q) {
	if (q.empty())
		return;

	TruckInfo frontTruckInfo = q.front();
	int spendTime = nowTime - frontTruckInfo.time;
	int truckWeight = frontTruckInfo.weight;

	if (spendTime >= bridge_length) {
		nowBridgeWeight -= truckWeight;
		q.pop();
	}
}
// 수송이 끝났는지 체크.
bool checkTransportFinished(queue<TruckInfo>& q, int& nextTruckIndex, int truckWeightsLength) {
	if (q.empty() && nextTruckIndex >= truckWeightsLength) {
		return true;
	}
	return false;
}
// 풀이.
// 다리의 길이에 따라 차량이 다리에 있는 시간이 결정된다.
// ex) bridge_length = 2 일 경우
// 1,2 초 다리에 머물러 있다. -> 3초가 되었을때, 다리에서 차를 뺀다음. 결과 정리를 해도 괜찮다.
// Logic
// 1) 현재 시간에, 다리에 머물러 있으면 안되는 차량 제거.
// 2) 모든 차량 수송이 끝났는지 체크.
// 3) 현재 시간에, 차량이 다리에 올라갈수 있으면 챠량 올림.
int solution(int bridge_length, int weight, vector<int> truck_weights) {
	int nowTime = 1;
	int nowBridgeWeight =0;
	int nextTruckIndex =0 ;
	queue<TruckInfo> q;
	
	while (true) {
		popBridge(nowTime, bridge_length, nowBridgeWeight, q);
		
		if (checkTransportFinished(q, nextTruckIndex, truck_weights.size())) {
			break;
		}

		if (nextTruckIndex < truck_weights.size()) {
			if (pushBridge(weight, nowBridgeWeight, q, { truck_weights[nextTruckIndex], nowTime })) {
				nextTruckIndex++;
			}
		}
		nowTime++;
	}
	return nowTime;
}

//Test main
int main() {
	int ans = solution(2, 10, { 7,4,5,6 });
	cout << ans << "\n";
	return ans;
}