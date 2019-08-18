*조건문
int isEven(int a) {
    if(a % 2 == 0) return 1;
    else retrun 0;
}

*반복문
int getRangeSum(int n) {
    int sum = 0;
    for (int i = 1; i < n; i ++) {
        sum += 1;
    }
    return sum;
}

*배열
int getMaxNum(int[] array) {
    int ret = array[0];
    for(int i = 1; i < array.length; i++) {
        if(ret < array[i]) ret = array[i];
    }
    return;
}

*정렬
_ 요소를 늘어놓고 적당한 수소로 바꾸는 것 (코드 기억!!!)
Arrya.sort(array);

*문자열 처리
String s = "abc";
// 동일 판정
if (s.equals("abc")) System.out.println("equal");
// 문자 하나 추출
char c = s.charAt(1); // 'b'
// 문자열 연결
s = "def" + s + "ghi"; // "defabcghi"
// 문자열 잘라내기
s = s.substring(3, 3); // "abc"

*연관 배열
void countString(String[] s) {
    Map<String, Integer> hm = new HashMap<String, Integer>();
    for(int i = 0; i < s.length; i++) {
        if(!hm.containsKey(s[i])) hm.put(s[i], 0);
        hm.put(s[i], hm.get(s[i]) + 1);
    }
    for(String key : hm.keySet()) {
        System.out.println(key + " " + hm.get(key));
    }
}