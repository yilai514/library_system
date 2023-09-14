# library_system

Summary: 
The Vue front end is not connected to Spring boot, but the back end is connected to SQLite.
Unable to package Spring boot into a jar file.

Execute Vue
1. Go to the project location and use command lines to execute the program.
> cd YOURPATH/book-borrowing-system/
> npm run dev
2. Use a browser to view the web page at http://localhost:8080/

Execute Spring Boot
1. Open project "demo" by eclipse.
2. Right-click "demo" choose "Properties".
3. Click "Java Build Path" and page "Libraries".
4. Click "Classpath" and "Add External JARs...".
5. Find "sqlite-jdbc-3.7.2.jar" in folder of "demo" and "Apply".
6. You can run "demo" as "Spring Boot APP".
7. Use a browser to view the web page at http://localhost:8005/bookdata , you can the data of books from database.
