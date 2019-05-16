drop sequence bookreview_seq;
drop table bookreview;

-- 테이빚病 작성하는 코??
create sequence bookreview_seq;

create table bookreview(
    seq number Primary key
    , name varchar2(20) not null
    , regdate date not null
    , review varchar2(2000) not null
);

commit;

-- 시퀀스 작성하는 코??