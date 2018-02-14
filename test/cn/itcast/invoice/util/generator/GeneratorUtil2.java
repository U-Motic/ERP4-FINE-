package cn.itcast.invoice.util.generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

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
		bw.newLine();
		
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
	}
	
	
	
	
	/**

	 * 

	 * @throws Exception

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

	 * 

	 * @throws Exception

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
