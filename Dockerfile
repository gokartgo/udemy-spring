FROM tomcat:9.0.52-jdk8

EXPOSE 8080 8000

CMD ["/usr/local/tomcat/bin/catalina.sh", "jpda", "run"]