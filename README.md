# spring-https-1
spring https changes

Reference
https://www.thomasvitale.com/https-spring-boot-ssl-certificate/

keytool -genkey -alias localhost -storetype JKS -keyalg RSA -keysize 2048 -validity 365 -keystore techg.jks

keytool -list -v -keystore techg.jks
