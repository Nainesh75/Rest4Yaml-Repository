Rest4Yaml-Repository
====================

Read YAML file and list it's contents using REST Apis

<H1> Watch video "How to run recording.wmv" <H1>
Please watch video "How to run recording.wmv" placed inside Rest4Yaml folder
OR Read Step by Step instructions below:

<H1> Step 1-Import Project </H1>
Donwload the zip file from Github and unzip it in some folder
Start Eclipse with a blank workspace
click File=>import and select Existing Project into Workspace
Navigate to the folder structure until you find Rest4Yaml project folder
For example:  C:\Users\IBM_ADMIN\Downloads\Rest4Yaml-Repository-master\Rest4Yaml-Repository-master\Rest4Yaml
Click check box copy project into workspace 
and then click import..  You will see one error saying target runtime not defined.. We will fix that in step 2


<H1> Step 2 - Download and create Tomcat Server runtime  </H1>

Download Tomcat Binary files:
visit  http://tomcat.apache.org/download-70.cgi and download Tomcat 7.0.55 either 32-bit Windows zip file 
or 64-bit windows zip file and unzip it some folder

Define Run time Server:
Go to Eclipse and change perspective to J2EE
From the lower part of your screen, Click on the link that says "No sever available. Define a new server using Wizard ...
alternatively Click File=>New and type Server and pick the last entry
In the Wizard select Tomcat 7.0 Server as the Server Type
For the Tomcat installation directory pick the folder structure until you find  "apache-tomcat-7.0.55"
For example: C:\downloads\apache-tomcat-7.0.55-windows-x64\apache-tomcat-7.0.55
On the Next Step:  Add the Rest4Yaml project from Available to Configured side
and click Finish

<H1> Step 3 - Copy / Create Data.yml file  </H1>
Copy data.yml file present inside Rest4Yaml Project to c:\data.yml
or alternatively open YamlTester.java file.. Right click somewhere in the soruce and click run as java application 
This will programmatically create c:\data.yml with 10 items in it.

<H1> Step 4 - Start the Tomcat Server</H1>
Right click on Tomcat v7.0 Server at localhost and click on Start

<H1> Step 5 - Execute in a Browser</H1>
visti URL http://localhost:8080/Rest4Yaml/getYaml

This will display results in HTML showing name and greeting and a list of 10 items in the market.

<H1> Step 6 - Execute in a Text mode <optional>  </H1>
Download Curl for your OS by visiting http://curl.haxx.se/download.html

Open a command prompt
execute  <download location>\Curl.exe  http://localhost:8080/Rest4Yaml/getYaml/inplaintext
This will display resuls in Plain Text showing name and greeting and a list of 10 items in the market.

<H1> Step 7 - Change number of Items and re-run  <optional>  </H1>
Open YamlTester.java file.. 
Change the For loop to run 20 times instead of 10

              for (int i = 1; i <= <B>20</B>; i++)

Right click somewhere in the soruce and click run as java application 
This will programmatically re-create c:\data.yml with 10 items in it.

visti URL http://localhost:8080/Rest4Yaml/getYaml

This will display results in HTML showing name and greeting 
and this time a a list of <B> 20 items </B> in the market.

