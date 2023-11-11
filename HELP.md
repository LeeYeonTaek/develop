### javaScript
+ jquery 라이브러리를 적용하지 않아서 문제

``<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>``

+ tiles 적용으로 인해 join.js ``<script>`` 위치에 대한 문제
> tiles 를 적용 받는 특정 jsp 맨위에 ``<script>``를 적용하면  
> 스크립트가 실행되지 않음.(맨 아래에서는 적용)

> 브라우저는
> 1. HTML을 읽기 시작
> 2. HTML을 파싱 (parsing: 컴퓨터가 읽을 수 있는 코드로 변경)
> 3. DOM 트리 생성.
> 4. Render 트리가 생성 (DOM tree + CSS의 CSSOM 트리 결합)
> 5. Display(브라우저)에 표시

> 1~2 과정에서
> HTML을 읽어 내려가는 과정에서 script 요소를 만나면 파싱 중단.  
> 중단된 상태에서 script를 로드한후, script 코드를 파싱한 후에
> HTML 파싱이 계속 된다.  
> 이러한 이유로는 속도가 저하될 수 있다.

> 본인의 경우 HTML 파싱이 끝나고 DOM 트리가 생기기전에  
> script가 실행되어 DOM 조작을 할 경우 에러가 발생할 수 있다.

> 위는 body 태그 최하단에 위치해야 하는 이유이나,  
> 이를 방지하기 위한 속성이 있다.

+ async / defer 속성

``<script async src="index.js"></script>``  
``<script defer src="index.js"></script>``

`async의 경우에는 HTML 파싱과 script 파싱이 비동기적으로`  
`동시에 진행되어 속도 개선이 가능, 하나 DOM 조작 에러가 발생할 수는 있다.`  
`join.jsp 의 경우 코드 위치를 맨 위에 두더라도 DOM 조작 에러가 발생하지는 않음.`

`defer의 경우 HTML 파싱이 모두 끝난 뒤 스크립트가 실행된다`  
`맨위에 ``<scrpit>`` 코드 위치를 두더라도 에러가 발생하지 않았다.`
 
---
