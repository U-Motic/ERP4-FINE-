package cn.itcast.invoice.util.generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * this class is a util generator
 *
 */
public class GeneratorUtil {
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
	 * this method is used to test
	 * @param clazz
	 * @throws Exception
	 */
	public GeneratorUtil(Class clazz)throws Exception{
		this.clazz = clazz;
		//-1.Ã¦â€¢Â°Ã¦ï¿½Â®Ã¥Ë†ï¿½Ã¥Â§â€¹Ã¥Å’â€“
		//5.Ã§â€�Å¸Ã¦Ë†ï¿½Ebi
		generatorEbi();
		//6.Ã§â€�Å¸Ã¦Ë†ï¿½Ebo
		generatorEbo();
		//7.Ã§â€�Å¸Ã¦Ë†ï¿½Action
		generatorAction();
		//8.Ã§â€�Å¸Ã¦Ë†ï¿½applicationContext.xml
		generatorApplicationContextXml();
		//9.Ã§â€�Å¸Ã¦Ë†ï¿½struts.xml
	}
	

	private void fun3(BufferedWriter bw) throws IOException {
		
		bw.newLine();
		bw.write(qwe1);
		bw.newLine();
		bw.write("");
		bw.newLine();
		bw.write(qwe5);
		bw.newLine();
		bw.flush();
	
		
	}
	
	
	private void fun2(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.write("");
		bw.newLine();
		bw.write("");
		bw.newLine();
		bw.write(qwe5);
		bw.newLine();
		bw.write(qwe3);
		bw.newLine();
		bw.write(qwe4);
		fun3(bw);
	}
	
	/**
	 * 
	 * @param bw
	 * @throws IOException
	 */
	private void fun1(BufferedWriter bw) throws IOException {
		bw.write(qwe2);
		bw.newLine();
		bw.write(qwe6);
		bw.newLine();
		bw.write("");
		bw.newLine();
		bw.write(qwe3);
		bw.newLine();
		bw.write(qwe4);
		bw.newLine();
		bw.write(qwe5);
		fun2(bw);
	}
	
	//8.Ã§â€�Å¸Ã¦Ë†ï¿½applicationContext.xml
	/**
	 * 
	 * @param bw
	 * @throws Exception
	 */
	private void generatorApplicationContextXml() throws Exception{
		//1.Ã¥Ë†â€ºÃ¥Â»ÂºÃ¦â€“â€¡Ã¤Â»Â¶
		File f = null;
		BufferedWriter bw= null;
		bw = new BufferedWriter(new FileWriter(f));
		try {
		f = new File("resources/applicationContext-"+small+".xml");
		if(f.exists()){
			return;
		}
		f.createNewFile();
		fun1(bw);
		}
		catch (java.io.FileNotFoundException e1) {
           System.out.println("Something was wrong!");
          } 
		 finally {
	           if (bw != null) {
	             try {
	               bw.close(); // OK
	             } catch (java.io.IOException e3) {
	               System.out.println("Something Wrong!");
	             }
	           }
	         }
		
		
		
	}
	//7.Ã§â€�Å¸Ã¦Ë†ï¿½Action
	
	
	
	/**
	 * 
	 * @param bw
	 * @throws IOException
	 */
	private void funz1(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.write(rep);
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write(rep);
		bw.newLine();
		bw.write(qwe1);
		bw.newLine();
		bw.newLine();
		funz3(bw);
	}
	/**
	 * 
	 * @param bw
	 * @throws IOException
	 */
	private void funz3(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.write("");
		bw.newLine();
		bw.write("");
		bw.newLine();
		bw.write(qwe5);
		bw.newLine();
		bw.write(qwe3);
		bw.newLine();
		bw.write(qwe3);
		bw.newLine();
		bw.write(qwe6);
		bw.newLine();
		funz4(bw);
	}
	/**
	 * 
	 * @param bw
	 * @throws IOException
	 */
	private void funz5(BufferedWriter bw) throws IOException {

		bw.newLine();
		bw.write(qwe3);
		bw.write(qwe4);
		bw.write(qwe6);
		bw.write("");
		bw.newLine();
		funz6(bw);
	}
	/**
	 * 
	 * @param bw
	 * @throws IOException
	 */
	private void funz4(BufferedWriter bw) throws IOException{
		bw.write(per);
		bw.newLine();
		bw.write(rep);
		bw.newLine();
		bw.write("");
		bw.newLine();
		bw.write(qwe5);
		bw.newLine();	
		funz5(bw);
	}
	/**
	 * 
	 * @param bw
	 * @throws IOException
	 */
	private void funz8(BufferedWriter bw) throws IOException {
		bw.write(qwe1);
		bw.newLine();
		bw.newLine();
		bw.write(qwe6);
		bw.newLine();
		bw.write(qwe4);
		bw.newLine();
		bw.write(qwe5);
		bw.newLine();
		bw.write(qwe3);
		bw.newLine();
		funz7(bw);
	}
	/**
	 * 
	 * @param bw
	 * @throws IOException
	 */
	private  void funz7(BufferedWriter bw) throws IOException {
		bw.write(qwe1);
		bw.newLine();
		bw.write(qwe1);
		bw.newLine();
		bw.newLine();
		bw.write(qwe6);
		bw.newLine();
		
	}
	/**
	 * 
	 * @param bw
	 * @throws IOException
	 */
	private void funz6(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write(qwe6);
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.flush();
		
	}
	
	/**
	 * @throws Exception
	 */
	private void generatorAction() throws Exception{
		//1.Ã¥Ë†â€ºÃ¥Â»ÂºÃ¦â€“â€¡Ã¤Â»Â¶
		File f = null;
		BufferedWriter bw= null;
		try {
		f = new File(rootDir+"/web/"+big+"Action.java");
		if(f.exists()){
			return;
		}
		f.createNewFile();
		bw = new BufferedWriter(new FileWriter(f));
		funz1(bw);
		}
		catch (java.io.FileNotFoundException e1) {
			final String excInt=file;
            System.out.println(excInt);
          } 
		 finally {
	           if (bw != null) {
	             try {
	               bw.close(); // OK
	             } catch (java.io.IOException e3) {
			       System.out.println(exc);
	             }
	           }
	         }
	}
	//6.Ã§â€�Å¸Ã¦Ë†ï¿½Ebo
	
	
	
	private void funzi1(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.write(rep);
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write(rep);
		bw.newLine();
		bw.newLine();
		bw.newLine();
		funzi3(bw);
	}
	

	private void funzi3(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.write(qwe1);
		bw.newLine();
		bw.newLine();
		bw.write(qwe6);
		bw.newLine();
		bw.write(qwe4);
		bw.newLine();
		bw.write(qwe5);
		bw.newLine();
		bw.write(qwe3);
		bw.newLine();
		funzi4(bw);
	}
	
	private void funzi5(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.write(qwe1);
		bw.newLine();
		bw.newLine();
		bw.write(qwe6);
		bw.newLine();
		bw.write(qwe4);
		bw.newLine();
		bw.write(qwe5);
		bw.newLine();
		funzi6(bw);
	}
	
	private void funzi4(BufferedWriter bw) throws IOException{
		bw.write(per);
		bw.newLine();
		bw.write(rep);
		bw.write(qwe1);
		bw.newLine();
		bw.newLine();
		bw.write(qwe6);
		bw.newLine();
		funzi5(bw);
	}
	
	private void funzi8(BufferedWriter bw) throws IOException {
		bw.write("	}");
		bw.newLine();
		bw.write(qwe1);
		bw.newLine();
		bw.newLine();

		bw.newLine();
		bw.write(qwe3);
		funzi7(bw);
	}
	
	private void funzi7(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.write(qwe1);
		bw.newLine();
		bw.newLine();
		funzi8(bw);
	}
	
	private void funzi6(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.flush();
		
	}
	
	/**

	 * 

	 * @throws Exception

	 */
	private void generatorEbo() throws Exception{
		File f = null;
		BufferedWriter bw= null;
		try {
		f =  new File(rootDir+"/business/ebo/"+big+"Ebo.java");
		if(f.exists()){
			return;
		}
		f.createNewFile();
		bw = new BufferedWriter(new FileWriter(f));
		funzi1(bw);
		}
		catch (java.io.FileNotFoundException e1) {
            System.out.println(file);
          } 
		 finally {
	           if (bw != null) {
	             try {
	               bw.close(); // OK
	             } catch (java.io.IOException e3) {
			       System.out.println(exc);
	             }
	           }
	         }

	}
	//5.Ã§â€�Å¸Ã¦Ë†ï¿½Ebi
	
	
	private void funzio1(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.write(qwe4);
		bw.write(per);
		bw.newLine();
		bw.write(qwe6);
		bw.newLine();
		bw.write(qwe4);
		funzio3(bw);
	}
	
	
	
	private void funzio3(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.write(qwe4);
		bw.write(qwe4);
		bw.write(per);
		bw.newLine();
		bw.write(qwe6);
		bw.newLine();
		funzio3(bw);
		
	}
	
	private void funzio5(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.write(qwe2);
		bw.write(qwe4);
		bw.write(per);
		bw.write(qwe6);
		bw.write(per);
		bw.newLine();
		bw.write(qwe6);;
		bw.newLine();
		funzio6(bw);
	}
	
	
	
	private void funzio8(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.write(qwe4);
		bw.write(per);
		bw.newLine();
		bw.write(qwe6);
		bw.newLine();
		bw.write(qwe4);
		funzio3(bw);
		bw.newLine();
		funzio7(bw);
	}
	
	private void funzio7(BufferedWriter bw) throws IOException {
		bw.write("		}");
		bw.newLine();
		bw.newLine();
		bw.write(qwe6);
		bw.newLine();
		bw.write(qwe4);
		funzio3(bw);
		bw.newLine();
		funzio8(bw);
	}
	
	private void funzio6(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.write(qwe5);
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.flush();
		
	}
	
	/**

	 * 

	 * @throws Exception

	 */
	private void generatorEbi() throws Exception{
		//1.Ã¥Ë†â€ºÃ¥Â»ÂºÃ¦â€“â€¡Ã¤Â»Â¶
		File f = null;
		BufferedWriter bw= null;
		try {
		f = new File(rootDir+"/business/ebi/"+big+"Ebi.java");
		if(f.exists()){
			return;
		}
		f.createNewFile();
		bw = new BufferedWriter(new FileWriter(f));
		funzio1(bw);
		}
		catch (java.io.FileNotFoundException e1) {
            System.out.println(file);
          } 
		 finally {
	           if (bw != null) {
	             try {
	               bw.close(); // OK
	             } catch (java.io.IOException e3) {
	               System.out.println(exc);
	             }
	           }
	         }
		
	}
	
	
	
	
	
}
