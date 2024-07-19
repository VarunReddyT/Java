Case 1: 
1.How to create a Package 
2. when both class and main class are in same package , 
How to execute we need to show.
Ex: java Telecom.Test

Case2:
1.How to access or import the class which is in package.
2.Make sure both main class and package are in same folder.
Ex: import Telecom.Employee
Run cmd: java Test
 
Case 3:
When the employee class in Package and the Test class is outside the package 
then we need to set the classpath from the current folder.
1. For temporary class path 
set classpath=%classpath%;E:\Packages; 
2. Permanent classpath: environment variables

Case 4:
1. When both EMP & MGR classes in package1 
2. Main class is in another package which is outside the package1.
Then we need to set the classpath and run the Test by using the following cmd.
Ex: java organization1.Test2 


Case 5:
1. To show subpackages that is pack1.telecom.Employee
2. To show fully qualified path for ambiguity of same class names in diff packages
3. To show static import: make a tele method static in Employee class and use below import statement
	"import static pack1.telecom.Employee.tele;"

