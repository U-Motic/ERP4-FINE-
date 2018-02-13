package cn.itcast.invoice.util.interceptor;

import cn.itcast.invoice.util.exception.AppException;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
/**
 * this class extends AbstractInterceptor
 *
 */
public class ExceptionInterceptor extends AbstractInterceptor{
	public String intercept(ActionInvocation invocation) throws Exception {
		String toReturn = null;

		try {
			toReturn = invocation.invoke();
		} catch (AppException e) {
			//ÃƒÂ¤Ã‚Â½Ã‚Â¿ÃƒÂ§Ã¢â‚¬ï¿½Ã‚Â¨ÃƒÂ¤Ã‚Â¸Ã¢â‚¬Â¹ÃƒÂ¥Ã‹â€ Ã¢â‚¬â€�ÃƒÂ¥Ã‚Â¯Ã‚Â¹ÃƒÂ¨Ã‚Â±Ã‚Â¡ÃƒÂ¨Ã…Â½Ã‚Â·ÃƒÂ¥Ã¯Â¿Â½Ã¢â‚¬â€œactionsupportÃƒÂ¥Ã‚Â¸Ã‚Â¸ÃƒÂ§Ã¢â‚¬ï¿½Ã‚Â¨ÃƒÂ¦Ã¢â‚¬Å“Ã¯Â¿Â½ÃƒÂ¤Ã‚Â½Ã…â€œ
			ActionSupport as = (ActionSupport) invocation.getAction();
			as.addActionError(as.getText(e.getMessage()));
			//ÃƒÂ§Ã‚Â»Ã¢â€žÂ¢ÃƒÂ¥Ã‚Â¼Ã¢â€šÂ¬ÃƒÂ¥Ã¯Â¿Â½Ã¢â‚¬ËœÃƒÂ¤Ã‚ÂºÃ‚ÂºÃƒÂ¥Ã¢â‚¬ËœÃ‹Å“ÃƒÂ¥Ã¯Â¿Â½Ã¢â‚¬ËœÃƒÂ¤Ã‚Â¸Ã¢â€šÂ¬ÃƒÂ¤Ã‚Â»Ã‚Â½email
			//ÃƒÂ¨Ã‚Â®Ã‚Â°ÃƒÂ¥Ã‚Â½Ã¢â‚¬Â¢ÃƒÂ¦Ã¢â‚¬â€�Ã‚Â¥ÃƒÂ¥Ã‚Â¿Ã¢â‚¬â€�e.printStackTrace();
			//ÃƒÂ¨Ã…Â½Ã‚Â·ÃƒÂ¥Ã¯Â¿Â½Ã¢â‚¬â€œActionÃƒÂ§Ã…Â¡Ã¢â‚¬Å¾ÃƒÂ¨Ã‚Â°Ã†â€™ÃƒÂ§Ã¢â‚¬ï¿½Ã‚Â¨ÃƒÂ§Ã…Â½Ã‚Â¯ÃƒÂ¥Ã‚Â¢Ã†â€™
			toReturn  = "error";
		} catch(Exception e){
			 System.out.println("Something was wrong");
			toReturn = "error";
		}
		finally {
			return toReturn;
		}
	}
}
