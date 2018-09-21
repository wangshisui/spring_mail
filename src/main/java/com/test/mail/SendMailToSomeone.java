package com.test.mail;

public class SendMailToSomeone {

public static void main(String []args){
		SendMailToSomeone sts=new SendMailToSomeone();
		sts.send("邮件", "大家好", "luoxs25305@hundsun.com",
				"1160632689@qq.com", "rbzkdgwbrdgmffid", "smtp.qq.com");
	}
	/**
	 * 发送电子邮件到指定的信箱
	 * @param title 邮件标题 
	 * @param mailbody 邮件内容
	 * @param sendTo 发送给谁
	 * @param from 从哪些发送 
	 * @param passwd 密码 
	 * @param sendStmp 发送邮件的smtp
	 */
	public void send(String title,String mailbody,String sendTo,String from,String passwd,String sendStmp){
		MysendMail themail = new MysendMail(sendStmp);
		themail.setNeedAuth(true);
		if(themail.setSubject(title) == false) return;
		if(themail.setBody(mailbody) == false) return;
		if(themail.setTo(sendTo) == false) return;
		if(themail.setFrom(from) == false) return;
		themail.setNamePass("1160632689", passwd);
		if(themail.sendout() == false) return;
	}
}
