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

ALTER table exam add(kor number); --�÷� �߰��ϱ�

ALTER table exam modify(reg_date timestamp); --���̺� date �Ӽ� ����

ALTER table exam RENAME COLUMN reg_date to join_date; --�Ӽ��̸��� ����

ALTER table exam DROP COLUMN join_date; -- �÷��Ѱ��� ����

ALTER table exam add(reg_date timestamp);

INSERT into exam(id, reg_date, title) values(1, '2017/08/23 17:20:35', 'semi'); --�÷��� ���� �־��ش�

INSERT into exam(id, reg_date, title) values(2, '2017/08/23 17:30:35', 'final');

insert all --�������� ������ ����
into exam(id, reg_date, kor) values(3, '2017/08/24 17:36:35', 88)
into exam(id, reg_date, title) values(4, '2017/08/25 17:37:35', 'final')
into exam(id, reg_date, title) values(5, '2017/08/26 17:38:35', 'final')
SELECT * from dual;















