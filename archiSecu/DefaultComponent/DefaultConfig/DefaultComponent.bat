echo off

set RHAP_JARS_DIR=C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib
set FRAMEWORK_NONE_JARS=C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\oxf.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\anim.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\animcom.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\oxfInstMock.jar;
set FRAMEWORK_ANIM_JARS=C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\oxf.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\anim.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\animcom.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\oxfInst.jar;
set SOURCEPATH=%SOURCEPATH%
set CLASSPATH=%CLASSPATH%;.
set PATH=%RHAP_JARS_DIR%;%PATH%;
set INSTRUMENTATION=Animation   

set BUILDSET=Debug

if %INSTRUMENTATION%==Animation goto anim

:noanim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_NONE_JARS%
goto setEnv_end

:anim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_ANIM_JARS%

:setEnv_end

if "%1" == "" goto compile
if "%1" == "build" goto compile
if "%1" == "clean" goto clean
if "%1" == "rebuild" goto clean
if "%1" == "run" goto run

:clean
echo cleaning class files
if exist securityPattern\rejectedRights.class del securityPattern\rejectedRights.class
if exist securityPattern\requested.class del securityPattern\requested.class
if exist sysSCADA\recieveFromCenterByNet.class del sysSCADA\recieveFromCenterByNet.class
if exist sysSCADA\FieldUnit.class del sysSCADA\FieldUnit.class
if exist securityPattern\checkedPolicy.class del securityPattern\checkedPolicy.class
if exist sysSCADA\sysSCADA_pkgClass.class del sysSCADA\sysSCADA_pkgClass.class
if exist securityPattern\recieveRequestFromSingle.class del securityPattern\recieveRequestFromSingle.class
if exist secureSCADA\User.class del secureSCADA\User.class
if exist sysSCADA\offerService.class del sysSCADA\offerService.class
if exist securityPattern\protectedObject.class del securityPattern\protectedObject.class
if exist sysSCADA\user.class del sysSCADA\user.class
if exist sysSCADA\dataServer.class del sysSCADA\dataServer.class
if exist MainDefaultComponent.class del MainDefaultComponent.class
if exist sysSCADA\backData.class del sysSCADA\backData.class
if exist sysSCADA\request.class del sysSCADA\request.class
if exist sysSCADA\sendFeedback.class del sysSCADA\sendFeedback.class
if exist secureSCADA\Administrator.class del secureSCADA\Administrator.class
if exist securityPattern\reject.class del securityPattern\reject.class
if exist securityPattern\recieveDeniedAccess.class del securityPattern\recieveDeniedAccess.class
if exist securityPattern\user_securityPattern.class del securityPattern\user_securityPattern.class
if exist sysSCADA\FieldService.class del sysSCADA\FieldService.class
if exist secureSCADA\secureSCADA_pkgClass.class del secureSCADA\secureSCADA_pkgClass.class
if exist securityPattern\countRejected.class del securityPattern\countRejected.class
if exist securityPattern\rejected.class del securityPattern\rejected.class
if exist sysSCADA\backServiceInfo.class del sysSCADA\backServiceInfo.class
if exist securityPattern\approvedRights.class del securityPattern\approvedRights.class
if exist securityPattern\recieveCheck.class del securityPattern\recieveCheck.class
if exist sysSCADA\sendToCenter.class del sysSCADA\sendToCenter.class
if exist securityPattern\Rights.class del securityPattern\Rights.class
if exist securityPattern\backService.class del securityPattern\backService.class
if exist sysSCADA\doSomething.class del sysSCADA\doSomething.class
if exist securityPattern\checkPoint.class del securityPattern\checkPoint.class
if exist secureSCADA\LCReader.class del secureSCADA\LCReader.class
if exist securityPattern\counterMeasure.class del securityPattern\counterMeasure.class
if exist sysSCADA\centerController.class del sysSCADA\centerController.class
if exist securityPattern\approved.class del securityPattern\approved.class
if exist sysSCADA\backInteraction.class del sysSCADA\backInteraction.class
if exist sysSCADA\requestToCenter.class del sysSCADA\requestToCenter.class
if exist securityPattern\checkAgain.class del securityPattern\checkAgain.class
if exist securityPattern\recieveRequestFromUser.class del securityPattern\recieveRequestFromUser.class
if exist sysSCADA\recieveFromCenter.class del sysSCADA\recieveFromCenter.class
if exist securityPattern\SingleAccessPoint.class del securityPattern\SingleAccessPoint.class
if exist securityPattern\triedMorethanThreetimes.class del securityPattern\triedMorethanThreetimes.class
if exist securityPattern\securityPattern_pkgClass.class del securityPattern\securityPattern_pkgClass.class
if exist sysSCADA\triggerData.class del sysSCADA\triggerData.class
if exist sysSCADA\LocalController.class del sysSCADA\LocalController.class
if exist sysSCADA\interactHMI.class del sysSCADA\interactHMI.class
if exist securityPattern\SecurityPolicy.class del securityPattern\SecurityPolicy.class
if exist securityPattern\checkPolicy.class del securityPattern\checkPolicy.class
if exist sysSCADA\requestService.class del sysSCADA\requestService.class
if exist sysSCADA\sendToUser.class del sysSCADA\sendToUser.class
if exist secureSCADA\CCOwner.class del secureSCADA\CCOwner.class
if exist sysSCADA\commNetwork.class del sysSCADA\commNetwork.class
if exist securityPattern\checkRights.class del securityPattern\checkRights.class
if exist sysSCADA\distributeService.class del sysSCADA\distributeService.class
if exist sysSCADA\sendToLocal.class del sysSCADA\sendToLocal.class
if exist secureSCADA\Unknown.class del secureSCADA\Unknown.class
if exist sysSCADA\HMI.class del sysSCADA\HMI.class

if "%1" == "clean" goto end

:compile   
if %BUILDSET%==Debug goto compile_debug
echo compiling JAVA source files
javac  @files.lst
goto end

:compile_debug
echo compiling JAVA source files
javac -g  @files.lst
goto end

:run

java %2

:end


