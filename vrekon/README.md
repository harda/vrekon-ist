maven command to build:

exec
mvn -Dhttps.protocols=TLSv1.2 compile exec:java  -Dexec.mainClass="com.mpc.vrekon.App" -Dexec.arguments="08-09-2020" -Dexec.cleanupDameonThreads=false -Dfile=/src/main/resources/lib/ojdbc6.jar

build package
mvn package spring-boot:repackage -Dmaven.test.skip=true -Dhttps.protocols=TLSv1.2