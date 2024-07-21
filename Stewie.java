#background
## Sky
Rect(0,0,400,400,fill='lightCyan')
##Grass
Rect(0,321,400,79,fill=gradient('lightGreen','chartreuse',start='top'),border='black')
##Clouds
Circle(23,54,40,fill='white',opacity=60)
Circle(67,45,40,fill='white',opacity=60)
Circle(53,104,40,fill='white',opacity=60)
Circle(120,85,40,fill='white',opacity=60,)
Circle(354,190,40,fill='white',opacity=60,)
Circle(385,228,40,fill='white',opacity=60,)
Circle(395,176,40,fill='white',opacity=60,)
##Sun
Circle(400,0,80,fill='yellow',border='black')
Line(383,87,377,101,fill='yellow')
Line(357,80,351,89,fill='yellow')
Line(339,66,329,75,fill='yellow')
Line(322,48,314,54,fill='yellow')
Line(313,25,301,28,fill='yellow')
Line(310,5,296,7,fill='yellow')


# Draw the ears
Circle(100,100,15,fill=gradient('papayaWhip','mocassin'),border='black')
Circle(300,100,15,fill=gradient('papayaWhip','mocassin'),border='black')
# Draw the torso
Circle(199,200,65,fill='gold',border='black')
#draw the arms

#pants
Rect(133,200,131,90,fill='crimson',border='black')
Line(199,230,199,290)
Line(199,230,207,224)
#Shoes
Oval(164,302,66,40,fill='lightsteelBlue',border='black')
Oval(233,302,66,40,fill='lightsteelBlue',border='black')

#Overalls
Rect(153,157,11,43,fill='crimson',border='black')
Circle(159,200,10,fill='yellow',border='black')
Rect(228,157,11,43,fill='crimson',border='black')
Circle(234,200,10,fill='yellow',border='black')
# Draw the face
Oval(200,100,210,125,fill=gradient('papayaWhip','mocassin'),opacity=99,border='black')
Circle(150,100,20,fill='white',border='black')
Circle(250,100,20,fill='white',border='black')
Circle(150,100,5,fill='black')
Circle(250,100,5,fill='black')
Line(200,100,211,113)
Line(211,113,200,120)
Line(141,69,171,79)
Line(227,79,255,67)
Line(184,136,218,136)
Line(218,136,210,127)
Line(206,136,199,144)
# Draw the hair
Line(106,72,111,77)
Line(119,63,122,67)
Line(131,54,134,61)
Line(148,48,150,56)
Line(165,42,166,51)
Line(184,39,184,49)
Line(201,39,201,50)
Line(219,39,218,50)
Line(236,43,235,54)
Line(251,48,250,55)
Line(267,53,266,59)
Line(282,63,280,67)
Line(293,73,290,76)
#left arm/rightarm
Oval(260,203,35,100,fill='gold',rotateAngle=-15,border='black')
Circle(274,238,20,fill=gradient('papayaWhip','moccasin'),border='black')
Oval(133,200,35,100,fill='gold',rotateAngle=15,border='black')
Circle(120,238,20,fill=gradient('papayaWhip','moccasin'),border='black')
#Stewie Text
Label('Stewie',199,370,size=50,font='monospace',bold=True)
