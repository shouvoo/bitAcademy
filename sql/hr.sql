select * from tab;

CREATE table stud
(
    id varchar2(50),
    name VARCHAR2(100)
);

CREATE TABLE exam
(
    id number,
    title VARCHAR2(50),
    reg_date DATE
);

ALTER table exam add(kor number); --컬럼 추가하기

ALTER table exam modify(reg_date timestamp); --테이블 date 속성 변경

ALTER table exam RENAME COLUMN reg_date to join_date; --속성이름을 변경

ALTER table exam DROP COLUMN join_date; -- 컬럼한개를 지움

ALTER table exam add(reg_date timestamp);

INSERT into exam(id, reg_date, title) values(1, '2017/08/23 17:20:35', 'semi'); --컬럼에 값을 넣어준다

INSERT into exam(id, reg_date, title) values(2, '2017/08/23 17:30:35', 'final');

insert all --다중으로 넣을수 있음
into exam(id, reg_date, kor) values(3, '2017/08/24 17:36:35', 88)
into exam(id, reg_date, title) values(4, '2017/08/25 17:37:35', 'final')
into exam(id, reg_date, title) values(5, '2017/08/26 17:38:35', 'final')
SELECT * from dual;















