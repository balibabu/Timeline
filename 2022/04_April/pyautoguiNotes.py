
import pyautogui as pg
import time

#
print(pg.size()) #gives size of screen resolution

#
print(pg.position()) #gives the position of mouse in x and y coordinate

#
# ### mouse function

#
#move the cursor to the given position in given time
pg.moveTo(100,200,2) #3rd parameter is time of impact, it can be left blank

#
pg.moveRel(100,200) #this is relative move

#
# ### click function

#
pg.click(897,234,clicks=2,interval=1)

#
pg.click(1396,362,1,1,button="left")

#
# ### scroll function

#
#scroll up 500
pg.scroll(500)

#
#scroll down 500
pg.scroll(-500)

#
# ### mouse up and down

#
pg.mouseDown(1165,417,button='left')
pg.moveRel(200,0)
pg.mouseUp()

#
# ### keyboard function

#
import time
time.sleep(3)
pg.write('hello')
pg.press('space')
pg.write('world')
pg.press('enter')
pg.write('bye')

pyautogui.keyDown('shift')  # hold down the shift key
pyautogui.press('left')     # press the left arrow key
pyautogui.press('left')     # press the left arrow key
pyautogui.press('left')     # press the left arrow key
pyautogui.keyUp('shift')    # release the shift key

pyautogui.hotkey('ctrl', 'f')   # Use keys below

#
#
# ### Screenshot
#
im = pg.screenshot('temp.png',region=(0,0, 300, 400))


#
# ## Experiment

#
# ### experiment 1

#
for i in range(0,100,9):
    pg.mouseDown(1165+i,417+i,button='left')
    pg.moveRel(200-i*2,0)
    pg.moveRel(0,200-i*2)
    pg.moveRel(-200+i*2,0)
    pg.moveRel(0,-200+i*2)
    pg.mouseUp()

#
# ### experiment 2

#
pg.mouseDown(1530,417,button='left')
x,c=200,10
for i in range(0,10):
    pg.moveRel(x,0)
    pg.moveRel(0,x)
    x-=c
    pg.moveRel(-x,0)
    pg.moveRel(0,-x)
    x-=c
    
pg.mouseUp()

#
# ## Working Area

#
time.sleep(1)
pg.click(1396,362,clicks=1,interval=1)

#
for i in range(4):
    print(i)
    pg.mouseDown(1500,700,button='left')
    pg.moveRel(-200,0,.2)
    pg.mouseUp()
    time.sleep(1)

#



