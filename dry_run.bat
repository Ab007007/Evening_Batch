echo "Welcome to batch Execution"
cd D:\aimorc_training\Eclipse_WS\actitime
d:
set path=%path%;D:\maven\apache-maven-3.6.1\bin
set classpath=D:\aimorc_training\Eclipse_WS\actitime\target\*;.
mvn test -Dtestng.dtd.http=true
pause