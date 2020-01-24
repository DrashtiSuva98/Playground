class normal_room: 
    def calculates(self,no_rooms,days):
        if days ==1:
            rent =no_rooms * 300
            return rent
        elif days > 1 and days <=5:
            rent=no_rooms * days * 250
            return rent
        else:
            rent =no_rooms * days * 200
            return rent
        
class AC_room:
    def  AC_calculates(self,no_rooms,days):
        if days ==1:
            rent = no_rooms *450
            return rent
        elif days > 1 and days <=5:
            rent=no_rooms * days * 300
            return rent
        else:
            rent =no_rooms * days * 250
            return rent

class Suite_room:
    def Suite_calculates(self,no_rooms,days):
        if days ==1:
            rent =no_rooms * 550
            return rent
        elif days > 1 and days <=5:
            rent=no_rooms * days * 500
            return rent
        else:
            rent =no_rooms * days * 450
            return rent

class Hotel(normal_room,AC_room,Suite_room):
    def display(self,nm,add,mob,room,day,ch):
        print('Name: {}'.format(nm))
        print('Address: {}'.format(add))
        print('Mobile: {}'.format(mob))
        if ch==1:
            print('Room Rent = {}'.format(normal_room.calculates(self,room, day)))
        elif ch==2:
            print('Room Rent = {}'.format(AC_room.AC_calculates(self,room, day)))
        elif ch==3:
            print('Room Rent = {}'.format(Suite_room.Suite_calculates(self,room, day))         )
                
nm = input()
add = input()
mob = input()
norooms = int(input())
day = int(input())
choice = int(input())
h = Hotel()
h.display(nm,add,mob,norooms,day,choice)
