It is console based application which uses the Hibernate framework to perform CRUD Operations, Used Hibernate framework and Annotation based application. User will have options weather he/she can display all table data or they want to perform an CRUD operations I am also pasting some console based output here and also attaching some screenshots of project

Details : -Project Name : Project_Hibernate_Employee_Details -Main class : App.java -Bean class : Employee_Class_Hibernate_Project.java -Configuration File : hibernate.cfg.xml -Dependecies : hibernate-core and mysql-connector-java

Output :

Aug 05, 2022 8:24:16 PM org.hibernate.Version logVersion INFO: HHH000412: Hibernate ORM core version 5.6.10.Final Aug 05, 2022 8:24:17 PM org.hibernate.annotations.common.reflection.java.JavaReflectionManager INFO: HCANN000001: Hibernate Commons Annotations {5.1.2.Final} Aug 05, 2022 8:24:17 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!) Aug 05, 2022 8:24:17 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator INFO: HHH10001005: using driver [com.mysql.cj.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/comeback] Aug 05, 2022 8:24:17 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator INFO: HHH10001001: Connection properties: {password=****, user=root} Aug 05, 2022 8:24:17 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator INFO: HHH10001003: Autocommit mode: false Aug 05, 2022 8:24:17 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections INFO: HHH000115: Hibernate connection pool size: 20 (min=1) Aug 05, 2022 8:24:17 PM org.hibernate.dialect.Dialect INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL5Dialect Aug 05, 2022 8:24:18 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@285c6918] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode. Aug 05, 2022 8:24:18 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@b34832b] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode. Aug 05, 2022 8:24:18 PM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform] ----/ Employee Management System using Hibernate /----

Select choice : 1: Show Employee details 2: Insert Employee details 3: Update Employee details 4: Delete Employee details 5: Exit

1 No Data found...!!

Select choice : 1: Show Employee details 2: Insert Employee details 3: Update Employee details 4: Delete Employee details 5: Exit

2 Enter ID : 101 Enter Name : ABC Enter Salary : 10000 Data saved successfully...!!

Select choice : 1: Show Employee details 2: Insert Employee details 3: Update Employee details 4: Delete Employee details 5: Exit

2 Enter ID : 102 Enter Name : DEF Enter Salary : 20000 Data saved successfully...!!

Select choice : 1: Show Employee details 2: Insert Employee details 3: Update Employee details 4: Delete Employee details 5: Exit

2 Enter ID : 103 Enter Name : GHI Enter Salary : 30000 Data saved successfully...!!

Select choice : 1: Show Employee details 2: Insert Employee details 3: Update Employee details 4: Delete Employee details 5: Exit

1 Id Name Salary 101 ABC 10000 102 DEF 20000 103 GHI 30000

Select choice : 1: Show Employee details 2: Insert Employee details 3: Update Employee details 4: Delete Employee details 5: Exit

3 Enter Id to update 103 Enter Name to Update : JKL Enter salary to update : 300 Value updated successfully..!!

Select choice : 1: Show Employee details 2: Insert Employee details 3: Update Employee details 4: Delete Employee details 5: Exit

1 Id Name Salary 101 ABC 10000 102 DEF 20000 103 JKL 300

Select choice : 1: Show Employee details 2: Insert Employee details 3: Update Employee details 4: Delete Employee details 5: Exit

4 Enter Id to delete 109 ID is not present in DB..!!

Select choice : 1: Show Employee details 2: Insert Employee details 3: Update Employee details 4: Delete Employee details 5: Exit

4 Enter Id to delete 103 Value Delete successfully..!!

Select choice : 1: Show Employee details 2: Insert Employee details 3: Update Employee details 4: Delete Employee details 5: Exit

1 Id Name Salary 101 ABC 10000 102 DEF 20000

Select choice : 1: Show Employee details 2: Insert Employee details 3: Update Employee details 4: Delete Employee details 5: Exit

5

Thank you..!!
