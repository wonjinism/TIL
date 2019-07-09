package io.zerone.guestbook.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "guestbook")
public class Guestbook {
	/* 
	 * AUTO : DB 종류에 따라 JPA가 알맞은 것을 선택합니다. ( Oracle은 SEQUENCE , MySQL은 IDENTITY를 선택 )
	 * IDENTITY : 기본 키 생성을 데이터베이스에 위임합니다. ( MySQL, PostgreSQL, SQL Server, DB2에서 사용 가능 )
	 * SEQUENCE : 데이터베이스 시퀀스를 사용해서 기본 키를 할당합니다. ( Oracle, PostgreSQL, DB2, H2 )
	 * TABLE : 키 생성 전용 테이블을 만들어서 sequence처럼 사용합니다.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer no;

	// 문자 길이 제약 조건으로 기본 값은 255이며, String 타입에만 적용 가능
	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(name = "pwd", nullable = false, length = 64)
	private String pwd;

	@Column(name = "message", nullable = false)
	private String message;

	/*
	 * TemporalType.DATE         : 날짜, 데이터베이스 date 타입과 매핑                     (ex) 2013–10–11
	 * TemporalType.TIME         : 시간, 데이터베이스 time 타입과 매핑                     (ex) 11:11:11
	 * TemporalType.TIMESTAMP : 날짜와 시간, 데이터베이스 timestamp(datetime) 타입과 매핑   (ex) 2013–10–11 11:11:11
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "reg_date", nullable = false)
	private Date regDate;

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}