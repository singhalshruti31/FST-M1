numb = int(input("Enter any number :: "))
a = 0
b = 1
while b<=10 :
    a = a+numb
    print(numb,'*',b,'=',a)
    b = b+1

print("============================")
for i in range(1,11):
    print(numb,'*',i,'=',numb*i)