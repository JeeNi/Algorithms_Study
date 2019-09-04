# Git

참조 : [티스토리 - 개발하는 두더지](https://duzi077.tistory.com/127), [깃헙io](https://rogerdudler.github.io/git-guide/index.ko.html)

## 시작

```
git init                                   // 초기화
git config --global user.name ""           // 이름설정
git config --global user.email ""          // 이메일설정
git config --list                          // 환경설정 확인

git remote add origin ""                   // 원격 설정
git remote --v                             // 원격 확인
```



## 기본명령어

```
git pull origin master                     // 원격 -> 로컬 마스터로 데이터 가져오기
git add . (= git add --all )               // 인덱스에 올리기
git commit -m ""                           // Commit
git push origin master                     // push
```



## 브랜치

### 생성

```
git branch --all (= git branch --v, = git branch)  //브런치 리스트 조회
git branch ABC                                     //ABC 브런치 생성
git push origin ABC                                //원격에도 브런치 생성 반영
git checkout ABC                                   //HEAD 옮기기 Master -> ABC
```



### 개발완료

```
//현재 ABC에서 코딩을 한 후 작업이 완료되었다고 가정
git add . 
git commit -m "Finish"
```



### 삭제

```
git push origin --delete ABC
```







