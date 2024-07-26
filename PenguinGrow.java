app.background = gradient('white', 'aliceBlue')

# feet
Oval(125, 305, 20, 50, fill='orange', rotateAngle=50)
Oval(135, 310, 20, 50, fill='orange', rotateAngle=20)
Oval(145, 310, 20, 50, fill='orange', rotateAngle=-10)
Oval(275, 305, 20, 50, fill='orange', rotateAngle=-50)
Oval(265, 310, 20, 50, fill='orange', rotateAngle=-20)
Oval(255, 310, 20, 50, fill='orange', rotateAngle=10)

# wings
Oval(110, 150, 65, 120, rotateAngle=-40)
Oval(110, 160, 35, 110, fill='white', rotateAngle=-40)
Oval(290, 150, 65, 120, rotateAngle=40)
Oval(290, 160, 35, 110, fill='white', rotateAngle=40)

# belly
Oval(200, 150, 150, 230)
belly = Circle(200, 230, 70, fill='white', border='black', borderWidth=15)

# body
Oval(175, 160, 65, 180, fill='white')
Oval(225, 160, 65, 180, fill='white')
Circle(175, 110, 10)
Circle(225, 110, 10)
Polygon(185, 130, 215, 130, 205, 150, fill='orange')

# words
hungryLabel = Label("I'm full!", 320, 50, size=35, visible=False)

def onMousePress(mouseX, mouseY):
    
    belly.radius+=3
    if (belly.radius>=103):
        hungryLabel.visible=True

