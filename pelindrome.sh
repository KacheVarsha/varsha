#!/bin/bash -x

echo "enter a number"
read num
pelindrome()
{
	echo $num
	num=$1
	temp=$num
	rev=""
	rem=0
	while [ $num -gt 0 ]
	do
		rem=$(($num%10))
		num=$(($num/10))
		rev=$( echo ${rev}${rem} )
	done
	if [ $rev -eq $temp ]
	then
		echo $temp "is pelindrome number"
	else
		echo $temp "is not pelindrome"
	fi
}
pelindrome $num
