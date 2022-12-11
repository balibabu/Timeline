@ECHO OFF
ECHO ====== Timeline ======
ECHO Auto pulling, adding, commiting and pushing on Github.
D:
cd D:\Works_Space\Timeline
ECHO -------- Pulling --------
git pull
git status

ECHO -------- Adding --------
git add .
git status

ECHO -------- Commiting --------
git commit -m"updating classwork contents"

ECHO -------- Pushing --------
git push

ECHO Don't Have a Good Day, Have a Great Day
PAUSE
exit