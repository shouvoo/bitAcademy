
--nvl(������, ���Ұ�) null�� üũ�� �ش�
select sid, kor, nvl(eng, 0), nvl(mat, 10),
kor + nvl(eng, 0) + nvl(mat, 10) as �� 
from exam;

--decode ���� �⺻���� �־��ְ� ��� ��, �ٲ� �� ������� �־��ش�
select stud.*,
decode(grade, 1, '���', 2, '������', 3, '�����') as decode
from stud;

select stud.*,
case
    when grade = 1 then '��ȥ'
    when grade = 2 then '��ȥ'
    when grade = 3 then '��ȥ'
    else '�̰�ȥ'
end as "case"
from stud;

select exam.*,
case
    when kor >= 80 then '���'
    when kor >= 70 then '����'
    else 'Ż��'
end as res
from exam;

select exam.*,
case
    when (kor + nvl(eng, 0) + nvl(mat, 0)) / 3 >= 90 then '��'
    when (kor + nvl(eng, 0) + nvl(mat, 0)) / 3 >= 80 then '��'
    when (kor + nvl(eng, 0) + nvl(mat, 0)) / 3 >= 70 then '��'
    else 'Ż��'
end as res,
trunc((kor + nvl(eng, 0) + nvl(mat, 0)) / 3) as ���
from exam;

--��������
select tt.*,
case
    when avg >= 90 then '��'
    when avg / 3 >= 80 then '��'
    when avg / 3 >= 70 then '��'
    else 'Ż��'
end as res,
trunc((kor + nvl(eng, 0) + nvl(mat, 0)) / 3) as ���
from
(select exam.*, 
round((kor + nvl(eng,0) + nvl(eng,0)) / 3, 2) as avg
from exam) tt;

select max(kor), min(kor), sum(kor), avg(kor), count(kor) 
from exam;

select max(kor), max(eng), max(mat), min(eng)
from exam;


select title, max(kor) from exam group by title;

select count(id), count(sid) from exam;

select title, avg(kor) 
from exam 
group by title;

select title, avg(kor) 
from exam 
where kor >= 50
group by title;

select title, avg(kor) 
from exam  
group by title
having avg(kor) >= 70;

select
title, max(kor), max(eng), max(mat)
from exam
where (kor + eng + mat) / 3 >= 70
group by title
order by title;














