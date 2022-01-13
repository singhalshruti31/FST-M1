user1 = input("Enter name of user1 :: ")
user2 = input("Enter name of user2 :: ")
input1 = (input(user1+", please enter your input :: ")).lower()
input2 = (input(user2+", please enter your input :: ")).lower()

if(((input1=="rock")or(input1=="scissor")or(input1=="paper"))and((input2=="rock")or(input2=="scissor")or(input2=="paper"))):
    if input1==input2:
        print("Both users have tied the game")
    elif input1 == "rock":
        if input2 == "paper":
            print(user2+", Yay you won!!!")
        else: print(user1+", Yay you won!!")
    elif input1 == "scissor":
        if input2 == "rock":
            print(user2+", Yay you won!!")
        else: print(user1+", Yay you won!!")
    elif input1 == "paper":
        if input2 == "rock":
            print(user1+", Yay you won!!")
        else: print(user2+", Yay you won!!")
else: print("Wrong inputs are given")

con = input("Do you want to continue?(Enter yes or no) :: ")

while con == "yes":
    input1 = (input(user1+", please enter your input :: ")).lower()
    input2 = (input(user2+", please enter your input :: ")).lower()
    if(((input1=="rock")or(input1=="scissor")or(input1=="paper"))and((input2=="rock")or(input2=="scissor")or(input2=="paper"))):
        if input1==input2:
         print("Both users have tied the game")
        elif input1 == "rock":
            if input2 == "paper":
             print(user2+", Yay you won!!!")
            else: print(user1+", Yay you won!!")
        elif input1 == "scissor":
            if input2 == "rock":
                print(user2+", Yay you won!!")
            else: print(user1+", Yay you won!!")
        elif input1 == "paper":
            if input2 == "rock":
                print(user1+", Yay you won!!")
            else: print(user2+", Yay you won!!")
    else: print("Wrong inputs are given")
    con = input("Do you want to continue?(Enter yes or no) :: ")
    if con == "yes":
        continue
    elif con == "no":
        print("Program ended by user") 
        break
    else: 
        print("Invalid input by user, ending program")
        break