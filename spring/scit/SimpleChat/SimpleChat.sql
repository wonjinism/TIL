DROP TABLE chat;
DROP TABLE room;
DROP TABLE user_info;
DROP SEQUENCE room_seq;
DROP SEQUENCE chat_seq;
DROP SEQUENCE user_seq;

CREATE SEQUENCE room_seq;
CREATE SEQUENCE chat_seq;
CREATE SEQUENCE user_seq;

CREATE TABLE user_info (
user_seq NUMBER
, user_id VARCHAR2(20) PRIMARY KEY
, user_password VARCHAR(20)
, user_regdate DATE
, user_level NUMBER(1) DEFAULT 1
);

CREATE TABLE room (
	room_seq NUMBER	PRIMARY KEY
    , user_id VARCHAR(20) REFERENCES user_info
	, NAME VARCHAR(200)
	, indate DATE
    , user_count NUMBER default 0
);

CREATE TABLE chat (
	chat_seq NUMBER PRIMARY KEY
	, room_seq	 NUMBER REFERENCES room
    , user_id VARCHAR(20)
    , message VARCHAR(1000)
    , indate DATE
);

INSERT INTO user_info (
	USER_SEQ
	, USER_ID
	, USER_PASSWORD
    , USER_REGDATE
    , USER_LEVEL
) VALUES (
     user_seq.nextval
	, 'admin'
	, 'admin'
	, SYSDATE
	, 0
);

commit;

SELECT * FROM user_info;