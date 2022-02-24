def sum(numbers):
    sum = 0
    for x in numbers:
        sum = sum + x
    return sum

numL = [1, 2, 4, 10, 20, 30]
summ = sum(numL)
print(summ)
