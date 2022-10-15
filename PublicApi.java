package com.shopping.mall.controller;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class PublicApi {
	
	@RequestMapping(value = "/api", method = RequestMethod.GET)
	public @ResponseBody String publicApi() throws Exception {
		StringBuilder urlBuilder = new StringBuilder("http://openapi.seoul.go.kr:8088"); /* URL */
		urlBuilder.append("/"
				+ URLEncoder.encode("6257556a707069613130386f61594361", "UTF-8")); /* 인증키 (sample사용시에는 호출시 제한됩니다.) */
		urlBuilder.append("/" + URLEncoder.encode("json", "UTF-8")); /* 요청파일타입 (xml,xmlf,xls,json) */
		urlBuilder.append("/" + URLEncoder.encode("LOCALDATA_031101", "UTF-8")); /* 서비스명 (대소문자 구분 필수입니다.) */
		urlBuilder.append("/" + URLEncoder.encode("6", "UTF-8")); /* 요청시작위치 (sample인증키 사용시 5이내 숫자) */
		urlBuilder.append("/" + URLEncoder.encode("10", "UTF-8")); /* 요청종료위치(sample인증키 사용시 5이상 숫자 선택 안 됨) */
		// 상위 5개는 필수적으로 순서바꾸지 않고 호출해야 합니다.

		
//		DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
//		DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
//		Document doc = dBuilder.parse(urlBuilder.toString());
//		doc.getDocumentElement().normalize();
//		System.out.println("Root element: " + doc.getDocumentElement().getNodeName()); 
//		
//		NodeList nList = doc.getElementsByTagName("LOCALDATA_031101");
//		System.out.println("파싱할 리스트 수 : "+ nList.getLength());  // 파싱할 리스트 
		
		// 서비스별 추가 요청 인자이며 자세한 내용은 각 서비스별 '요청인자'부분에 자세히 나와 있습니다.
//		urlBuilder.append("/" + URLEncoder.encode("20220301","UTF-8")); /* 서비스별 추가 요청인자들*/

		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/xml");
		System.out.println("Response code: " + conn.getResponseCode()); /* 연결 자체에 대한 확인이 필요하므로 추가합니다. */
		BufferedReader rd;

		// 서비스코드가 정상이면 200~300사이의 숫자가 나옵니다.
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}		
		
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode rootNode = mapper.readTree(rd);
//		System.out.println(rootNode.path("LOCALDATA_031101").path("row"));
		Iterator<JsonNode> it = rootNode.path("LOCALDATA_031101").path("row").elements();
		while(it.hasNext()) {
			JsonNode node = it.next();
			System.out.println(node.path("SITEWHLADDR"));
		}
		
		
//		StringBuilder sb = new StringBuilder();
//		String line;
//		while ((line = rd.readLine()) != null) {
//			sb.append(line);
//		}
		
		
		
		
		rd.close();
		conn.disconnect();
		return rootNode.toString();
	}

}
