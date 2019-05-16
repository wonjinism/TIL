package io.zerone.moneydiary.VO;

public class Transaction {
	public String accountSeq;
	public String id;
	public String title;
	public String content;
	public String flag;
	public int amount;
	public String eventDate;

	public Transaction() {
	}

	public Transaction(String accountSeq, String id, String title, String content, String flag, int amount,
			String eventDate) {
		this.accountSeq = accountSeq;
		this.id = id;
		this.title = title;
		this.content = content;
		this.flag = flag;
		this.amount = amount;
		this.eventDate = eventDate;
	}

	public String getAccountSeq() {
		return accountSeq;
	}

	public void setAccountSeq(String accountSeq) {
		this.accountSeq = accountSeq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	@Override
	public String toString() {
		return "Transaction [accountSeq=" + accountSeq + ", id=" + id + ", title=" + title + ", content=" + content
				+ ", flag=" + flag + ", amount=" + amount + ", eventDate=" + eventDate + "]";
	}

}
