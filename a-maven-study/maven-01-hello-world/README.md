- **知识点**
  
  - 项目坐标（groupId, artifactId, version）
  - 基本项目结构（src/main/java, src/test/java）
  - pom.xml 基本结构。
  
- **实践内容**
  
  - 创建一个最简单的 Java 程序，输出 "Hello World"，并编译运行。
  
- **项目目标**
  
  - 学习 Maven 基本项目结构。
  
- **关键代码**
  
  - **位置：**```src/main/java/HelloWorld.java```。
  
    ```java
    public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello World");
        }
    }
    ```
- **如何运行**

  ```cmd
  mvn compile
  java -cp ./target/classes com.wsw.HelloWorld
  ```

  