package cn.itcast.invoice.util.exception;
/**
 * this class handle the app exceptions and extends Exception
 *
 */
public class AppException extends Exception{
	
	/**
	 * this is the constructor for the class
	 */
	public AppException(){
	}
	
	/**
	 * this is another constructor
	 * @param msg
	 */
	public AppException(String msg){
		super(msg);
	}
	
	/**
	 * this is another constructor
	 * @param msg
	 * @param t
	 */
	public AppException(String msg,Throwable t){
		super(msg,t);
	}
	/**
	 * this is another constructor
	 * @param t
	 */
	public AppException(Throwable t){
		super(t);
	}
}
