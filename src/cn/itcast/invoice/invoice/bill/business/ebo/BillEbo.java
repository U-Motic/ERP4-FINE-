package cn.itcast.invoice.invoice.bill.business.ebo;

import java.awt.Font;
import java.awt.RenderingHints;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

import jxl.format.Colour;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import cn.itcast.invoice.invoice.bill.business.ebi.BillEbi;
import cn.itcast.invoice.invoice.bill.dao.dao.BillDao;
import cn.itcast.invoice.invoice.bill.vo.BillQueryModel;
import cn.itcast.invoice.invoice.goods.vo.GoodsModel;
import cn.itcast.invoice.invoice.order.vo.OrderDetailModel;
import cn.itcast.invoice.util.jxl.ExcelUtil;
/**
 * this class implements BillEbi
 *
 */
public class BillEbo implements BillEbi{
	
	private final static int twenty = 20;
	
	
	private final static int fourteen = 14, twelve = 12, ten = 10, fourfivesix = 456, threesixO = 360, one = 1, two = 2, three = 3, four = 4, five = 5, 
			twentyfive = 25, fifteen = 15, thirtyseven = 37, zero = 0, six = 6, twentythree = 23, eight = 8, twentyfour = 24, eighteen = 18;
	private final static double zerozero2D = 0.02D;
	private static final GoodsModel[] objs = null;

	static {
		StandardChartTheme theme = new StandardChartTheme("unicode") {
			public void apply(JFreeChart chart) {
				chart.getRenderingHints().put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
				super.apply(chart);
			}
		};
		
		final String rep="ÃƒÂ¥Ã‚Â®Ã¢â‚¬Â¹ÃƒÂ¤Ã‚Â½Ã¢â‚¬Å“";
		theme.setExtraLargeFont(new Font(rep, Font.PLAIN, twenty));
		theme.setLargeFont(new Font(rep, Font.PLAIN, fourteen));
		theme.setRegularFont(new Font(rep, Font.PLAIN, twelve));
		theme.setSmallFont(new Font(rep, Font.PLAIN, ten));
		ChartFactory.setChartTheme(theme);
	}
	private BillDao billDao;
	/**
	 * public element
	 */
	public void setBillDao(BillDao billDao) {
		this.billDao = billDao;
	}
	/**
	 * public element
	 */
	public List<Object[]> getBillByGoods(BillQueryModel bqm) {
		return billDao.getBillByGoods(bqm);
	}
	/**
	 * public element
	 */
	public List<OrderDetailModel> getBillDetailByGoods(BillQueryModel bqm) {
		return billDao.getBillDetailByGoods(bqm);
	}
	
	private void funz(DefaultPieDataset localDefaultPieDataset, List<Object[]> billList) {
		JFreeChart localJFreeChart = ChartFactory.createPieChart("ÃƒÂ©Ã¢â‚¬Â¡Ã¢â‚¬Â¡ÃƒÂ¨Ã‚Â´Ã‚Â­ÃƒÂ§Ã‚Â»Ã…Â¸ÃƒÂ¨Ã‚Â®Ã‚Â¡", localDefaultPieDataset, true, true, false);
		PiePlot localPiePlot = (PiePlot) localJFreeChart.getPlot();
		localPiePlot.setLabelFont(new Font("SansSerif", zero, twelve));
		localPiePlot.setNoDataMessage("No data available");
		localPiePlot.setLabelGap(zerozero2D);
	
	}
	
	private void funz2() throws IOException {
		PieDataset localDefaultPieDataset = null;
		JFreeChart localJFreeChart = ChartFactory.createPieChart("ÃƒÂ©Ã¢â‚¬Â¡Ã¢â‚¬Â¡ÃƒÂ¨Ã‚Â´Ã‚Â­ÃƒÂ§Ã‚Â»Ã…Â¸ÃƒÂ¨Ã‚Â®Ã‚Â¡", localDefaultPieDataset, true, true, false);
		ImageOutputStream os = null;
		ImageIO.write(localJFreeChart.createBufferedImage(fourfivesix, threesixO), "png", os);
	
	}
	
	/**
	 * public element
	 */
	public void getBillForPie(OutputStream os, List<Object[]> billList) {
		//ÃƒÂ¥Ã¢â‚¬Â¡Ã¢â‚¬Â ÃƒÂ¥Ã‚Â¤Ã¢â‚¬Â¡ÃƒÂ¦Ã¢â‚¬Â¢Ã‚Â°ÃƒÂ¦Ã¯Â¿Â½Ã‚Â®
		DefaultPieDataset localDefaultPieDataset = new DefaultPieDataset();
		for(Object[] thing:billList){
			GoodsModel gm = (GoodsModel) thing[0];
			Long num = (Long) thing[1];
			localDefaultPieDataset.setValue(gm.getName(), new Double(num));
		}
		//ÃƒÂ¦Ã¢â‚¬Â¢Ã‚Â°ÃƒÂ¦Ã¯Â¿Â½Ã‚Â®ÃƒÂ¨Ã‚Â½Ã‚Â¬ÃƒÂ¥Ã…â€™Ã¢â‚¬â€œÃƒÂ¤Ã‚Â¸Ã‚ÂºjfreechartÃƒÂ¥Ã‚Â¯Ã‚Â¹ÃƒÂ¨Ã‚Â±Ã‚Â¡
		funz(localDefaultPieDataset,billList);
		//jfreechartÃƒÂ¥Ã‚Â¯Ã‚Â¹ÃƒÂ¨Ã‚Â±Ã‚Â¡ÃƒÂ¨Ã‚Â£Ã¢â‚¬Â¦ÃƒÂ¥Ã¢â‚¬Â¦Ã‚Â¥osÃƒÂ¥Ã‚Â¯Ã‚Â¹ÃƒÂ¨Ã‚Â±Ã‚Â¡
		try {
		funz2();
		} catch (IOException e) {
			 System.out.println("Something was wrong");}}
	
	private void funz(){
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		//ÃƒÂ¥Ã¢â‚¬Â Ã¢â€žÂ¢ExcelÃƒÂ¦Ã¢â‚¬â€œÃ¢â‚¬Â¡ÃƒÂ¤Ã‚Â»Ã‚Â¶
		WritableWorkbook b = ExcelUtil.cWorkbook(os); 
		//WritableSheet s = workbook.createSheet("ÃƒÂ¦Ã¢â€šÂ¬Ã‚Â»ÃƒÂ¦Ã¢â‚¬Â¹Ã‚Â¬", 0); 
		WritableSheet s = ExcelUtil.cSheet(b, one, "ÃƒÂ¦Ã¢â€šÂ¬Ã‚Â»ÃƒÂ¦Ã¢â‚¬Â¹Ã‚Â¬");
		//ÃƒÂ¨Ã‚Â®Ã‚Â¾ÃƒÂ§Ã‚Â½Ã‚Â®ÃƒÂ¨Ã‚Â¡Ã…â€™ÃƒÂ©Ã‚Â«Ã‹Å“
		ExcelUtil.sRowSize(s, one, fifteen);
		ExcelUtil.sRowSize(s, two, thirtyseven);
		ExcelUtil.sRowSize(s, three, six);
		ExcelUtil.sRowSize(s, four, twentythree);
		//ÃƒÂ¨Ã‚Â®Ã‚Â¾ÃƒÂ§Ã‚Â½Ã‚Â®ÃƒÂ¥Ã‹â€ Ã¢â‚¬â€�ÃƒÂ¥Ã‚Â®Ã‚Â½
		ExcelUtil.sColumnSize(s, one, eight);
		ExcelUtil.sColumnSize(s, two, eight);
		ExcelUtil.sColumnSize(s, three, twentyfive);
		ExcelUtil.sColumnSize(s, four, twentyfive);
		ExcelUtil.sColumnSize(s, five, twentyfive);
		//ÃƒÂ¥Ã¯Â¿Â½Ã‹â€ ÃƒÂ¥Ã‚Â¹Ã‚Â¶
		ExcelUtil.sMerge(s, two , two , two , four);
		ExcelUtil.sMerge(s, three , two , three , five);		
	}

	
	
	
	/**
	 * public element
	 */
	public InputStream getExcelBill(List<Object[]> billList) throws Exception{
		//ÃƒÂ¨Ã‚Â¿Ã¢â‚¬ÂºÃƒÂ¨Ã‚Â´Ã‚Â§ÃƒÂ§Ã‚Â»Ã…Â¸ÃƒÂ¨Ã‚Â®Ã‚Â¡ÃƒÂ¦Ã…Â Ã‚Â¥ÃƒÂ¨Ã‚Â¡Ã‚Â¨
		funz();
		String per = null;
		Label lab44 = ExcelUtil.cLabel(four, four, per);
		ExcelUtil.sLabelStyle(lab44, per, eighteen, Colour.BLACK, null, one, "2220");
		WritableSheet s = null;
		ExcelUtil.aLabelToSheet(lab44, s);
		Label lab45 = ExcelUtil.cLabel(four, five, per);
		funz2();
		int row = 4;
		//ÃƒÂ¥Ã‚Â¾Ã‚ÂªÃƒÂ§Ã…Â½Ã‚Â¯ÃƒÂ¤Ã‚ÂºÃ‚Â§ÃƒÂ§Ã¢â‚¬ï¿½Ã…Â¸ÃƒÂ¦Ã¢â‚¬Â¢Ã‚Â°ÃƒÂ¦Ã¯Â¿Â½Ã‚Â®
		int i = 1;
		Long sum = 0L;
		//ÃƒÂ¨Ã‚Â®Ã‚Â¾ÃƒÂ§Ã‚Â½Ã‚Â®ÃƒÂ¨Ã‚Â¡Ã…â€™ÃƒÂ©Ã‚Â«Ã‹Å“
		ExcelUtil.sRowSize(s, row+i, twentyfour);
		//ÃƒÂ¥Ã¯Â¿Â½Ã‹â€ ÃƒÂ¥Ã‚Â¹Ã‚Â¶
		InputStream is = null;
		return is;
	}


}
