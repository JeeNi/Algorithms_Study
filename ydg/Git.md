# Git

참조 : [티스토리 - 개념](https://duzi077.tistory.com/127), [깃헙io-개념](https://rogerdudler.github.io/git-guide/index.ko.html). [깃헙io-pull request](https://wayhome25.github.io/git/2017/07/08/git-first-pull-request-story/)

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
//conflict는 발생하지 않는다고 가정
git add . 
git commit -m "Finish"
git push origin ABC                          //ABC 브랜치에서 원격으로 push

Github에 반영하기
방법1
1-1. Github -> Pull Request 탭 -> Pull Request이 생성되어있음
1-2. 초록색 Compare & pull request 버튼을 통해 PR 생성

방법2
2-1. Github의 자신의 브랜치로 이동하여 New pull request 클릭
2-2. PR 작성 후 Create pull request 클릭

관리자가 PR을 보고 Merge 여부를 결정 
- Pull request 탭에 들어가면 요청이 와있음. Merge pull request 클릭
```



**Pull Request(PR)**

PR의 목적은 코드 리뷰이다. 코드를 무분별하게 Merge하여 반영하는 것이 아닌 관리자가 PR을 보고 Merge를 하게 된다. (자세한 내용은 상단 참고링크를 활용)



### 삭제

```
git push origin --delete ABC
```
