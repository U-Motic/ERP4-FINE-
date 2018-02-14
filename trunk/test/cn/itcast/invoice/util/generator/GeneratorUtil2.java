package cn.itcast.invoice.util.generator;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 * 
 * @author saverio
 *
 */
public class GeneratorUtil2 {
	
	final String rep="import pkg+.vo. +big+ QueryModel;";
	final String per="	}";
	final String exc="I/O Exception";
	final String file="File Not Found";
	final String qwe1="		<property name=sessionFactorb ref= sessionFactory />";
	final String qwe2=	"<bean id=small Ebiclass=+pkg.business.ebo+big+Ebo\">;";
	final String qwe3="	<bean id=\\\"\"+small+\"Dao\\\" class=\\\"\"+pkg+\".dao.impl.\"+big+\"DaoImpl\\\">\";";
	final String qwe4="		<property name=\\\"\"+small+\"Dao\\\" ref=\\\"\"+small+\"Dao\\\"/>";
	final String qwe5="\"	</bean>\"";
	final String qwe6="\"	<bean id=\\\"\"+small+\"Action\\\" class=\\\"\"+pkg+\".web.\"+big+\"Action\\\" scope=\\\"prototype\\\">\"";
			
	private Class clazz;
	private String pkg;
	private String rootDir;
	private String big;
	private String small;
	private String little;
	
	
	/**
	 * this method write on a file
	 * @param bw
	 * @throws IOException
	 */
	public void funzion5(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.write(rep);
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write(per);
		bw.newLine();
		bw.write(qwe3);
		bw.newLine();
	}
	
	
	
	
	/**
	 * ths method writes on a file
	 * @param bw
	 * @throws IOException
	 */
	public void funzion8(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.write(rep);
		bw.write(per);
		bw.newLine();
		bw.write(qwe3);
		bw.newLine();
		funzion7(bw);
	}
	
	
	
	/**
	 * this method writes on a file
	 * @param bw
	 * @throws IOException
	 */
public void funzion7(BufferedWriter bw) throws IOException {
		bw.write(qwe6);
		bw.newLine();
		bw.newLine();
		bw.write(rep);
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write(per);
		bw.newLine();
		bw.write(qwe3);
		bw.newLine();funzion8(bw);
	}
	

/**
 * this method writes on a file
 * @param bw
 * @throws IOException
 */
public void funzion6(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.write(rep);
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write(per);
		bw.newLine();
		bw.newLine();
		bw.flush();
		
	}
}
