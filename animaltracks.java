app.background = gradient('wheat', 'tan', start='top')

def onMousePress(mouseX, mouseY):
   Oval(mouseX,mouseY+25,30,25,fill='darkGray',opacity=80)
   Oval(mouseX,mouseY+15,40,25,fill='darkGray',opacity=90)
   RegularPolygon(mouseX,mouseY-8,10,3,fill='darkGray')
   RegularPolygon(mouseX-20,mouseY-1,7,3,fill='darkGray',rotateAngle=90)
   RegularPolygon(mouseX+20,mouseY-1,7,3,fill='darkGray',rotateAngle=30)
