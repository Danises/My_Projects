#Creating my First Spam Program

import time, pyautogui
time.sleep(5)
f = open('filename.txt', encoding="utf-8")
for word in f:
    pyautogui.typewrite(word)
    pyautogui.press("enter")
