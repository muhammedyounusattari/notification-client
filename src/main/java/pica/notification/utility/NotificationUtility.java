package pica.notification.utility;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")
public class NotificationUtility {
	
	@Value("${host}")
	public String SMTP_HOST_NAME;
	
	@Value("${port}")
	public String SMTP_PORT;
	
	@Value("${ssl.factory}")
	public String SSL_FACTORY;
	
	public  Properties setProperties() {
		Properties props = new Properties();
		props.put("mail.smtp.host", SMTP_HOST_NAME);
		props.put("mail.smtp.auth", "true");
		props.put("mail.debug", "true");
		props.put("mail.smtp.port", SMTP_PORT);
		props.put("mail.smtp.socketFactory.port", SMTP_PORT);
		props.put("mail.smtp.socketFactory.class", SSL_FACTORY);
		props.put("mail.smtp.socketFactory.fallback", "false");
		
		
		return props;
	}

}

//host = smtp.gmail.com
//port = 465
//msg = Test Message Contents
//subj = A test from gmail
//from.address = muhammedyounusattari@gmail.com
//ssl.factory = javax.net.ssl.SSLSocketFactory
//sendTo = muhammedyounusattari@gmail.com