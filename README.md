# [JDBC App student_database_management_system](./student_databse_management_system/)
    - Console based student database management java app 

# [annotations-spring](./annotations-spring/)
    - Practice of spring-core annotations

# [SpringORM](./SpringORM/)
    - Configuring beans for the spring app to use Object Relational Mapping
    - Definity Entities to map tables in pgSql Database with hibernate

# [HibernateApp](./HibernateApp/)
    - Configuring the hibernate configuration
    - Practical implementation of one-to-one, many-to-one, one-to-many, many-to-many mappings
  
# [springmvc](./springmvc/)
    - Created spring model view controller maven app involving,
      - implementation of web app architecture, ( Controller layer | Service Layer | Data Access Layer | Database Layer )
      - handling basic forms in jsp
      - using jstl
      - passing variables from controllers to jsp views

# [form-app](./form-app/)
    - spring model view controller app handling all types of complex form inputs like
      - file uploads
      - image rendering
      - multi select inputs

# [courses-crud-app](./courses-crud-app/)
    - Spring Boot JPA App with CRUD functionalities to edit courses in database
    - Course Entity :
      - id
      - courseName
      - courseDescription
    - API Calls:
      - Get  Call : "localhost:9090/courses"
        - Gets all the list of courses in the database in JSON format
      - Get Call : "localhost:9090/courses/{courseId}"
        - Gets the details related to the course with that particular courseId
      - Post  Call : "localhost:9090/courses"
        - With the details of a new course in the request body as json, the new course gets addded to the databse
      - Put  Call : "localhost:9090/courses"
        - With the details of a course in the request body as json, the course gets updated to the databse
      - Delete  Call : "localhost:9090/courses/{courseId}"
        - Deletes the course with that particular courseId

# [employee-crud-app](./employee-crud-app/)
  - Spring Boot CRUD App + Thymeleaf templates
  - CRUD functionalities to edit the employees with frontend