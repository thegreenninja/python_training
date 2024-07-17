# background
Rect(0, 0, 400, 400, fill=rgb(230, 230, 255))

# Draw the cup.

Polygon(105,90,295,90,275,355,125,355,fill='ivory')
# Draw the bubbles.

Circle(190,280,15,fill='chocolate')
Circle(160,325,15,fill='sienna')
Circle(245,300,15,fill='sienna')
Circle(210,320,15,fill='chocolate')
# Now draw the tea inside the cup using two shapes.

Oval(200,120,165,30,fill='mediumPurple')
Polygon(117,120,283,120,266,345,134,345,fill='mediumPurple',opacity=70)
# Finally, draw the lid and the straw!

Oval(200,90,205,50,fill='dimGray')
Line(200,90,200,40,fill='skyBlue',lineWidth=30)