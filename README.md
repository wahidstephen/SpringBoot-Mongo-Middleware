# SpringBoot-Mongo-Middleware
 - A Spring Boot based middleware to handle CRUD operations specific to User data for a Telecommunications Management System housed in MongoDB.
 - Made for the 3rd Skill-Based Assessment under IIHT Training (Verizon BootCamp).

## CRUD-Based API Endpoints

1. `/getall` - To retrieve all the customers (GET)
2. `/create` - To create a customer (POST)
3. `/getcust/{cust_id}` - To retrieve a customer by `cust_id - INT` (GET)

## MongoDB

### Database Config
 - Set properties like `host`, `port`, `db_name` under `src/main/resources/application.properties`
 
### Database schema

 - #### Customer collection
   - `int custID`
   - `String custName`
   - `String dateOfJoining`
   - `{Enum CHENNAI, HYDERABAD} city`
   - `String contactNo`
