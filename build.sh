#!/bin/sh

echo Compiling and Running...
echo ========================
cd target/classes

#To compile MyStack and MyStackDemo
javac -d ~/cs498/mp1/junit/4.12 MyStack.java MyStackDemo.java

java -cp .:../../junit/4.12/junit-4.12.jar MyStackDemo

cd ~/cs498/mp1/target/test-classes

#Compile MyStackTest
javac -cp ../../junit/4.12/junit-4.12.jar:../../org/hamcrest/hamcrest-core/hamcrest-core-1.3.jar:../classes/ MyStackTest.java

#Run MyStacktest
java -cp .:../../junit/4.12/junit-4.12.jar:../../org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:../classes org.junit.runner.JUnitCore MyStackTest

#Set CLASSPATH for jar files in two differents Directories
#export CLASSPATH=.:~/cs498/mp1/org/hamcrest/hamcrest-core/1.3hamcrest-core-1.3.jar:~/cs498/mp1/junit/4.12junit-4.12.jar:$CLASSPATH
