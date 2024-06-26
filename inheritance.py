class Person:
    def __init__(self,fname,lname):
        self.firstname=fname
        self.lastname=lname
    def printname(self):
        print(self.firstname,self.lastname)
class Child(Person):
    def __init__(self,fname,lname,year):
        super().__init__(fname,lname)
        self.graduatyear=year
x=Child('leo','sukla','1992')

print(x.graduatyear)
