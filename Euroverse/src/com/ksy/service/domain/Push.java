package com.ksy.service.domain;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;


public class Push {
	
	private String pushId; //push_id
	private String pushType; //push_type
	private String refId; //ref_id
	private Timestamp pushDate; //push_date
	private String receiverId; //receiver_id
	private String read; //read
	private int cmtCount; //cmt_count
	// ����� ���� field
	private int unread; //�� ���� �˸� ����
	private String pushMsg; //view�ܿ� ����� �˸� �޽���
	private String pushTime; //ss�� ��, mm�� ��, hh�ð� ��, yyyy.mm.dd  
	private String title; //�Խñ� ����, ��� ����, �÷��� �̸�
	private String boardName;
	
	public String getPushId() {
		return pushId;
	}
	public void setPushId(String pushId) {
		this.pushId = pushId;
	}
	public String getPushType() {
		return pushType;
	}
	public void setPushType(String pushType) {
		this.pushType = pushType;
	}
	public String getRefId() {
		return refId;
	}
	public void setRefId(String refId) {
		this.refId = refId;
	}
	public Timestamp getPushDate() {
		return pushDate;
	}
	public void setPushDate(Timestamp pushDate) {
		this.pushDate = pushDate;
	}
	public String getReceiverId() {
		return receiverId;
	}
	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}
	public String getRead() {
		return read;
	}
	public void setRead(String read) {
		this.read = read;
	}
	public int getCmtCount() {
		return cmtCount;
	}
	public void setCmtCount(int cmtCount) {
		this.cmtCount = cmtCount;
	}
	public int getUnread() {
		return unread;
	}
	public void setUnread(int unread) {
		this.unread = unread;
	}
	public String getPushMsg() {
		if(refId == null || refId.equals("")) {
			return pushMsg;
		} else {
			if(pushType.trim().equals("R") || pushType.trim().equals("C")) {
				String brief = (title.length()>12)?title.substring(0, 12)+"...":title;
				return  "["+brief+"]�� ����� ("+cmtCount+")�� �޷Ƚ��ϴ�.";
			} else if(pushType.trim().equals("I")) {
				String brief = (title.length()>12)?title.substring(0, 12)+"...":title;
				return "["+brief+"] �÷��ʿ� �ʴ�Ǿ����ϴ�.";
			} else if(pushType.trim().equals("A")) {
				String brief = (title.length()>12)?title.substring(0, 12)+"...":title;
				return "["+brief+"]���࿡ ��û�� ���Խ��ϴ�.";
			} else if(pushType.trim().equals("P")){
				return pushMsg;
			} else {
				return  " "+ refId+"�� �˸��� �ֽ��ϴ�. ";
			}
		}
	
	}
	public void setPushMsg(String pushMsg) {
		this.pushMsg = pushMsg;
	}
	
	public String getPushTime() {
		long now = System.currentTimeMillis(); 
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy.MM.dd");
		long pDate;
		long diff;
		if(pushDate != null) {
			 pDate = pushDate.getTime();
			 diff = now-pDate;
			 long sec = diff/1000; //�� ����
			 long min = diff/(60*1000); //�� ����
			 long hour = diff/(1000*60*60); //�ð� ����
			 
			 if( sec == 0 ) {
				 return "1�� ��";
			 } else if( sec < 60 ) {
				 return sec+"�� ��";
			 } else if(min < 60) {
				 return min+"�� ��";
			 } else if(hour < 24) {
				 return hour+"�ð� ��";
			 } else {
				 return dayTime.format(pDate);
			 }
		} else {
			return pushTime;
		}
		
	}
	public void setPushTime(String pushTime) {
		this.pushTime = pushTime;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	@Override
	public String toString() {
		return "Push [pushId=" + pushId + ", pushType=" + pushType + ", refId=" + refId + ", pushDate=" + pushDate
				+ ", receiverId=" + receiverId + ", read=" + read + ", cmtCount=" + cmtCount + ", unread=" + unread
				+ ", pushMsg=" + pushMsg + ", pushTime=" + pushTime + ", title=" + title + ", boardName=" + boardName
				+ "]";
	}

}