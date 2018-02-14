package cn.itcast.invoice.util.generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
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

	public GeneratorUtil(Class clazz)throws Exception{
		this.clazz = clazz;
		//-1.Ã¦â€¢Â°Ã¦ï¿½Â®Ã¥Ë†ï¿½Ã¥Â§â€¹Ã¥Å’â€“
		dataInit();
		//0.Ã§â€�Å¸Ã¦Ë†ï¿½Ã¤Â¿ï¿½Ã¥Â­ËœÃ¦â€“â€¡Ã¤Â»Â¶Ã§Å¡â€žÃ§â€ºÂ®Ã¥Â½â€¢
		genderatorDirectories();
		//1.Ã§â€�Å¸Ã¦Ë†ï¿½QueryModel
		generatorQueryModel();
		//2.Ã§â€�Å¸Ã¦Ë†ï¿½Model.hbm.xml
		generatorHbmXml();
		//3.Ã§â€�Å¸Ã¦Ë†ï¿½Dao
		generatorDao();
		//4.Ã§â€�Å¸Ã¦Ë†ï¿½DaoImpl
		generatorDaoImpl();
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
	
	private void fun4(BufferedWriter bw) throws IOException {
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
           
          } 
		 finally {
	           if (bw != null) {
	             try {
	               bw.close(); // OK
	             } catch (java.io.IOException e3) {
	               
	             }
	           }
	         }
		
		
		
	}
	//7.Ã§â€�Å¸Ã¦Ë†ï¿½Action
	
	
	
	
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
		bw.write("import cn.itcast.invoice.util.base.BaseAction;");
		bw.newLine();
		bw.newLine();
		funz3(bw);
	}
	
	private void funz2() {
			
	}
	
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
		bw.write("	//Ã¨Â·Â³Ã¨Â½Â¬Ã¥Ë†Â°Ã¥Ë†â€”Ã¨Â¡Â¨Ã©Â¡ÂµÃ©ï¿½Â¢");
		bw.newLine();
		bw.write("	public String list(){");
		bw.newLine();
		funz4(bw);
	}
	
	public void funz5(BufferedWriter bw) throws IOException {

		bw.newLine();
		bw.write(qwe3);
		bw.newLine();
		bw.write("	//Ã¨Â·Â³Ã¨Â½Â¬Ã¥Ë†Â°Ã¥Ë†");
		bw.newLine();
		bw.write("	public String save(){");
		bw.newLine();
		funz6(bw);
	}
	
	private void funz4(BufferedWriter bw) throws IOException{
		bw.write(per);
		bw.newLine();
		bw.write(rep);
		bw.newLine();
		bw.write("		}");
		bw.newLine();
		bw.write("		return TO_LIST;");
		bw.newLine();	
		funz5(bw);
	}
	
	public void funz8(BufferedWriter bw) throws IOException {
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
	
	public void funz7(BufferedWriter bw) throws IOException {
		bw.write(qwe1);
		bw.newLine();
		bw.write("		return INPUT;");
		bw.newLine();
		bw.write(qwe1);
		bw.newLine();
		bw.newLine();
		bw.write(qwe6);
		bw.newLine();
		
	}
	
	public void funz6(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.write("		return TO_LIST;");
		bw.newLine();
		bw.write("	}");
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
			final String exc=file;
            System.out.println(exc);
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
		bw.write("import cn.itcast.invoice.util.base.BaseAction;");
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
		bw.write("	public String list(){");
		bw.newLine();
		funzi4(bw);
	}
	
	public void funzi5(BufferedWriter bw) throws IOException {
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
	
	public void funzi8(BufferedWriter bw) throws IOException {
		bw.write("	}");
		bw.newLine();
		bw.write(qwe1);
		bw.newLine();
		bw.newLine();

		bw.newLine();
		bw.write(qwe3);
		funzi7(bw);
	}
	
	public void funzi7(BufferedWriter bw) throws IOException {
		bw.write("		}");
		bw.newLine();
		bw.write("		return INPUT;");
		bw.write(qwe1);
		bw.newLine();
		bw.newLine();
		funzi8(bw);
	}
	
	public void funzi6(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.write("	}");
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
	
	public void funzio5(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.write(qwe2);
		bw.write(qwe4);
		bw.write(per);
		bw.write(qwe6);
		bw.write(per);
		bw.newLine();
		bw.write(qwe6);;
		bw.write("	public String save(){");
		bw.newLine();
		funzio6(bw);
	}
	
	private void funzio4(BufferedWriter bw) throws IOException{
		bw.write(per);
		bw.newLine();
		bw.write(rep);
		bw.newLine();
		bw.write("		}");
		bw.newLine();	
		funzio5(bw);
	}
	
	public void funzio8(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.write(qwe4);
		bw.write(per);
		bw.newLine();
		bw.write(qwe6);
		bw.newLine();
		bw.write(qwe4);
		funzio3(bw);
		bw.write("			"+little+"m = "+small+"Ebi.get("+little+"m.getUuid());");
		bw.newLine();
		funzio7(bw);
	}
	
	public void funzio7(BufferedWriter bw) throws IOException {
		bw.write("		}");
		bw.newLine();
		bw.newLine();
		bw.write(qwe6);
		bw.newLine();
		bw.write(qwe4);
		funzio3(bw);
		bw.newLine();
		bw.write("		List<"+big+"Model> "+small+"List = "+small+"Ebi.getAll("+little+"qm,pageNum,pageCount);");
		funzio8(bw);
	}
	
	public void funzio6(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.write(qwe5);
		bw.newLine();
		bw.write("	}");
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
	
	
	/**

	 * 

	 * @throws Exception

	 */
	private void funzion1(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.write(rep);
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write(per);
		bw.newLine();
		bw.write(qwe3);
		bw.newLine();
		bw.write(qwe6);
		funzion3(bw);
	}
	
	/**

	 * 

	 * @throws Exception

	 */
	private void funzion3(BufferedWriter bw) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.write(rep);
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write(qwe6);
		funzion3(bw);
		bw.write("	public String list(){");
		bw.newLine();
		funzio4(bw);
	}
	
	
	/**

	 * 

	 * @throws Exception

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
		funzio6(bw);
	}
	
	
	/**

	 * 

	 * @throws Exception

	 */
	private void funzion4(BufferedWriter bw) throws IOException{
		bw.write(per);
		bw.newLine();
		bw.write(rep);
		bw.newLine();
		bw.write("		}");
		bw.newLine();
		bw.write(qwe5);
		bw.newLine();	
		funzio5(bw);
	}
	
	
	
	/**

	 * 

	 * @throws Exception

	 */
	public void funzion8(BufferedWriter bw) throws IOException {
		bw.write("	}");
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

	 * 

	 * @throws Exception

	 */
public void funzion7(BufferedWriter bw) throws IOException {
		bw.write("		}");
		bw.newLine();
		bw.write("		return INPUT;");
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

 * 

 * @throws Exception

 */	public void funzion6(BufferedWriter bw) throws IOException {
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
	
	
	//4.Ã§â€�Å¸Ã¦Ë†ï¿½DaoImpl
	/**

	 * 

	 * @throws Exception

	 */	
 private void generatorDaoImpl() throws Exception{
		//1.Ã¥Ë†â€ºÃ¥Â»ÂºÃ¦â€“â€¡Ã¤Â»Â¶
		File f = null;
		BufferedWriter bw= null;
		try {
		f = new File(rootDir+"/dao/impl/"+big+"DaoImpl.java");
		if(f.exists()){
			return;
		}
		f.createNewFile();
	
		bw = new BufferedWriter(new FileWriter(f));
		funzion1(bw);
		
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
	//3.Ã§â€�Å¸Ã¦Ë†ï¿½Dao
	/**

	 * 

	 * @throws Exception

	 */
	private void generatorDao() throws Exception{
		//1.Ã¥Ë†â€ºÃ¥Â»ÂºÃ¦â€“â€¡Ã¤Â»Â¶
		File f = null;
		BufferedWriter bw= null;
		try {
		f = new File(rootDir+"/dao/dao/"+big+"Dao.java");
		if(f.exists()){
			return;
		}
		f.createNewFile();
		funz1(bw);
		bw.newLine();
		bw.write("}");
		bw.newLine();
		bw.flush();
		}
		catch (java.io.FileNotFoundException e1) {
            System.out.println(file);
          } 
		 finally {
	           if (bw != null) {
	             try {
	               bw.close(); // OK
	             } catch (java.io.IOException e3) {
	               System.out.println("I/O Exception");
	             }
	           }
	         }
		
		
	}
	
	/**

	 * 

	 * @throws Exception

	 */
	private void funx1(BufferedWriter bw) throws IOException {
		bw.write(rep);
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write(per);
		bw.newLine();
		bw.newLine();
		bw.flush();
		}
	
	
	
	//2.Ã§â€�Å¸Ã¦Ë†ï¿½Model.hbm.xml
	/**

	 * 

	 * @throws Exception

	 */
	private void generatorHbmXml() throws Exception{
		File f = null;
		BufferedWriter bw= null;
		try {
		f = new File(rootDir+"/vo/"+big+"Model.hbm.xml");
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


	//1.Ã§â€�Å¸Ã¦Ë†ï¿½QueryModel
	/**

	 * 

	 * @throws Exception

	 */
	private void generatorQueryModel() throws Exception {
		//1.Ã¥Ë†â€ºÃ¥Â»ÂºÃ¦â€“â€¡Ã¤Â»Â¶
		File f = null;
		BufferedWriter bw= null;
		try {
		f = new File(rootDir+"/vo/"+big+"QueryModel.java");
		if(f.exists()){
			return;
		}
		f.createNewFile();
		bw = new BufferedWriter(new FileWriter(f));
		funzio1(bw);
		}
		catch (java.io.FileNotFoundException e1) {
	        System.out.println(exc);
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

	//0.Ã§â€�Å¸Ã¦Ë†ï¿½Ã¤Â¿ï¿½Ã¥Â­ËœÃ¦â€“â€¡Ã¤Â»Â¶Ã§Å¡â€žÃ§â€ºÂ®Ã¥Â½â€¢
	/**

	 * 

	 * @throws Exception

	 */
	private void genderatorDirectories() {
		//Ã¥Ë†â€ºÃ¥Â»ÂºÃ¦â€°â‚¬Ã¦Å“â€°Ã¦â€“â€¡Ã¤Â»Â¶Ã§Å¡â€žÃ¤Â¿ï¿½Ã¥Â­ËœÃ§â€ºÂ®Ã¥Â½â€¢
		//web
		File f = new File(rootDir+"/web");
		f.mkdirs();
		//business.ebi
		f = new File(rootDir+"/business/ebi");
		f.mkdirs();
		//business.ebo
		f = new File(rootDir+"/business/ebo");
		funzionez(f);
	}
	
	private void funzionez(File f) {
		f.mkdirs();
		//dao.dao
		f = new File(rootDir+"/dao/dao");
		f.mkdirs();
		//dao.impl
		f = new File(rootDir+"/dao/impl");
		f.mkdirs();
	
	}
	
	//-1.Ã¦â€¢Â°Ã¦ï¿½Â®Ã¥Ë†ï¿½Ã¥Â§â€¹Ã¥Å’â€“
	private void dataInit() {
		//pkg;
		String allPkg = clazz.getPackage().getName();
		int zero = 0;
		int three = 3;
		pkg = allPkg.substring(zero,allPkg.length()-three);
		//rootDir;			src/cn/itcast/invoice/auth/emp
		rootDir = "src/"+pkg.replace(".", "/");
		//big;		Emp
		String allClazzName = clazz.getSimpleName();
		int five = 5;
		big = allClazzName.substring(zero, allClazzName.length()-five);
		//little;
		little = big.substring(0, 1).toLowerCase();
		//small;
		small = little+big.substring(1);
	}
	
	private boolean check(Field fd) {
		boolean checked = false;
		if(fd.getModifiers() == Modifier.PRIVATE){
			if(!fd.getName().endsWith("View") && !fd.getName().equals("uuid")){
				//Ã¦Â»Â¡Ã¨Â¶Â³Long,Double,Integer,StringÃ§Å¡â€žÃ§â€�Å¸Ã¦Ë†ï¿½
				if(fd.getType().equals(Long.class)
						||fd.getType().equals(Double.class)
						||fd.getType().equals(Integer.class)
						||fd.getType().equals(String.class)
						)  { checked= true;
				}
			}
		}
		return checked;
	}
	
	
}
