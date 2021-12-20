From openjdk:11
copy ./target/springboot-schoolfare-codecanyon-0.0.1-SNAPSHOT.jar springboot-schoolfare-codecanyon-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","springboot-schoolfare-codecanyon-0.0.1-SNAPSHOT.jar"]