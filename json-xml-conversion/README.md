Requirements
------------
This project required java1.8 or higher
The project makes use of gradle and uses the gradle wrapper , which means don't needs to gradle installed.

Build the project
-----------------
./gradlew build

Run the Project
---------------
java -jar build/libs/json-xml-conversion.jar <JsonFilePath> <XMLFile>

example - java -jar build/libs/json-xml-conversion.jar src/main/resources/input.json src/main/resources/output.xml 

Note
----
Not created any test file for this.
But I know Mocktio and Power & Easy Mock.
And used Figure-10 json file for testing this code.
Used strategy pattern to implement this xml conversion & google simple-json library used for parsing the json file.