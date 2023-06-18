# allure_report
allure_report_created

How is the create allure report framework

1. Node.js setup 
- search node.js in any browser
- select the appropriate version for the operating system amd download it
2. open powershell for windows
- Than setup scoop instaşş
- Set-ExecutionPolicy RemoteSigned -Scope CurrentUser
  (select A)
  - than write down command
-irm get.scoop.sh | iex
setup compileted

3. scoop install allure 
4. add in pom.xml
    <!-- https://mvnrepository.com/artifact/io.qameta.allure/allure-cucumber-jvm -->
        <dependency>
            <groupId>io.qameta.allure</groupId>
            <artifactId>allure-cucumber7-jvm</artifactId>
            <version>2.21.0</version>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-gherkin</artifactId>
            <version>7.10.1</version>
        </dependency>



5. open intellij IDE terminal
- allure generate
- than start your test from runner class
- write this command for create report 
- allure generate --clean
