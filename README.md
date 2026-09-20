# Manual Deployment
1. Create an ec2 instance running any AMI image of your choice: ubuntu for example
2. Install java8 JDK/JRE
3. navigate to the opt/ folder
4. create a folder 'gesloc-pilotage-app'. notice that this folder do not have permission since it belongs to the 'root' user.
5. do not do 'chmod 777 /opt/gesloc-pilotage-app' instead do 'sudo chown -R ubuntu:ubuntu /opt/gesloc-pilotage-webflow-app'
6. open fileZilla so that you can move the .jar file from your pc to the distant server.
7. run the app: 'java -jar app.jar'
8. test: curl http://localhost:8080
