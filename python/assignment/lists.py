
#sum all items of a list***********
def sum_list(items):
    sum_numbers = 0
    for x in items:
        sum_numbers += x
    return sum_numbers
print(sum_list([1,2,-8]))

#  find min and max of a list**************
'''
lst = []
num = int(input('How many numbers: '))
for n in range(num):
    numbers = int(input('Enter number '))
    lst.append(numbers)
print("Maximum element in the list is :", max(lst), "\nMinimum element in the list is :", min(lst))

'''
#was to count the no. of strings where the string length is 2 or more and first and last character are same from a given list of strings
'''
def match_words(words):
  ctr = 0

  for word in words:
    if len(word) > 1 and word[0] == word[-1]:
      ctr += 1
  return ctr

print(match_words(['abc', 'xyz', 'aba', '1221']))
'''
#to find list of words that are longer than n from given list of words
'''
def long_words(n, str):
    word_len = []
    txt = str.split(" ")
    for x in txt:
        if len(x) > n:
            word_len.append(x)
    return word_len	
print(long_words(3, "hey its me vaishnavi dixit who are you "))
'''
#to get difference between two list
'''
def Diff(li1, li2): 
    li_dif = [i for i in li1 + li2 if i not in li1 or i not in li2] 
    return li_dif 
  
li1 = [10, 15, 20, 25, 30, 35, 40] 
li2 = [25, 40, 35] 
li3 = Diff(li1, li2) 
print(li3)
'''
#to select an item randomly from a list
'''
import random
color_list = ['Red', 'Blue', 'Green', 'White', 'Black']
print(random.choice(color_list))
#get frequency of every element in a list
import collections
my_list = [10,10,10,10,20,20,20,20,40,40,50,50,30]
print("Original List : ",my_list)
ctr = collections.Counter(my_list)
print("Frequency of the elements in the List : ",ctr)
'''
#change position of every nth value with n+1th in a list******************

'''
from itertools import zip_longest, chain, tee
def replace2copy(lst):
    lst1, lst2 = tee(iter(lst), 2)
    return list(chain.from_iterable(zip_longest(lst[1::2], lst[::2])))
n = [0,1,2,3,4,5]
print(replace2copy(n))

'''
# to convert a list of multiple integer into single integer

def convert(list): 
      
    # Converting integer list to string list 
    s = [str(i) for i in list] 
      
    # Join list items using join() 
    res = int("".join(s)) 
      
    return(res) 
  

list = [1, 2, 3] 
print(convert(list)) 

# to insert a given string at bginning of all items in list





