@echo off & setlocal enabledelayedexpansion

set APPLICATION_NAME="pms-core"

set LIB_JARS=""
cd ..\lib
for %%i in (*) do set LIB_JARS=!LIB_JARS!;..\lib\%%i

cd ..\bin
if ""%1"" == ""debug"" goto debug
if ""%1"" == ""jmx"" goto jmx

set JVM_MEM_OPTS=-Xms512m -Xmx1024m -XX:MaxPermSize=256M

start "[dubbo]%APPLICATION_NAME%" java %JVM_MEM_OPTS% -classpath ..\conf;%LIB_JARS% xmu.lgp.lly.integration.Main
goto end


:debug
start "[dubbo]%APPLICATION_NAME%" java %JVM_MEM_OPTS% -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,address=8000,server=y,suspend=n -classpath ..\conf;%LIB_JARS% xmu.lgp.lly.integration.Main
goto end


:jmx
start "[dubbo]%APPLICATION_NAME%" java %JVM_MEM_OPTS%  -Dcom.sun.management.jmxremote.port=1099 -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false -classpath ..\conf;%LIB_JARS% xmu.lgp.lly.integration.Main
goto end


:configerror
echo [ERROR] The property of 'app.process.name' in conf\dubbo.properties is not set!


:end
pause