UPDATE exam SET KOR = 70; --���̺� kor ���� ��� 70���� ����
UPDATE exam SET KOR = 90 where id > 3; --���̵� 3���� ũ�� 90���� ����
UPDATE exam SET KOR = 77, reg_date = '2010-03-30' where id < 3; --���̵� 3���� ������ kor, reg_date ������ ����
select * from exam; --�ش����̺��� ������ �����ش�
delete from exam where id = 4; --���̵� 4�� �÷��� ����ڴ�

alter table exam add(no number);
alter table exam add(sid number, eng number, mat number);
alter table exam drop column no;
delete from exam where title = '�Ѱ���';

update exam set title = '������' where id = 2;
update exam set title = '������' where id = 4;
update exam set title = '��ȿ��' where id = 5;


ALTER table exam DROP COLUMN sid; -- �÷��Ѱ��� ����
ALTER table exam add(sid VARCHAR2(100)); --�÷� �߰��ϱ�
insert into exam(id, title) values(8, 'final');

insert all --�������� ������ ����
into exam(id, title, kor, reg_date, eng, mat, sid) values(1, 'final', 75, '2017/08/24 17:36:35', 54, 88, '������')
into exam(id, title, kor, reg_date, eng, mat, sid) values(2, 'final', 65, '2017/08/24 17:36:35', 89, 99, '������')
into exam(id, title, kor, reg_date, eng, mat, sid) values(3, 'semi', 65, '2017/08/24 17:36:35', 98, 65, '��ȿ��')
into exam(id, title, kor, reg_date, eng, mat, sid) values(4, 'final', 85, '2017/08/24 17:36:35', 81, 87, '�Ѱ���')
into exam(id, title, kor, reg_date, eng, mat, sid) values(5, 'semi', 95, '2017/08/24 17:36:35', 85, 89, '���̺�')
SELECT * from dual;

aLTER table exam RENAME COLUMN reg_date to regdate; --�Ӽ��̸��� ����

UPDATE exam set kor = kor + 10 where id > 2;
UPDATE exam set sid = sid + 10 where id > 2;
UPDATE exam set eng = eng + 10 where id > 2;
UPDATE exam set mat = mat + 10 where id > 2;
--�� ������ ���ٷ� �Ҽ��� ����
UPDATE exam set kor = kor + 10, sid = sid + 10, eng = eng + 10, mat = mat + 10 where sid = '��ȿ��' or sid = '�Ѱ���' or sid = '���̺�';

delete from exam where title = '������';

alter table exam rename COLUMN id to no; -- �÷� ���� ����
alter table exam add(sid varchar2(50), eng number, sid number, mat number); -- �÷��߰�
alter table exam rename column reg_date to regdate;-- �÷����� ����
alter table exam modify (regdate date);-- ����Ʈ���� �־��ش�

select sid, kor, eng, mat from exam; --������ ���� �����ش�
select sid, kor - 10, eng * 2, mat / 3 from exam; --������ ���� �������ؼ� �����ش�
select kor + eng + mat from exam; -- ����
select (kor + eng + mat) / 3 from exam; -- ���

select kor, eng, mat,
kor + eng+mat as sum, (kor + eng + mat) / 2 as avg from exam; -- ������ ����� �����ش�

select kor, eng, mat,
kor + eng+mat as sum, (kor + eng + mat) / 2 as ��� from exam; -- avg �ѱ۷� ��ü�ȴ� 

select kor, eng, mat,
kor + eng+mat as sum, (kor + eng + mat) / 2 as "�� ��" from exam; -- avg �ѱ۷� ��ü�ȴ� �� �ѱ��� ĭ�� ���� ������ "" �ֵ���ǥ�� �����ش� "�� ��" 
-- �� �� - error , "��  ��" - complete

SELECT sid || title from exam; --���� ������ ������ش� 
SELECT title || '��' from exam;
SELECT title || "��" from exam; -- ū����ǥ�� ġ�� �÷��̳� ��ü�� ���Ѵ� ���ڷ� �ν����� �ʴ´� ���ڴ� ''

select distinct title from exam; --�ߺ��� ���� ������� �ʴ´�

select * from exam;

select * from exam where kor = 77;
select * from exam where kor >= 77;
select * from exam where kor <= 77;
select * from exam where kor > 77;
select * from exam where kor < 77;
select * from exam where kor <> 77;

select * from exam where title like '%��%'; -- ���̵�Ű(%) �� �־��ָ� '��' �� ���Ե� ���� ������ش�
-- ���̵�Ű�� �յڷ� ������ %��% �ش� ���ڰ� ���Ե� ���� ������ ���ϵ� Ű�� %�� ���ڸ��� "��"�� ������ ���� ��� ���ϵ� Ű�� ��% �ڿ� ������ "��"�� �����ϴ� ���� ���
-- ���̵�� ���ô� like �� ���

select * from exam where eng = 89 or eng = 91; --���������� 89, 91 �� ���� ã�� ���
select * from exam where eng in(89, 91); --���������� 89, 91 �� ���� ã�� ��� (���ٰ� ����)


select * from exam where eng >= 95 and eng <= 110;--���������� 95���� ũ�ų� 110 ���� �������� ã�� ���
select * from exam where eng between 95 and 110;--���������� 95���� ũ�ų� 110 ���� �������� ã�� ��� (���ٰ� ����)

select * from exam where kor <> 77; --77���� �ƴѰ��� ��� ���
select * from exam where not kor = 77; --77���� �ƴѰ��� ��� ���

select * from exam where title is null;--null �ΰ��� ã������ is �� ���
select * from exam where title is not null;--null �� ���Ѱ��� ã������ is �� ���

select * from exam ORDER by eng asc; -- ������������ ������ ���ش� eng �ڿ� asc �� �������� asc(����������) �⺻���� �����Ǿ��ֱ� ����
select * from exam ORDER by eng desc; -- ������������ ������ ���ش�
select * from exam ORDER by title; -- ���ڿ��ϰ�� ������ ���� ������ ���ش�
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

select '�Ʊ���' from dual;

select round(123.456, -1) from dual;
select round(987.654, -2) from dual;

select trunc(687.654) from dual;
 
select mod(15, 7) from dual;
select upper('aBcD') from dual;
select lower('aBcD') from dual;
select initcap('aBcD') from dual;
select instr('aBcD gfch', 'c') from dual;--���ڿ����� c�� ������ �˷��ش�
select instr('aBcD gfch', 'c', 5) from dual;--���ڿ� 5��°����c�� ã�� ������ �˷��ش�
select instr('aBcD gfch', 'c', 5, 2) from dual;--���ڿ����� 5��°����c�� ã�� c�� ������ �ִٸ� ù��° c�� �ǳʶ�� 2��° c�� ������ �˷��ش�

select substr('aBcD gfch', 2) from dual; -- 2��° �������� ���δ� ���
select substr('aBcD gfch', 2, 3) from dual; -- 2��° �������� 2���� �������� 3�� ���� �ڸ� ���� ���δ� ���
select substr('aBcD gfch', 2, 1) from dual; -- 2��° �������� 2���� �������� 1�� ���� �ڸ� ���� ���δ� ���

--890320-1234567
select substr('����', mod(substr('890320-1234567', 8, 1), 2) + 1, 1) || '��' as gender from dual;

select lpad('abc', 20, '#') from dual; --20���� ĭ�� abc�̿ܿ� ���ʺ���# ���� ä���ش�
select rpad('abcefghijk', 20, '#') from dual; --20���� ĭ�� abc�̿ܿ� �����ʺ���# ���� ä���ش�
select rpad('abcefghijk', 5, '#') from dual; -- ���ڰ� �����Ǹ� ������ ĭ�� ���ڸ�ŭ�� �����ش�

select ltrim('################ abcefghijk #################', '#') from dual; --���ʿ� �ִ� #�� �����ش�
select rtrim('################ abcefghijk #################', '#') from dual; --�����ʿ� �ִ� #�� �����ش�
select trim('    abc    efg   hijk    ') from dual;--��ĭ�� �����ش� �� ������ �Ǿհ� �ǵ��� ���鸸 �����ش�
select length('abcefghijk') from dual;

select sysdate from dual; -- ����� ���
select sysdate + 10000 from dual;

select reg_date, sysdate, 
MONTHS_BETWEEN (reg_date, sysdate) from exam;

select add_months(sysdate, -240) from dual;
select BIRTH from stud;

select last_day(regdate) from exam;

select regdate, next_day(regdate, '��') from exam;


ALTER table stud add(birth VARCHAR2(100)); --�÷� �߰��ϱ�
insert all
into stud(id, name, birth) values(1, '������', '1979/08/24 17:36:35')
into stud(id, name, birth) values(1, '������', '1980/09/24 17:36:35')
into stud(id, name, birth) values(1, '��ȿ��', '1960/07/24 17:36:35')
into stud(id, name, birth) values(1, '�Ѱ���', '1990/01/24 17:36:35')
into stud(id, name, birth) values(1, '���̺�', '1999/05/24 17:36:35')
SELECT * from dual;

UPDATE stud set birth = '1980/09/24' where name = '������';
UPDATE stud set birth = '1960/07/24' where name = '��ȿ��';
UPDATE stud set birth = '1990/01/24' where name = '�Ѱ���';
UPDATE stud set birth = '1999/05/24' where name = '���̺�';

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

select to_char(sysdate, 'dy') from dual; --����ǥ��

























