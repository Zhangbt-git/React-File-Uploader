# React-File-Uploader
Combines the power of both React UI and SpringBoot to create UI which uploads to Amazon S3 and downloads it to React frontend. Includes React Dropbox app to add drag and drop capability and Axios for requests to and backend server.

NOTES:

Start Backend app server:  On the backend server side, use IntelliJ or Eclipse to setup a Build/Debug/Run configuration on src/main/java/com.tamidev.awsimageupload/Main.java

Start Frontend webapp server: Use Node or Yarn to start the React UI from src/main/frontend directory (i.e. npm start)

================

1) Frontend UI launches with drop point location for images/files to drag and drop from computer. 

2) Upon drop of image/file, image/file is uploaded to Amazon S3 bucket and in-memory data is updated with profile info.

3) Upon suspension of backend server, in-memory data is cleared.




![alt title](/src/main/java/com/tamidev/awsimageupload/images/AWS-File-Uploader.png?raw=true "UML Diagram")

