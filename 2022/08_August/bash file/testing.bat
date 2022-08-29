@echo off
set /p MYNAME="Name: "
echo Your name is: "%MYNAME%"
python test.py %MYNAME%
PAUSE