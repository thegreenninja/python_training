####################################################
# This program animates a scene from Tom and Jerry #
####################################################



# Defining shapes needed to show impact of pan
wham=Label('WHAM!',338,75,bold=True,rotateAngle=50,size=35)
impact=Star(331,293,75,20,fill='orange',border='orangeRed',borderWidth=5,roundness=60)

###tom###
# Following steps draw the cartoon image of Tom

#Legs
Oval(191,343,30,130,fill='steelBlue')
Oval(234,343,30,130,fill='steelBlue')
#left-arm
Oval(241,247,30,130,fill='steelBlue',rotateAngle=-15)
#tail
Line(193,282,119,306,fill='steelBlue',lineWidth=8)
Line(119,306,54,296,fill='steelBlue',lineWidth=8)
Line(54,296,27,319,fill='steelBlue',lineWidth=8)
#torso
Oval(213,251,70,155,fill='steelBlue')
Oval(225,253,50,130,fill='gainsBoro')
#arm swings
swingArm=Oval(237,231,30,120,fill='steelBlue',rotateAngle=120)
#ears
Polygon(221,111,180,72,186,146,fill='steelBlue')
Polygon(205,107,185,86,187,130,fill='pink')
Polygon(238,105,251,72,269,131,fill='steelBlue')
Polygon(244,104,250,83,260,110,fill='pink')
#eyes
Circle(227,144,45,fill='steelBlue')
Oval(212,133,30,46,fill='yellow')
Oval(245,133,30,46,fill='yellow')
Line(203,111,224,118,fill='black',lineWidth=7)
Line(252,108,233,114,fill='black',lineWidth=7)
Circle(218,132,5,fill=gradient('black','green'))
Circle(253,134,5,fill=gradient('black','green'))
Oval(232,161,60,50,fill='white')
#whiskers
Line(228,152,196,148,fill='black',lineWidth=1)
Line(228,158,200,159,fill='black',lineWidth=1)
Line(232,158,204,170,fill='black',lineWidth=1)
Line(249,154,283,139,fill='black',lineWidth=1)
Line(249,154,284,158,fill='black',lineWidth=1)
Line(250,157,276,170,fill='black',lineWidth=1)
#nose
Oval(239,156,30,15,fill='black')
Oval(235,153,10,5,fill='white')
#mouth
Oval(227,176,20,15,fill='red')
arm=Oval(149,185,30,110,rotateAngle=140,fill='steelBlue')
#pan    
panHandle=Line(124,157,76,104,lineWidth=10,fill='black')
panFlat=Circle(81,113,40,fill='black')


###Jerry###

#Following steps draw the cartoon image of Jerry

ohOh=Label("oh oh",340,232,bold=True,rotateAngle=20)     # The next line(including this one) will show what Jerry says before Tom hits him.
dash=Line(339,248,338,264,fill='black')
#tail
Line(330,355,313,363,fill='peru',lineWidth=4)
Line(313,363,286,359,fill='peru',lineWidth=4)

#Legs    
Line(331,361,329,394,fill='peru',lineWidth=8)   
Line(342,361,350,394,fill='peru',lineWidth=8)
#arms
Oval(330,342,35,10,fill='peru',rotateAngle=160)
Oval(340,342,35,10,fill='peru',rotateAngle=1)
#face
Circle(324,297,15,fill='tan',border='peru',borderWidth=5)
Circle(351,297,15,fill='tan',border='peru',borderWidth=5)
Circle(338,311,20,fill='peru')
Oval(337,347,25,50,fill='peachPuff',border='peru',borderWidth=5)
#eyes
Oval(329,305,10,15,fill='white')
Circle(330,305,2,fill='black')    
Oval(348,305,10,15,fill='white')    
Circle(349,305,2,fill='black')
#nose&mouth
Oval(339,315,10,5,fill='black')    
Circle(337,324,5,fill='red')   
#whiskers
Line(339,315,314,313,fill='black',lineWidth=1)
Line(339,315,320,322,fill='black',lineWidth=1)
Line(339,315,356,315,fill='black',lineWidth=1)
Line(339,315,356,324,fill='black',lineWidth=1)

#Defining Functions

# The smash function creates necessary animation and shapes to visualize pan hitting Jerry
def smash():
    arm.visible=False
    panFlat.visible=False
    panHandle.visible=False
    swingArm.visible=True
    apanFlat.visible=True
    apanHandle.visible=True
    dash.visible=False
    ohOh.visible=False
    impact.visible=True
    wham.visible=True

# Smash Cleanup function cleans up shapes created during mouspress and returns the picture to original state
def smash_cleanup():
    impact.visible=False
    wham.visible=False
    arm.visible=True
    panFlat.visible=True
    panHandle.visible=True
    swingArm.visible=False
    apanFlat.visible=False
    apanHandle.visible=False
    dash.visible=True
    ohOh.visible=True



##Global Variables that mke up the pan after smash
apanFlat=Circle(336,297,40,fill='black')
apanHandle=Line(278,250,316,279,fill='black',lineWidth=10)

def onMousePress(x,y):
    smash()

def onMouseRelease(x,y):
    smash_cleanup()
    