--------------------------------------------------------
--  파일이 생성됨 - 목요일-9월-07-2017   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table STUD
--------------------------------------------------------

  CREATE TABLE "STUD" ("ID" VARCHAR2(50), "NAME" VARCHAR2(100), "JUMIN" VARCHAR2(100), "GRADE" VARCHAR2(100), "PW" NUMBER, "PID" VARCHAR2(100), "FRIEND" VARCHAR2(100))
--------------------------------------------------------
--  DDL for Table EXAM
--------------------------------------------------------

  CREATE TABLE "EXAM" ("ID" NUMBER, "TITLE" VARCHAR2(50), "KOR" NUMBER, "REGDATE" TIMESTAMP (6), "ENG" NUMBER, "MAT" NUMBER, "SID" VARCHAR2(100))
--------------------------------------------------------
--  DDL for Table PROFESSOR
--------------------------------------------------------

  CREATE TABLE "PROFESSOR" ("PID" VARCHAR2(100), "NAME" VARCHAR2(100), "TEL" VARCHAR2(100))
REM INSERTING into STUD
SET DEFINE OFF;
Insert into STUD (ID,NAME,JUMIN,GRADE,PW,PID,FRIEND) values ('aaa','김태희',null,'1',111,'p11','bbb');
Insert into STUD (ID,NAME,JUMIN,GRADE,PW,PID,FRIEND) values ('bbb','전지현',null,'2',222,'p22','ddd');
Insert into STUD (ID,NAME,JUMIN,GRADE,PW,PID,FRIEND) values ('ccc','이효리',null,'1',333,'p33',null);
Insert into STUD (ID,NAME,JUMIN,GRADE,PW,PID,FRIEND) values ('ddd','한가인',null,'3',444,'p44','ccc');
Insert into STUD (ID,NAME,JUMIN,GRADE,PW,PID,FRIEND) values ('eee','아이비',null,'2',555,'p55','ccc');
Insert into STUD (ID,NAME,JUMIN,GRADE,PW,PID,FRIEND) values ('fff','김태희',null,'1',null,'p11','eee');
Insert into STUD (ID,NAME,JUMIN,GRADE,PW,PID,FRIEND) values ('ggg','전지현',null,'3',null,'p22','ggg');
Insert into STUD (ID,NAME,JUMIN,GRADE,PW,PID,FRIEND) values ('hhh','전지현',null,'1',null,'p33','hhh');
Insert into STUD (ID,NAME,JUMIN,GRADE,PW,PID,FRIEND) values ('iii','김태희',null,'3',null,'44','hhh');
Insert into STUD (ID,NAME,JUMIN,GRADE,PW,PID,FRIEND) values ('jjj','이효리',null,'2',null,'p11','iii');
REM INSERTING into EXAM
SET DEFINE OFF;
Insert into EXAM (ID,TITLE,KOR,REGDATE,ENG,MAT,SID) values (1,'final',75,to_timestamp('17/10/11 17:36:35.000000000','RR/MM/DD HH24:MI:SSXFF'),54,88,'aaa');
Insert into EXAM (ID,TITLE,KOR,REGDATE,ENG,MAT,SID) values (2,'final',65,to_timestamp('17/02/24 17:36:35.000000000','RR/MM/DD HH24:MI:SSXFF'),89,99,'bbb');
Insert into EXAM (ID,TITLE,KOR,REGDATE,ENG,MAT,SID) values (3,'semi',65,to_timestamp('17/01/01 17:36:35.000000000','RR/MM/DD HH24:MI:SSXFF'),98,65,'ccc');
Insert into EXAM (ID,TITLE,KOR,REGDATE,ENG,MAT,SID) values (4,'final',85,to_timestamp('17/05/22 17:36:35.000000000','RR/MM/DD HH24:MI:SSXFF'),81,87,'ddd');
Insert into EXAM (ID,TITLE,KOR,REGDATE,ENG,MAT,SID) values (5,'null',95,to_timestamp('17/06/24 17:36:35.000000000','RR/MM/DD HH24:MI:SSXFF'),85,89,'eee');
Insert into EXAM (ID,TITLE,KOR,REGDATE,ENG,MAT,SID) values (6,'semi',54,to_timestamp('17/08/19 17:36:35.000000000','RR/MM/DD HH24:MI:SSXFF'),null,null,'fff');
Insert into EXAM (ID,TITLE,KOR,REGDATE,ENG,MAT,SID) values (7,'null',87,to_timestamp('17/06/13 17:36:35.000000000','RR/MM/DD HH24:MI:SSXFF'),null,null,'ggg');
Insert into EXAM (ID,TITLE,KOR,REGDATE,ENG,MAT,SID) values (8,null,54,to_timestamp('17/01/21 17:36:35.000000000','RR/MM/DD HH24:MI:SSXFF'),null,null,'hhh');
REM INSERTING into PROFESSOR
SET DEFINE OFF;
Insert into PROFESSOR (PID,NAME,TEL) values ('p11','덤블도어','010-1111-2222');
Insert into PROFESSOR (PID,NAME,TEL) values ('p22','박교수','010-2222-3333');
Insert into PROFESSOR (PID,NAME,TEL) values ('p33','차교수','010-3333-4444');
Insert into PROFESSOR (PID,NAME,TEL) values ('p44','김교수','010-5454-9898');
Insert into PROFESSOR (PID,NAME,TEL) values ('p55','구교수','010-7878-5454');
