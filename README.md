# alfresco-utils
A collection of classes to extend some alfresco base out-of-the-box functionalities.

Based on alfresco 5.x, there are new functionalties such as:

### Italian PEC send mail action. 
So you will able to send valid PEC mails by using your PEC account and PEC mail address. 
> All out-of-the-box alfresco mail functionalities are keeped (i.e: template resolvers).

Remember to configure in alfresco-global.properties new pec properties:
```sh
pec.mail.host=
pec.mail.port=
pec.mail.username=
pec.mail.password=
pec.mail.encoding=UTF-8
pec.mail.protocol=smtps
pec.mail.smtps.auth=true
pec.mail.smtps.starttls.enable=true
```
### Attachment content node to mails.
A new MailActionExecuter alfresco mail action class to manage attachments. Moreover, I have corrected some bugs (i.e: CC and BCC address lists). 
Please put the generated classes to the standard java classpath:
```sh 
../alfresco/WEB-INF/classes/org/alfresco/repo/action/executer
```
Remember to use in your code the new MailActionExecuter.PARAM_ATTACHMENT boolean parameter to specify if you would attach content node to mail message.

# How to build it yourself
Clone the project, configure module properties and then run `mvn package`. So put the standard AMP file in your alfresco installation.

# Author
Francesco Fornasari
