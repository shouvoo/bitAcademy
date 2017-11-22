
--nvl(기존값, 변할값) null을 체크해 준다
select sid, kor, nvl(eng, 0), nvl(mat, 10),
kor + nvl(eng, 0) + nvl(mat, 10) as 합 
from exam;

--decode 비교할 기본값을 넣어주고 대상 값, 바뀔값 을 순서대로 넣어준다
select stud.*,
decode(grade, 1, '잡몹', 2, '현구몹', 3, '반장몹') as decode
from stud;

select stud.*,
case
    when grade = 1 then '결혼'
    when grade = 2 then '결혼'
    when grade = 3 then '결혼'
    else '미결혼'
end as "case"
from stud;

select exam.*,
case
    when kor >= 80 then '우수'
    when kor >= 70 then '보통'
    else '탈락'
end as res
from exam;

select exam.*,
case
    when (kor + nvl(eng, 0) + nvl(mat, 0)) / 3 >= 90 then '수'
    when (kor + nvl(eng, 0) + nvl(mat, 0)) / 3 >= 80 then '우'
    when (kor + nvl(eng, 0) + nvl(mat, 0)) / 3 >= 70 then '미'
    else '탈락'
end as res,
trunc((kor + nvl(eng, 0) + nvl(mat, 0)) / 3) as 평균
from exam;

--서브쿼리
select tt.*,
case
    when avg >= 90 then '수'
    when avg / 3 >= 80 then '우'
    when avg / 3 >= 70 then '미'
    else '탈락'
end as res,
trunc((kor + nvl(eng, 0) + nvl(mat, 0)) / 3) as 평균
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














