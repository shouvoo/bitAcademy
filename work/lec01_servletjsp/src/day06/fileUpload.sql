create table t17_board_file
(
    file_no number primary key,
    no number(6) not null,
    file_path varchar2(20) not null,
    ori_name varchar2(200) not null,
    system_name varchar2(200) not null,
    file_size number not null
);

create sequence s17_board_file_no;
