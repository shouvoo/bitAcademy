UPDATE exam SET KOR = 70; --테이블 kor 값을 모두 70으로 변경
UPDATE exam SET KOR = 90 where id > 3; --아이디가 3보다 크면 90으로 변경
UPDATE exam SET KOR = 77, reg_date = '2010-03-30' where id < 3; --아이디가 3보다 작으면 kor, reg_date 값ㅇ르 변경
select * from exam; --해당테이블의 값들을 보여준다
delete from exam where id = 4; --아이디가 4인 컬럼을 지우겠다

alter table exam add(no number);
alter table exam add(sid number, eng number, mat number);
alter table exam drop column no;
delete from exam where title = '한가인';

update exam set title = '김태희' where id = 2;
update exam set title = '전지현' where id = 4;
update exam set title = '이효리' where id = 5;


ALTER table exam DROP COLUMN sid; -- 컬럼한개를 지움
ALTER table exam add(sid VARCHAR2(100)); --컬럼 추가하기
insert into exam(id, title) values(8, 'final');

insert all --다중으로 넣을수 있음
into exam(id, title, kor, reg_date, eng, mat, sid) values(1, 'final', 75, '2017/08/24 17:36:35', 54, 88, '김태희')
into exam(id, title, kor, reg_date, eng, mat, sid) values(2, 'final', 65, '2017/08/24 17:36:35', 89, 99, '전지현')
into exam(id, title, kor, reg_date, eng, mat, sid) values(3, 'semi', 65, '2017/08/24 17:36:35', 98, 65, '이효리')
into exam(id, title, kor, reg_date, eng, mat, sid) values(4, 'final', 85, '2017/08/24 17:36:35', 81, 87, '한가인')
into exam(id, title, kor, reg_date, eng, mat, sid) values(5, 'semi', 95, '2017/08/24 17:36:35', 85, 89, '아이비')
SELECT * from dual;

aLTER table exam RENAME COLUMN reg_date to regdate; --속성이름을 변경

UPDATE exam set kor = kor + 10 where id > 2;
UPDATE exam set sid = sid + 10 where id > 2;
UPDATE exam set eng = eng + 10 where id > 2;
UPDATE exam set mat = mat + 10 where id > 2;
--윗 네줄을 한줄로 할수도 있음
UPDATE exam set kor = kor + 10, sid = sid + 10, eng = eng + 10, mat = mat + 10 where sid = '이효리' or sid = '한가인' or sid = '아이비';

delete from exam where title = '김태희';

alter table exam rename COLUMN id to no; -- 컬럼 명을 변경
alter table exam add(sid varchar2(50), eng number, sid number, mat number); -- 컬럼추가
alter table exam rename column reg_date to regdate;-- 컬럼명을 변경
alter table exam modify (regdate date);-- 데이트값을 넣어준다

select sid, kor, eng, mat from exam; --지정한 값만 보여준다
select sid, kor - 10, eng * 2, mat / 3 from exam; --지정한 값에 연산을해서 보여준다
select kor + eng + mat from exam; -- 총점
select (kor + eng + mat) / 3 from exam; -- 평균

select kor, eng, mat,
kor + eng+mat as sum, (kor + eng + mat) / 2 as avg from exam; -- 총점과 평균을 보여준다

select kor, eng, mat,
kor + eng+mat as sum, (kor + eng + mat) / 2 as 평균 from exam; -- avg 한글로 대체된다 

select kor, eng, mat,
kor + eng+mat as sum, (kor + eng + mat) / 2 as "평 균" from exam; -- avg 한글로 대체된다 단 한글을 칸을 띄우고 싶으면 "" 쌍따옴표로 묶어준다 "평 균" 
-- 평 균 - error , "평  균" - complete

SELECT sid || title from exam; --값을 붙혀서 출력해준다 
SELECT title || '님' from exam;
SELECT title || "님" from exam; -- 큰따옴표로 치면 컬럼이나 객체를 말한다 문자로 인식하지 않는다 문자는 ''

select distinct title from exam; --중복된 값을 출력하지 않는다

select * from exam;

select * from exam where kor = 77;
select * from exam where kor >= 77;
select * from exam where kor <= 77;
select * from exam where kor > 77;
select * from exam where kor < 77;
select * from exam where kor <> 77;

select * from exam where title like '%이%'; -- 와이들키(%) 를 넣어주면 '이' 가 포함된 값을 출력해준다
-- 와이들키가 앞뒤로 있으면 %이% 해당 글자가 포함된 값을 모두출력 와일드 키가 %이 끝자리가 "이"로 끝나는 글을 출력 와일드 키가 이% 뒤에 있으면 "이"로 시작하는 글을 출력
-- 와이들기 사용시는 like 를 사용

select * from exam where eng = 89 or eng = 91; --영어점수가 89, 91 인 것을 찾아 출력
select * from exam where eng in(89, 91); --영어점수가 89, 91 인 것을 찾아 출력 (윗줄과 같음)


select * from exam where eng >= 95 and eng <= 110;--영어점수가 95보다 크거나 110 보다 작은것을 찾아 출력
select * from exam where eng between 95 and 110;--영어점수가 95보다 크거나 110 보다 작은것을 찾아 출력 (윗줄과 같음)

select * from exam where kor <> 77; --77점이 아닌것은 모두 출력
select * from exam where not kor = 77; --77점이 아닌것은 모두 출력

select * from exam where title is null;--null 인것을 찾을때는 is 를 사용
select * from exam where title is not null;--null 이 나닌것을 찾을때는 is 를 사용

select * from exam ORDER by eng asc; -- 오름차순으로 나오게 해준다 eng 뒤에 asc 는 생략가능 asc(오름차순이) 기본으로 성정되어있기 때문
select * from exam ORDER by eng desc; -- 내림차순으로 나오게 해준다
select * from exam ORDER by title; -- 문자열일경우 가나다 순서 나오게 해준다
select * from exam ORDER by eng, title; 


select exam.*, eng + kor + mat as sum
from exam 
where sid is not null
ORDER by title desc, eng + kor + mat; 

select exam.*, 
eng + kor + mat as sum, (eng + kor + mat) / 3 as avg
from exam
where title = 'semi'
order by title desc, sid;

select exam.*, 
eng + kor + mat as sum, (eng + kor + mat) / 3 as avg
from exam
where title = 'semi' and sid is not null
order by title desc, sid;

select '아기상어' from dual;

select round(123.456, -1) from dual;
select round(987.654, -2) from dual;

select trunc(687.654) from dual;
 
select mod(15, 7) from dual;
select upper('aBcD') from dual;
select lower('aBcD') from dual;
select initcap('aBcD') from dual;
select instr('aBcD gfch', 'c') from dual;--문자열에서 c를 순서를 알려준다
select instr('aBcD gfch', 'c', 5) from dual;--문자열 5번째부터c를 찾아 순서를 알려준다
select instr('aBcD gfch', 'c', 5, 2) from dual;--문자열에서 5번째부터c를 찾아 c가 여러개 있다면 첫번째 c를 건너띄고 2번째 c의 순서를 알려준다

select substr('aBcD gfch', 2) from dual; -- 2번째 순서부터 전부다 출력
select substr('aBcD gfch', 2, 3) from dual; -- 2번째 순서부터 2번의 순서에서 3을 더한 자리 문자 전부다 출력
select substr('aBcD gfch', 2, 1) from dual; -- 2번째 순서부터 2번의 순서에서 1을 더한 자리 문자 전부다 출력

--890320-1234567
select substr('여남', mod(substr('890320-1234567', 8, 1), 2) + 1, 1) || '자' as gender from dual;

select lpad('abc', 20, '#') from dual; --20자의 칸을 abc이외에 왼쪽부터# 으로 채워준다
select rpad('abcefghijk', 20, '#') from dual; --20자의 칸을 abc이외에 오른쪽부터# 으로 채워준다
select rpad('abcefghijk', 5, '#') from dual; -- 글자가 오버되면 지정한 칸의 숫자만큼만 보여준다

select ltrim('################ abcefghijk #################', '#') from dual; --왼쪽에 있는 #을 없애준다
select rtrim('################ abcefghijk #################', '#') from dual; --오른쪽에 있는 #을 없애준다
select trim('    abc    efg   hijk    ') from dual;--빈칸만 지워준다 단 문자의 맨앞과 맨뒤의 공백만 지워준다
select length('abcefghijk') from dual;

select sysdate from dual; -- 년월일 출력
select sysdate + 10000 from dual;

select reg_date, sysdate, 
MONTHS_BETWEEN (reg_date, sysdate) from exam;

select add_months(sysdate, -240) from dual;
select BIRTH from stud;

select last_day(regdate) from exam;

select regdate, next_day(regdate, '월') from exam;


ALTER table stud add(birth VARCHAR2(100)); --컬럼 추가하기
insert all
into stud(id, name, birth) values(1, '김태희', '1979/08/24 17:36:35')
into stud(id, name, birth) values(1, '전지현', '1980/09/24 17:36:35')
into stud(id, name, birth) values(1, '이효리', '1960/07/24 17:36:35')
into stud(id, name, birth) values(1, '한가인', '1990/01/24 17:36:35')
into stud(id, name, birth) values(1, '아이비', '1999/05/24 17:36:35')
SELECT * from dual;

UPDATE stud set birth = '1980/09/24' where name = '전지현';
UPDATE stud set birth = '1960/07/24' where name = '이효리';
UPDATE stud set birth = '1990/01/24' where name = '한가인';
UPDATE stud set birth = '1999/05/24' where name = '아이비';

select stud.*, add_months(birth, 20 * 12) as ad
from stud
where add_months(birth, 20*12) < sysdate;

select to_char(123.456, '$9,99') from dual;
select to_char(123.456, '$0009,99') from dual;

select to_number('$1,23.456', '$90,90.9090') from dual;

SELECT to_date('1979-07-23', 'YYYY-MM-dd') from dual;
select TO_TIMESTAMP ('1979-07-23 17:50:51', 'YYYY-MM-dd HH24:mi:ss') FROM DUAL;

update stud set regdate = TO_TIMESTAMP ('1979-07-23 17:50:51', 'YYYY-MM-dd HH24:mi:ss');

ALTER table stud add(regdate TIMESTAMP);

select to_char(sysdate, 'yyyy') from dual;

select to_char(sysdate, 'dy') from dual; --요일표시

























