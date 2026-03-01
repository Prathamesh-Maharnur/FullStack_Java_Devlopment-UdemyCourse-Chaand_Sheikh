errors:
1)Server(stopped, Republish)
properties -> project facets -> convert -> change dyn web module to 6 and java to 17
target run time to apache tomcat 10 with JRE = microsoft jdk 17 
Double click the servers change the admin port to 0 and HTTP/1.1 to 8080


2)Error: Could not find or load main class org.apache.catalina.startup.Bootstrap
Caused by: java.lang.ClassNotFoundException: org.apache.catalina.startup.Bootstrap
sol: Go to Servers Tab > Double Click on your Server > Open Launch Configuration > Classpath(tab) > Click on User Entries > Add External Jars > Add Boorstrap.jar and tomcat-juli.jar from Tomcat/bin > Apply > Ok