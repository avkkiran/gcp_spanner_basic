# gcp_spanner_basic
This project deals with performing basic operations to employee table that is stored in spanner database.

It has two endpoints:

/GET employees which returns all the employees in the database

/POST employee which inserts the required employee to the database. Sample request body is given below:

{
    "id":1,
    "name":"Kiran",
    "sal":4000
}
