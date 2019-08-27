def calh(citations):
    citations.sort(reverse=True)
    h = 0
    for i in range(len(citations)):
        if citations[i] > h:
            h += 1
    return h 

# test 
citations = [3, 0, 1, 0, 0, 0, 0, 10, 3, 4, 5]
print(calh(citations))

# 교훈
# 1. concrete case 를 작은 단위로 쪼갠다. 
# -> (가능한한 작게, 작으면 작을 수록 좋다, 누구라도 판단이 가능할 정도로)
# 2. 논리적 의사 결정을 컴퓨터 언어로 만든다. 
# -> concrete case 를 자세하게 분석할 수록 논리적이고 군더더기 없는 알고리즘을 짤 수 있다. 