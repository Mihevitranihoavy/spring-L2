@echo off
setlocal

rem Chemin de travail
set "work=D:\test\test2\sprint-L2"

rem Chemin vers les bibliothèques
set "libpath=C:\xampp\tomcat\lib\servlet-api.jar"
rem Répertoire de sortie pour les classes compilées
set "output=%work%\src\main\java"

rem Compiler les fichiers .java en .class
javac --source 17 --target 17 -cp "%libpath%" -d "%output%" "%output%\org\example\frontcontroller\*.java"

rem Aller au répertoire de sortie
cd /d "%output%\org\example\frontcontroller"

rem Créer le fichier JAR
jar cvfm frontcontrol.jar -C "%output%\org\example\frontcontroller" . -C %libpath% .

rem Copier le fichier JAR dans le répertoire de bibliothèques
copy frontcontrol.jar "%work%\lib"

rem Supprimer les fichiers .class temporaires
rem del "%output%\controller\*.class"

pause
