#!/usr/bin/env python3

nummer = int(input(': '))

if nummer > 1: 
  for i in range(2, nummer):
    if (nummer % i) == 0:
      print(nummer,'is geen priemgetal')
      break 
  else:
    print(nummer,'is een priemgetal')
else:
  print(nummer,'is geen priemgetal')


