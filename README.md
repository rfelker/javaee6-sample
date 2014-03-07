# Simple Java Web Application (SJWA)
This repository contains an example application for
* JSF 2.0
* EJB 3.1
* JSR-303 - Bean Validation
* JAAS / DataSourceRealm

URLs:
* http://localhost:8080/sjwa
* http://localhost:8080/sjwa/rechner2 (Servlet sample)

IDE-Support with Eclipse IDE for Java EE Developers
* Download Eclipse https://www.eclipse.org/downloads

TomEE+ 1.6.0 as an Application Server
* Download http://tomee.apache.org/downloads.html

HSQLDB Databese
* http://hsqldb.org/

## Startup HSQLDB server / sjwaDB database:
````
java -cp lib/hsqldb.jar org.hsqldb.server.Server --database.0 file:hsqldb/sjwaDB --dbname.0 sjwaDB
````


# Setup sjwaDB database:
Download HSQLDB: http://sourceforge.net/projects/hsqldb/files/hsqldb

Startup server: 
```
java -cp lib/hsqldb.jar org.hsqldb.server.Server
```
Create tables for realm:
```sql
create table users (user_name varchar(15) not null primary key, user_pass varchar(15) not null);
insert into user_roles(user_name, role_name) values('user', 'REGISTERED');
```
Create test data
```sql
insert into users(user_name, user_pass) values('user', 'test');
insert into user_roles(user_name, role_name) values('user', 'REGISTERED');
```
