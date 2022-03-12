package scs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Bankeg bank=(Bankeg)factory.getBean("b");
		bank.setId(1);
		bank.setName("ICICI");
		System.out.println(bank.getId()+" "+bank.getName());
	}

}
