package filter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LogfileFilter implements Filter {
	PrintWriter writer;
	
	
	private String getCurrentTime(boolean isOnlyDate) {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if(isOnlyDate)
			formatter = new SimpleDateFormat("yyyy-MM-dd");		
		Calendar calendar =  Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		return formatter.format(calendar.getTime());
	}
	
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)	throws IOException, ServletException {		
		HttpServletRequest httpReq = (HttpServletRequest)request;
		String clientAddr =  request.getRemoteAddr();
		String uri = httpReq.getRequestURI();
		String queryString =  httpReq.getQueryString();
		uri += (queryString != null)? "?"+queryString : "";

		writer.printf("[현재일시 : %s ][ %s ] : %s\n", getCurrentTime(false), clientAddr, uri);
		
		chain.doFilter(request, response);
	}
	
	@Override
	public void destroy() {if(writer != null) writer.close();}


	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		String fileName =  filterConfig.getInitParameter("fileName");
		String filePath =  filterConfig.getInitParameter("filePath");
		String currentTime = getCurrentTime(true);
		fileName = filePath+"/" + currentTime+"_"+fileName;
		System.out.println(fileName);
		if(fileName == null) throw new ServletException("로그파일을 찾을수 없습니다.");
		try {
			writer = new PrintWriter(new FileWriter(fileName, true),true);
		} catch (IOException e) {
			throw new ServletException("로그파일을 열수 없습니다.");
		}

	}

}
