#include <string>
#include <vector>
#include <map>
#include <iostream>

using namespace std;

//map 구조상, n개의 element를 insert 하면, nlog(n) time complexity 소요된다.
string solution(vector<string> participant, vector<string> completion) {
	string answer = "";
	int ansIndex = 1;
	map<string,int> participantSet;

	for (string str : participant) {
		++participantSet[str];
	}

	for (string str : completion) {
		--participantSet[str];
	}

	for (pair<string, int> p : participantSet) {
		if (p.second > 0) {
			return p.first;
		}
	}
}

//Test main
int main() {
	cout << solution({ "mislav", "stanko", "mislav", "ana" }, { "stanko", "ana", "mislav" });
}