package mysql.labs;

/**
 *
 * MySQL Exercise 2:
 *
 *      Using MySQLWorkbench,
 *
 *      1.) If you haven't already, create the college database as instructed here:
 *              https://platform.codingnomads.co/learn/mod/page/view.php?id=2133
 *      2.) Create a new table "students" with the following fields:
 *          a. id (auto increment)
 *          b. first_name
 *          c. age
 *
 *      3.) Create a new table "teachers_students" with the following fields:
 *          a. id (auto increment)
 *          b. student_id
 *          c. teacher_id
 *
 *      4.) Create a new table "teachers" with the following fields:
 *          a. id (auto increment)
 *          b. first_name
 *          c. last_name
 *          d. subject
 *
 *      5.) Populate each table with at least 5 records.
 *
 *      6.) Write queries (and paste them below) for each of the following tasks:
 *          a. select all students
 *          b. select all teacher who teach "Math" (choose a subject you included)
 *          c. use a join query to select all students with a certain teacher
 *          d. use a join query to select all students with taking a certain subject
 *          e. update a record in the student table
 *          f. add a record to the teacher table
 *
 *       7.) Export the schema to a dump file and copy it to this folder.
 *
 *
 */