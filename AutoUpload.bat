@ECHO OFF
ECHO ==== Timeline =====
ECHO Auto pulling, adding, commiting and pushing on Github.
ECHO ===================================================================================
D:
cd Works_Space\Timeline
git pull
git status
git add .
git status
git commit -m"auto uploaded by bat file"
git push
ECHO ===================================================================================
ECHO Everything Done. Bye, Have a Good Day (•‿•)
PAUSE
