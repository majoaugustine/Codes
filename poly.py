class Anime1:
    def __init__(self,name,hero):
        self.name=name
        self.hero=hero
    
    def printanime(self):
        print(self.name,self.hero)

class Anime2:
    def __init__(self,name):
        self.name=name
    
    def printanime(self):
        print(self.name)

x=Anime1('deathnote','light')
y=Anime2('Vinland Saga')
x.printanime()
y.printanime()

import datetime

z=datetime.datetime.now()
print(z)

username=input("enter username:")
print("username is:" +username)
