drop sequence todoSeq;
drop table todo;

CREATE SEQUENCE todoSeq;

CREATE TABLE todo (
id NUMBER(5) PRIMARY KEY,
title VARCHAR2(255) NOT NULL,
name VARCHAR2(100) NOT NULL,
seq NUMBER(1) NOT NULL,
type VARCHAR2(20) DEFAULT 'TODO',
regdate DATE DEFAULT SYSDATE
);

commit;

select * from todo;