# 알고리즘 스터디

## 참여 인원
| 이창의 | 김민수 | 한동근 | 류세민 | 김보성 |
| ------ | ------ | ------ | ------ | ------ |
|   ![](https://avatars.githubusercontent.com/u/122252160?v=4)     |  <img src = "https://avatars.githubusercontent.com/u/113896182?v=4" width= "480">      |   ![](https://avatars.githubusercontent.com/u/128709695?v=4)     |    ![](https://avatars.githubusercontent.com/u/113248843?v=4)     |    ![](https://avatars.githubusercontent.com/u/124684536?v=4)     |    
## 규칙
- 주마다 각자 푼 문제 중 1문제씩 선정해서 문제 풀이를 진행한다. 
- 발표할 내용을 상세히 발표자료를 만들어서 올 것.

## 파일명
마크다운 파일은 [O주차][문제번호].[확장자]

## 일정

참여 : ✅  
불참 : 😵  

| 주차   | 이창의 | 김민수 | 한동근 | 류세민 | 김보성 |
| ------ | ------ | ------ | ------ | ------ | ------ |
| 예시   |   ✅      |  😵     |     ✅   |   😵    |   ✅     |
| 1주차  |         |        |        |        |        |

## Pull Request 방법
- Fork
  ----
  본 리포지토리를 자신의 리포지토리로 fork 한다.
- clone, remote 설정
  ----
  fork로 생성한 본인 계정의 저장소에서 clone or download 버튼을 누르고 표시되는 url을 복사한다.
  
  자신의 컴퓨터에서 작업을 하기 위해서 Fork한 저장소를 로컬에 clone 한다.

  ```
  $ git clone https://github.com/Doritosch/AlgorithmStudy.git
  ```

  로컬 저장소에 원격 저장소를 추가한다. 위 작업과 동일하게 github 저장소에서 clone or download 메뉴를 통해서 확인한 url을 사용한다.
  - 원본 프로젝트 저장소 (직접 추가 필요)
  - fork한 로컬 프로젝트 (origin이라는 별명으로 기본으로 추가되어 있다. 따로 추가할 필요 없음)
  ```
  # 원본 프로젝트 저장소를 원격 저장소로 추가
  $ git remote add (별명) https://github.com/[원본계정]/AlgorithmStudy.git
  ```
  ```
  # 원격 저장소 설정 현황 확인방법
  $ git remote -v
  ```

- branch 생성
  ----
  자신의 로컬 컴퓨터에서 코드를 추가하는 작업은 branch를 만들어서 진행한다.
  ```
  # 자신의 이름의 branch를 생성한다.
  $ git checkout -b [이름]
  Switched to a new branch '[이름]'
  ```
- 문제를 풀고 나서 add, commit, push
  ----
  문제를 풀면, add, commit, push를 통해서 자신의 github repository (origin)에 수정사항을 반영한다.
  - **push 진행시에 branch 이름을 명시해주어야 한다.**
  ```
  # 자신이 만든 브랜치의 수정 내역을 origin 으로 푸시한다.
  $ git push origin [이름]
  ```
- Pull request 생성
  ----
  push 완료 후 본인 계정의 github 저장소에 들어오면 Compare & pull reqeust 버튼이 활성화 되어 있다. 

  해당 버튼을 선택하여 메시지를 작성하고 PR을 생성한다.
- Merge 이후 동기화 및 branch 삭제
  ----
  - 원본 저장소에 Merge가 완료되면 로컬 코드와 원본 저장소의 코드를 동기화 한다.
  - 작업하던 로컬의 branch를 삭제한다.
  ```
  # 코드 동기화
  $ git pull (remote 별명)
  # 브랜치 삭제
  $ git branch -d (브랜치 별명)
  ```

## 주차별 정리

### [OT - DFS, BFS]() : 5월 10일
- `스터디 당일 푼 문제`
  - [백준 2606](https://www.acmicpc.net/problem/2606)

### [1주차 - DFS, BFS]() : 5월
- `풀어올 문제` : 
  - [백준 16918](https://www.acmicpc.net/problem/16918) (류세민)
  - [백준 2667](https://www.acmicpc.net/problem/2667) (한동근)
  - [백준 14503](https://www.acmicpc.net/problem/14503) (김보성)
  - [백준 1260](https://www.acmicpc.net/problem/1260) (김민수)
  - [백준 2178](https://www.acmicpc.net/problem/2178) (이창의)
