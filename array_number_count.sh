#!/bin/bash -x
a1=0
a2=0
a3=0
a4=0
a5=0
a6=0
for((i=1;i<=20;i++))
do
   var=$((RANDOM%6+1))
   echo $var
   if [ $var -eq 1 ]
   then
      ((a1++))
   elif [ $var -eq 2 ]
   then
      ((a2++))
   elif [ $var -eq 3 ]
   then
      ((a3++))
   elif [ $var -eq 4 ]
   then
      ((a4++))
    elif [ $var -eq 5 ]
   then
      ((a5++))
    elif [ $var -eq 6 ]
   then
      ((a6++))
   fi
done

array[0]=$a1
array[1]=$a2
array[2]=$a3
array[3]=$a4
array[4]=$a5
array[5]=$a6

echo ${array[@]}

