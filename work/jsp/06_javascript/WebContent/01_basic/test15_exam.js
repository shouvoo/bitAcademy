let comment = `1. 전체 게시물 조회
2. 글번호 조회
3. 글등록
4. 글수정
5. 글삭제
0. 종료`;

let boardTitle = `-------------------------------
번호	글쓴이	   제목
-------------------------------`;

let worngNumber = `-------------------------------
입력된 번호는 존재하지 않습니다.
-------------------------------`;

let emptyList = `게시물이 존재하지 않습니다.
-------------------------------`;

let promptId = -1;

let boardList = [];



function cmt(msg)
{
    console.log(msg);
}

doSomeThing();

function doSomeThing()
{
    cmt(comment);
    prompt("메뉴 중 처리할 항목을 선택하세요 : ");

    switch(promptId)
    {
        case '0' : 
            cmt("게시판 프로그램을 종료합니다");
            break;

        case '1' : 
            

            cmt(boardTitle);
            if(boardList.length == 0) 
            {
                cmt(emptyList);
                doSomeThing();
                return;
            }

            for(let i = 0; i<boardList.length; i++)
            {
                console.log(boardList[i][0]+"     ", boardList[i][1]+"     ", boardList[i][2]);
            }
            doSomeThing();
            break;

        case '2' : 
            prompt("조회할 글번호를 입력하세요 : ");

            for(let i = 0; i<boardList.length; i++)
            {
                if(promptId == boardList[i][0])
                {
                    cmt(boardTitle);
                    console.log(boardList[promptId][0]+"     ", boardList[promptId][1]+"     ", boardList[promptId][2]);
                    doSomeThing();
                    return;
                } else 
                {
                    cmt(worngNumber);
                    doSomeThing();
                    return;
                }
            }    
            doSomeThing();        
            break;     
            
        case '3' : 
            let listCount = boardList.length;
            boardList.push([]);
            boardList[listCount][0] = listCount + 1;
            prompt("글쓴이를 입력하세요 : ")
            boardList[listCount][1] = promptId;
            prompt("제목을 입력하세요 : ")
            boardList[listCount][2] = promptId;
            doSomeThing();
            break;

        case '4' : 
            prompt("수정할 글번호를 입력하세요 : ");

            for(let i = 0; i<boardList.length; i++)
            {
                if(promptId == boardList[i][0])
                {
                    var selectId = i;
                    prompt("변경할 제목을 입력하세요 : ");
                    boardList[selectId][2] = promptId;
                    cmt(" 게시글이 수정되었습니다.");
                    doSomeThing();
                    return;
                } else 
                {
                    cmt("선택한 게시물은 존재하지 않습니다");
                    doSomeThing();
                    return;
                }
            } 
            doSomeThing();
            break;
           

        case '5' : 
            prompt("삭제할 글번호를 입력하세요 : ");
            for(let i = 0; i<boardList.length; i++)
            {
                if(promptId == boardList[i][0])
                {
                    cmt("게시글이 삭제되었습니다.");
                    boardList.splice(promptId, 1);
                    doSomeThing();
                    return;
                } else 
                {
                    cmt("선택한 게시물은 존재하지 않습니다");
                    doSomeThing();
                    return;
                }
            } 
            doSomeThing();
            break;
    }
}

function prompt(msg)
{
    var prompt = require('prompt-sync')();
    // 
    // get input from the user. 
    // 
    promptId = prompt(msg);
}




