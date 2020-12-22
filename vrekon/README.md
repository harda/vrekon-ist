maven command to build:

install ojdbc dgn maven:
cd <path ojdbc>
mvn install:install-file -Dfile=ojdbc6.jar -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0.1 -Dpackaging=jar

exec
mvn -Dhttps.protocols=TLSv1.2 compile exec:java  -Dexec.mainClass="com.mpc.vrekon.App" -Dexec.arguments="08-09-2020" -Dexec.cleanupDameonThreads=false

build package
mvn -Dhttps.protocols=TLSv1.2 install  -Dmaven.test.skip=true