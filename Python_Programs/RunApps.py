import tkinter as tk #Create the gui
from tkinter import filedialog, Text #Pick the paths and display some text
import os #Allows Run the apps through the app

root = tk.Tk()
apps =[] #Array that stores the paths added

if os.path.isfile("save.txt"):
    with open ("save.txt", "r") as f:
        tempApps = f.read()
        tempApps = tempApps.split(",")
        apps = [x for x in tempApps if x.split()]

def addApp():

    for widget in frame.winfo_children():
        widget.destroy()

    filename = filedialog.askopenfilename(initialdir="/", title="Select File",
    filetypes=(("executables","*.exe"), ("all files","*.*")))
    #Users can pick executable files and all files.
    apps.append(filename)
    for app in apps:
        label = tk.Label(frame, text=app, background= "white")
        label.pack()

def runApps():
    for app in apps:
        os.startfile(app)


#Setting the size of the canvas and its color
canvas = tk.Canvas(root, height=700, width=700, background="green")
canvas.pack()

frame = tk.Frame(root, background="white")
frame.place(relwidth=0.8, relheight=0.8, relx=0.1, rely=0.1)

openfile = tk.Button(root, text="Open File", padx=10, pady=5, background="light green" ,command=addApp)
openfile.pack()

runapps = tk.Button(root, text="Run Apps", padx=10, pady=5, background="light green", command=runApps)
runapps.pack()

for app in apps:
    label = tk.Label(frame, text=app)
    label.pack()


root.mainloop()


with open("save.txt", "w") as f:
    for app in apps:
        f.write(app + ",") 