# mvcSpringSecurity
Spring MCV with spring security 
create web mvc application with security

Step 1 - Web Application
	1) Dependencies - *Spring web mvc
			      *servlet api
				• 
			
	2) Create dispatcher servlet 
		WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		
	
			
	3) Configuration  - create config class with @Configuration, @EnableWebMvc, @ComponentScan("com") [controller package ]
       viewResolver Bean 



Step 2 -Add Spring security

	1) Dependencies  - spring security config, spring security web 


	2) Configuration - @EnableWebSecurity to enable the spring security (Also we need to add @Configuration because this is configuration class. But @Configuration already has in @EnableWebSecurity. So we don't need to add)
Spring security filter chain created by @EnableWebSecurity
	

When enable debug we can see the security filters that spring has (but this is not recommend in production) spring has 15 filters 


	3) Security Initializer - 
SecurityInitalizer extends AbstractSecurityWebApplicationInitializer

AbstractSecurityWebApplicationInitializer register the created filter chain.
 




How filter chain creates 


	AbstractSecurityWebApplicationInitializer register the created filter chain.
	It has onStartup  method. It will run when application get start.
	
	 It call insertSpringSecurityFilterChain method 
	
	
	
	inserSpringSecurityFilterChain is register the filter chain. 
	
	In there it create object of DelegatingFilterProxy with filter name "DEFAULT_FILTER_NAME"




DEFAULT_FILTER_NAME



Filter chain object creation 

Creation will happen @EnableWebSecurity annotation



EnableWebSecurity interface import WebSecurityConfiguration class. It has the filter chain creation method 




Inside WebSecurityConfiguration class Filter Bean creation happening. It create bean with name "DEFAULT_FILTER_NAME"


![image](https://user-images.githubusercontent.com/42708069/186950346-70a766bd-26d2-44b2-8b30-54f18dbc90cb.png)
