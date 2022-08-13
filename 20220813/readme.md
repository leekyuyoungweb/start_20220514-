# 다국어

# 시큐리티 BASIC 셋팅
### web.xml
	<security-role>
		<role-name>manager</role-name>
	  </security-role>
	  <security-constraint>  	
		<web-resource-collection>
			<web-resource-name>ShoppingMall</web-resource-name>
			<url-pattern>/security01.jsp</url-pattern>
			<http-method>GET</http-method>
		</web-resource-collection>  	
		<auth-constraint>
			<description>관리자</description>
			<role-name>manager</role-name>
		</auth-constraint>
	  </security-constraint>
	  <login-config>
		<auth-method>BASIC</auth-method>  	
	  </login-config> 
  
  
### tomcat-users.xml
  	<role rolename="manager"/>
	<user username="admin" password="admin1234" roles="manager"/>
