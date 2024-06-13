## Springboot 3.3
Lightweight package and fast execution

Run under:
- Java 21

Command line to try:
```
java -Djarmode=tools -jar ./spring33-0.0.1-SNAPSHOT.jar extract --destination build/app
//Follow-up on that jar file
java -XX:ArchiveClassesAtExit=application.jsa -Dspring.context.exit=onRefresh -jar spring33-0.0.1-SNAPSHOT.jar 
java -XX:SharedArchiveFile=application.jsa -jar spring33-0.0.1-SNAPSHOT.jar 
```